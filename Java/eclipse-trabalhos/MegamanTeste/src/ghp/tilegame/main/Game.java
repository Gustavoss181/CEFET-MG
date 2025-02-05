package ghp.tilegame.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import ghp.tilegame.main.entities.Player;
import ghp.tilegame.main.gfx.*;
import ghp.tilegame.main.levels.Level;

public class Game extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 550, HEIGHT = 330, SCALE = 2, TILESIZE = 16;
	public static boolean running = false;
	public Thread gameThread;
	
	private BufferedImage spriteSheet;
	private static ImageManager im;
	
	private static Player player;
	private static Level level;
	
	public void init() {
		ImageLoader loader = new ImageLoader();
		
		spriteSheet = loader.load("/spriteMegaman.png");
		SpriteSheet ss = new SpriteSheet(spriteSheet);
		im = new ImageManager(ss);
		player = new Player(WIDTH-32, 414, im);
		
		ss = new SpriteSheet(loader.load("/spritesCenario.png"));
		im.tile(ss, 16);
		
		this.addKeyListener(new KeyManager());
		
		level = new Level(loader.load("/LevelTeste.png"));
	}
	
	public synchronized void start() {
		if(running)return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	public synchronized void stop() {
		if(!running)return;
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		final double amoutOfTicks = 60D;
		double ns = 1000000000/amoutOfTicks;
		double delta = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta+= (now - lastTime) / ns;
			lastTime = now;
			if(delta>=1) {
				tick();
				render();
				delta--;
			}
		}
		stop();
	}
	
	public void tick() {
		player.tick();
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		//RENDER HERE
		
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
		
		level.render(g);
		player.tender(g);
		
		//END RENDER
		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setFocusable(true);
		
		JFrame frame = new JFrame("MegamanX");
		frame.setSize(WIDTH * SCALE, HEIGHT * SCALE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
		frame.setVisible(true);
		
		game.init();
		game.start();
	}
	
	public static Level getLevel() {
		return level;
	}
	
	public static Player getPlayer() {
		return player;
	}
	
	public static ImageManager getImageManager() {
		return im;
	}

}
