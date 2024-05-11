package ghp.tilegame.main.gfx;

import java.awt.image.BufferedImage;

public class ImageManager {
	
	public BufferedImage blockTile, skyTile, ladderTile, bullet1;
	public BufferedImage[][] playerStop, playerRun, playerJump;
	
	public ImageManager(SpriteSheet ss) {
		bullet1 = ss.cropPlayer(15, 12, 48, 48);
		playerStop = new BufferedImage[2][3];
		for(int j=0; j<playerStop.length; j++)
			for(int i=0; i<playerStop.length; i++)
				playerStop[j][i] = ss.cropPlayer(i, j, 48, 48);
		playerRun = new BufferedImage[2][4];
		for(int j=0; j<playerRun.length; j++)
			for(int i=0; i<playerRun.length; i++)
				playerRun[j][i] = ss.cropPlayer(i+3, j, 48, 48);
		playerJump = new BufferedImage[2][4];
		for(int j=0; j<playerJump.length; j++)
			for(int i=0; i<playerJump.length; i++)
			playerJump[j][i] = ss.cropPlayer(i+7, j, 48, 48);
	}
	
	public void tile(SpriteSheet ss, int large) {
		blockTile = ss.crop(0, 0, large, large);
		skyTile = ss.crop(1, 0, large, large);
		ladderTile = ss.crop(2, 0, large, large);
	}
	
}
