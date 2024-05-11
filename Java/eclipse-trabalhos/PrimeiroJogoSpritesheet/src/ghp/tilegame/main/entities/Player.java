package ghp.tilegame.main.entities;

import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.Animation;
import ghp.tilegame.main.gfx.ImageManager;

public class Player{
	
	private int x, y, xo, yo, xs, ys;
	private ImageManager im;
	public boolean up = false, dn = false, lt = false, rt = false;
	private final int SPEED = 3, SIZE = 16;
	
	private Animation upAnimation, dnAnimation;
	
	public Player(int x, int y, ImageManager im) {
		this.x = x;
		this.y = y;
		xo = 0;
		yo = 0;
		xs = 0;
		ys = 0;
		this.im = im;
		
		upAnimation = new Animation(im.playerUp, 500);
		dnAnimation = new Animation(im.playerDn, 500);
	}
	
	public void tick() {
		xs = 0;
		ys = 0;
		if(up) {
			ys-= SPEED;
		}else if(dn) {
			ys+= SPEED;
		}
			
		if(lt) {
			xs-= SPEED;
		}else if(rt) {
			xs+= SPEED;
		}
		
		move(xs, ys);
		
		upAnimation.tick();
		dnAnimation.tick();
	}
	
	public void move(int xs, int ys) {
		if(!collision(xs, 0))
			xo += xs;
		if(!collision(0, ys))
			yo += ys;
	}
	
	public boolean collision(int xs, int ys) {
		if(Game.getLevel().getTile((xo + xs + x + 1)/(Game.TILESIZE * Game.SCALE), (yo + ys + y + 1)/(Game.TILESIZE * Game.SCALE)).isSolid())
			return true;
		if(Game.getLevel().getTile((xo + xs + x + SIZE*Game.SCALE - 2)/(Game.TILESIZE * Game.SCALE), (yo + ys + y + 1)/(Game.TILESIZE * Game.SCALE)).isSolid())
			return true;
		if(Game.getLevel().getTile((xo + xs + x + 1)/(Game.TILESIZE * Game.SCALE), (yo + ys + y + SIZE*Game.SCALE - 2)/(Game.TILESIZE * Game.SCALE)).isSolid())
			return true;
		if(Game.getLevel().getTile((xo + xs + x + SIZE*Game.SCALE - 2)/(Game.TILESIZE * Game.SCALE), (yo + ys + y + SIZE*Game.SCALE - 2)/(Game.TILESIZE * Game.SCALE)).isSolid())
			return true;
		return false;
	}
	
	public void tender(Graphics g) {
		//g.drawImage(im.player, x, y, Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
		if(up)
			upAnimation.render(g, x, y, Game.TILESIZE * Game.SCALE, Game.TILESIZE * Game.SCALE);
		else
			dnAnimation.render(g, x, y, Game.TILESIZE * Game.SCALE, Game.TILESIZE * Game.SCALE);
	}
	
	public int getXo() {
		return xo;
	}
	
	public int getYo() {
		return yo;
	}

}
