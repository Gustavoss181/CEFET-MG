package ghp.tilegame.main.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {
	
	private BufferedImage[][] images;
	private int interval, index;
	private long timer, now, lastTime;
	
	public Animation(BufferedImage[][] images, int interval) {
		this.images = images;
		this.interval = interval;
		this.index = 0;
		this.timer = 0;
		this.now = 0;
		this.lastTime = System.currentTimeMillis();
	}
	
	public void tick(){
		now = System.currentTimeMillis();
		timer+= now - lastTime;
		lastTime = now;
		
		if(timer >= interval){
			index++;
			timer = 0;
			
			if(index >= images.length) {
				index = 0;
			}
		}
	}

	public void render(Graphics g, int x, int y, int w, int h, boolean lt, int aux){
		if(lt)
			g.drawImage(new SpriteSheet().mirror(images[aux][index]), x, y, w, h, null);
		else
			g.drawImage(images[aux][index], x, y, w, h, null);
	}
	
}
