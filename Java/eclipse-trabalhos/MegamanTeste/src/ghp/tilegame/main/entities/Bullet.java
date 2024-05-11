package ghp.tilegame.main.entities;

import java.awt.Graphics;
import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.ImageManager;

public class Bullet {
	
	private int x, y, xo = 0, yo = 0;
	ImageManager im;
	private int speed = 10;
	private boolean visible = false;
	
	public Bullet(ImageManager im) {
		this.im = im;
	}
	
	public void tick() {
		if(x > 1200 || x < -100)
			visible = false;
		if(visible)
			move(speed);
	}
	
	public void move(int xs) {
		if(!collision(xs, 0))
			x += xs;
		else
			visible = false;
	}
	
	public boolean collision(int xs, int ys) {
		if(Game.getLevel().getTile((xo + xs + x)/(Game.TILESIZE * Game.SCALE), (yo + ys + y)/(Game.TILESIZE * Game.SCALE)).isSolid())
			return true;
		return false;
	}
	
	public void render(Graphics g) {
		if(visible)
			g.drawImage(im.bullet1, x, y, 100, 100, null);
	}
	
	public void setPosition(int x, int y, boolean left) {
		if(left) {
			this.x = x - 48;
			speed = -10;
		}else {
			this.x = x + 48;
			speed = 10;
		}
		this.y = y;
		this.visible = true;
	}
	
}
