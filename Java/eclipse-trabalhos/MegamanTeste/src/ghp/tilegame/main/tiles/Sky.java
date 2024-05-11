package ghp.tilegame.main.tiles;

import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.ImageManager;

public class Sky extends Tile {
	
	public Sky(ImageManager im) {
		super(im);
	}

	public void tick() {
		
	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(im.skyTile, x, y, Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
	}
	
	public boolean isSolid() {
		return false;
	}
}