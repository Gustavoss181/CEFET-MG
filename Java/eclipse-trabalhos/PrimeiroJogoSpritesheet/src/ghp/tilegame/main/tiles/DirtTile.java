package ghp.tilegame.main.tiles;

import java.awt.Graphics;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.gfx.ImageManager;

public class DirtTile extends Tile {
	
	public DirtTile(ImageManager im) {
		super(im);
	}

	public void tick() {
		
	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(im.dirtTile, x, y, Game.TILESIZE*Game.SCALE, Game.TILESIZE*Game.SCALE, null);
	}
	
}
