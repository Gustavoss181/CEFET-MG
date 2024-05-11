package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class DDDTutorial extends JFrame{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static JFrame F = new DDDTutorial();
	Screen screenObject = new Screen();
	
	public DDDTutorial() {
		add(screenObject);
		setSize(screenSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	}

}
