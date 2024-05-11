	package ghp.tilegame.main.tiles;

import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.ImageManager;

public class Tile {
	
	protected ImageManager im;
	
	public static Tile grass = new GrassTile(Game.getImageManager());
	public static Tile dirt = new DirtTile(Game.getImageManager());
	public static Tile stone = new StoneTile(Game.getImageManager());
	public static Tile rock = new RockTile(Game.getImageManager());
	public static Tile tree = new TreeTile(Game.getImageManager());
	public static Tile wall = new WallTile(Game.getImageManager());
	
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
