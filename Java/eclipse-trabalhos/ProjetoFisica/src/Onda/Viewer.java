package Onda;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Viewer extends JFrame{
	
	Random random = new Random();
	int nAtomos = 100;
	JPanel[] panel = new JPanel[nAtomos];
	Motor[] atomo = new Motor[nAtomos];
	float x=1, tempo=0;
	
	public Viewer() {
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1360, 500);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		for(int i=0; i<nAtomos; i++) {
			int r, g=0, b=0;
			if(i%9 == 0) {
				r = 0;
				g = 255;
			}else {
				r = 255;
				g = 0;
			}
			panel[i] = new JPanel();
			panel[i].setBorder(new LineBorder(new Color(r, g, b), 10, true));
			panel[i].setBounds(150+i*10, 300, 10, 10);
			getContentPane().add(panel[i]);
			atomo[i] = new Motor(i);
		}
	}

	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(2);}catch(Exception e) {}
				move();
			}
		}
	}
	
	public void move() {
		for(int i=0; i<nAtomos; i++) {
			panel[i].setBounds(panel[i].getX(), 350 + atomo[i].Y(), panel[i].getWidth(), panel[i].getHeight());
		}
		atomo[0].ale = random.nextInt(180);
		for(int i=nAtomos-1; i>0; i--){
			atomo[i].ale = atomo[i-1].ale;
		}
		if(atomo[0].i<=-360)
			tempo++;
	}
	
	public static void main(String[] args) {
		new Viewer();
	}
	
}