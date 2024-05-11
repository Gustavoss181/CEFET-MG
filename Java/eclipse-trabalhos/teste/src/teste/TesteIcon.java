package teste;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteIcon extends JFrame{
	
	JButton pause = new JButton(".");
	ImageIcon pauseIcon = new ImageIcon("imagens/pause.png");
	
	public TesteIcon() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1360, 500);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		pause.setBounds(30, 20, 100, 100);
		pause.setIcon(pauseIcon);
		
	}
	
	public static void main(String[] args) {
		new TesteIcon();
	}
	
}
