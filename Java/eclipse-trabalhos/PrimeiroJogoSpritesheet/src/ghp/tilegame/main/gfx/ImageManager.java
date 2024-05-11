package ghp.tilegame.main.gfx;

import java.awt.image.BufferedImage;

public class ImageManager {
	
	public BufferedImage grassTile, dirtTile, rockTile, stoneTile, treeTile, wallTile;
	public BufferedImage[] playerUp, playerDn;
	
	public ImageManager(SpriteSheet ss) {
		playerUp = new BufferedImage[2];
			playerUp[0] = ss.crop(0, 0, 16, 16);
			playerUp[1] = ss.crop(0, 1, 16, 16);
		playerDn = new BufferedImage[2];
			playerDn[0] = ss.crop(0, 2, 16, 16);
			playerDn[1] = ss.crop(0, 3, 16, 16);
		grassTile = ss.crop(1, 0, 16, 16);
		dirtTile = ss.crop(6, 0, 16, 16);
		rockTile = ss.crop(3, 0, 16, 16);
		stoneTile = ss.crop(2, 0, 16, 16);
		treeTile = ss.crop(4, 0, 16, 16);
		wallTile = ss.crop(5, 0, 16, 16);
	}
	
}
