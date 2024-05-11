package teste;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DesenhaLinha extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, width, height);
	}
	
	public static void main(String[] args) {
		DesenhaLinha linha = new DesenhaLinha();
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setSize(300, 300);
		jf.setVisible(true);
		jf.add(linha);
	}
	
}
