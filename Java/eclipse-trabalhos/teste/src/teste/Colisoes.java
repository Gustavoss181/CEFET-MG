package teste;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import javax.swing.border.LineBorder;

public class Colisoes extends JFrame{
	
	Random ale = new Random();
	JPanel bolinha = new JPanel();
	int x = ale.nextInt(10) - 5, y = ale.nextInt(10) - 5;
	int telaAltura = 300-60, telaLargura = 600-50;
	
	public Colisoes() {
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(telaLargura+40, telaAltura+50);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		bolinha.setBorder(new LineBorder(new Color(0, 0, 0), 20, true));
		// bolinha.setBounds(ale.nextInt(getWidth()-bolinha.getWidth()), ale.nextInt(getHeight()-bolinha.getHeight()), 20, 20);
		bolinha.setBounds(0, 0, 20, 20);
		getContentPane().add(bolinha);
	}

	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(10);}catch(Exception e) {}
				bolinha.setBounds(bolinha.getX()+x, bolinha.getY()+y, bolinha.getHeight(), bolinha.getWidth());
				if(bolinha.getX() < 0 || bolinha.getX() > telaLargura)
					x*= -1;
				if(bolinha.getY() < 0 || bolinha.getY() > telaAltura)
					y*= -1;
			}
		}
	}
	
	public static void main(String[] args) {
		new Colisoes();
	}
}