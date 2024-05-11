package ghp.tilegame.main.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	public SpriteSheet() {
		
	}
	
	public BufferedImage crop(int col, int row, int w, int h) {
		return sheet.getSubimage(col * 16, row * 16, w, h);
	}
	
	public BufferedImage cropPlayer(int col, int row, int w, int h) {
		return sheet.getSubimage(col * 51 + 1, row * 51 + 1, w, h);
	}
	
	/*public BufferedImage cropPlayerInverted(int col, int row, int w, int h) {
		BufferedImage inverted = new BufferedImage(w, h, sheet.getSubimage(col * 51 + 1, row * 51 + 1, w, h).TYPE_INT_ARGB);
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				inverted.setRGB((w-1)-j, i, sheet.getSubimage(col * 51 + 1, row * 51 + 1, w, h).getRGB(j, i));
			}
		}
		return inverted;
	}*/
	
	public BufferedImage mirror(BufferedImage image) {
		int w = image.getWidth();
		int h = image.getHeight();
		BufferedImage inverted = new BufferedImage(w, h, image.TYPE_INT_ARGB);
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				inverted.setRGB((w-1)-j, i, image.getRGB(j, i));
			}
		}
		return inverted;
	}
}
