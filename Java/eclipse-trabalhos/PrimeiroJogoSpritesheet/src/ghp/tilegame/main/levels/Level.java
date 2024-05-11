package ghp.tilegame.main.levels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import ghp.tilegame.main.Game;
import ghp.tilegame.main.tiles.Tile;

public class Level {
	
	private int[][] tiles;
	private int h, w;
	
	public Level(BufferedImage levelImage) {
		h = levelImage.getHeight();
		w = levelImage.getWidth();
		loadLevel(levelImage);
	}
	
	public void loadLevel(BufferedImage levelImage) {
		tiles = new int[w][h];
		for(int y=0; y < h; y++) {
			for(int x=0; x < w; x++) {
				Color c = new Color(levelImage.getRGB(x, y));
				String h = String.format("%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
				switch(h) {
					case "00ff00"://grass - 1
						tiles[x][y] = 1;
						break;
					case "7f6a00"://dirt - 2
						tiles[x][y] = 2;
						break;
					case "404040"://stone - 3
						tiles[x][y] = 3;
						break;
					case "808080"://rock - 4
						tiles[x][y] = 4;
						break;
					case "7f0000"://tree - 5
						tiles[x][y] = 5;
						break;
					case "ff6a00"://wall - 6
						tiles[x][y] = 6;
						break;
					default:
						tiles[x][y] = 1;
						break;
				}
			}
		}
	}
	
	public void render(Graphics g) {
		int xo = Game.getPlayer().getXo();
		int yo = Game.getPlayer().getYo();
		
		int x0 = Math.max(xo / (Game.TILESIZE * Game.SCALE), 0);
		int y0 = Math.max(yo / (Game.TILESIZE * Game.SCALE), 0);
		int x1 = Math.min((xo + Game.WIDTH * Game.SCALE) / (Game.TILESIZE * Game.SCALE) + 1, w);
		int y1 = Math.min((yo + Game.HEIGHT * Game.SCALE) / (Game.TILESIZE * Game.SCALE) + 1, h);
		
		for(int y = y0; y < y1; y++) {
			for(int x = x0; x < x1; x++) {
				getTile(x, y).render(g, x * Game.TILESIZE * Game.SCALE - xo, y * Game.TILESIZE * Game.SCALE - yo);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		if(x<0 || y<0 || x>=w || y>=h)
			return Tile.grass;
		else
			switch(tiles[x][y]) {
				case 1:
					return Tile.grass;
				case 2:
					return Tile.dirt;
				case 3:
					return Tile.stone;
				case 4:
					return Tile.rock;
				case 5:
					return Tile.tree;
				case 6:
					return Tile.wall;
				default:
					return Tile.grass;
			}
	}
	
}







