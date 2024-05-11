package ghp.tilegame.main.entities;

import java.awt.Color;
import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.Animation;
import ghp.tilegame.main.gfx.ImageManager;

public class Player{
	
	private int x, fiXed, y, fiYed, xo, xs, aux = 14*3-7, auy = 11*3;
	private double yo, ys;
	public boolean up = false, dn = false, lt = false, rt = false, moveLeft = false, jump = false, z = false, climb = false;
	public int handAction = 0;
	private final int SPEED = 3, G = 50;
	private int pH = 20*2-2, pW = 11*2+4;
	private int pProportion = 95;
	
	int tamanho = Game.TILESIZE * Game.SCALE;
	boolean noChao = false;
	public int tempoBala = 0;
	
	private Bullet[] bullet = new Bullet[10];
	private int bulletIndex = 0;
	private Animation stopAnimation, runAnimation, jumpAnimation;
	
	public Player(int x, int y, ImageManager im) {
		this.x = fiXed = x;
		this.y = fiYed = y;
		xo = 0;
		yo = 400;
		xs = 0;
		ys = 0;
		
		for(int i=0; i<bullet.length; i++) {
			bullet[i] = new Bullet(im);
		}
		
		stopAnimation = new Animation(im.playerStop, 750);
		runAnimation = new Animation(im.playerRun, 150);
		jumpAnimation = new Animation(im.playerJump, 150);
	}
	
	public void tick() {
		if(tempoBala <= 10)
			tempoBala++;
		
		xs = 0;
		
		if(y>550) {
			ys = xo = 0;
			y = fiYed;
			x = fiXed;
		}
		if(z && ys==0 && noChao) {
			jump();
			noChao = false;
		}
		
		ys = ys + G*0.01;
		
		if(lt) {
			xs-= SPEED;
		}else if(rt) {
			xs+= SPEED;
		}
			
		move(xs, (int)ys);
		
		jumpAnimation.tick();
		stopAnimation.tick();
		runAnimation.tick();
		for(int i=0; i<bullet.length; i++)
			bullet[i].tick();
	}
	
	public void move(int xs, int ys) {
		if(!collision(xs, 0))
			if(x>=fiXed)
				xo += xs;
			if(xo<0)
				x += xs;
		
		//System.out.println(fiXed);
		
		if(!collision(0, ys))
			y += ys;
		else {
			this.ys=0;
			jump = false;
		}
	}
	
	public boolean collision(int xs, int ys) {
	    if(Game.getLevel().getTile((xo + xs + x + aux)/(this.tamanho), ((int)yo + ys + y + auy)/(this.tamanho)).isSolid())
	      return true;
	    if(Game.getLevel().getTile((xo + xs + x + aux + pW)/(this.tamanho), ((int)yo + ys + y + auy)/(this.tamanho)).isSolid())
	      return true;
	    if(Game.getLevel().getTile((xo + xs + x + aux)/(this.tamanho), ((int)yo + ys + y + auy + pH)/(this.tamanho)).isSolid()) {
	    	noChao = true;
	      return true;
	    }
	    if(Game.getLevel().getTile((xo + xs + x + aux + pW)/(this.tamanho), ((int)yo + ys + y + auy + pH)/(this.tamanho)).isSolid()) {
	    	noChao = true;
	      return true;
	    }
	    if(Game.getLevel().getTile((xo + xs + x + aux + pW)/(this.tamanho), ((int)yo + ys + y + auy + pH/2)/(this.tamanho)).isSolid())
	      return true;
	    if(Game.getLevel().getTile((xo + xs + x + aux)/(this.tamanho), ((int)yo + ys + y + auy + pH/2)/(this.tamanho)).isSolid())
	      return true;
	    return false;
	  }
	
	public void jump() {
		ys = -10.3;
		//ys = -15.3;
		jump = true;
	}
	
	public void shot() {
		
		bullet[bulletIndex].setPosition(x, y, moveLeft);
		
		if(bulletIndex<9)
			bulletIndex++;
		else
			bulletIndex = 0;
	}
	
	public void climb() {
		
	}
	
	public void tender(Graphics g) {
		if(ys!=0 && jump)
			jumpAnimation.render(g, x, y, pProportion, pProportion, moveLeft, handAction);
		else if(rt||lt)
			runAnimation.render(g, x, y, pProportion, pProportion, moveLeft, handAction);
		else
			stopAnimation.render(g, x, y, pProportion, pProportion, moveLeft, handAction);
		
		for(int i=0; i<bullet.length; i++)
			bullet[i].render(g);
		
		//g.setColor(new Color(255, 0, 0, 127));;
		//g.fillRect(x + aux, y+auy, pW, pH);
	}
	
	public int getXo() {
		return xo;
	}
	
	public int getYo() {
		return (int)yo;
	}

}
