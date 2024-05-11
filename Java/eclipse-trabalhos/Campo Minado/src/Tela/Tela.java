package Tela;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Tela extends JPanel{
	
	static boolean mouseClick = false;
	
	public Tela() {
		addMouseListener(new Mouse());
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		int scale = 60;
		for(int i=1; i<600/scale; i++)
			g.drawLine(i*scale, 0, i*scale, 600);
		for(int i=1; i<600/scale; i++)
			g.drawLine(0, i*scale, 600, i*scale);
		
	}
}
