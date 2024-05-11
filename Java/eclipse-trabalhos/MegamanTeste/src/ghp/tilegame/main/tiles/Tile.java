	package ghp.tilegame.main.tiles;

import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.ImageManager;

public class Tile {
	
	protected ImageManager im;
	
	public static Tile block = new Block(Game.getImageManager()), sky = new Sky(Game.getImageManager()), limbo = new Limbo(Game.getImageManager());
	public static Tile ladder = new Ladder(Game.getImageManager());
	
	public Tile(ImageManager im) {
		this.im = im;
	}
	
	public void tick() {
		
	}
	public void render(Graphics g, int x, int y) {
		
	}
	
	public boolean isSolid() {
		return false;
	}
	
}
