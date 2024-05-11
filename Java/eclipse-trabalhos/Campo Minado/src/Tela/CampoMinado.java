package Tela;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CampoMinado extends JFrame{	
	
	static JFrame F = new CampoMinado();
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public CampoMinado() {
		double width = 600, height = 600;
		double x = (1400/2 - width/2);
		double y = (750/2 - height/2);
		add(new Tela());
		setBounds((int)x, (int)y, (int)width, (int)height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	}
}