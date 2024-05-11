package pongGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Tela extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	Random ale = new Random();
	Controle controle = new Controle();
	JPanel bolinha = new JPanel(), player1 = new JPanel(), player2 = new JPanel();
	int x=3, y=-3, telaH = 720-20, telaW = 1380-20, playerH, playerW;
	JLabel placarP1 = new JLabel("0"), placarP2 = new JLabel("0");
	
	int posicaoYP1=telaH/2, posicaoYP2=telaH/2;
	
	public Tela() {
		editarJanela();
		elementosTela();
		actions();
		new Movimento().start();
	}
	
	public void editarJanela() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(telaW, telaH);
		getContentPane().setBackground(Color.BLACK);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
	}
	
	public void elementosTela() {
		bolinha.setBorder(new LineBorder(Color.WHITE, 10, true));
		bolinha.setBackground(Color.BLACK);
		bolinha.setBounds(telaW/2-5, telaH/2-5, 10, 10);
		getContentPane().add(bolinha);
		
		player1.setBounds(100, 50, 5, 150);
		player1.setBackground(Color.WHITE);
		getContentPane().add(player1);
		
		player2.setBounds(telaW-100, 50, 5, 150);
		player2.setBackground(Color.WHITE);
		getContentPane().add(player2);
		
		placarP1.setFont(new Font("SquareFont", Font.PLAIN, 100));
		placarP1.setForeground(Color.WHITE);
		placarP1.setHorizontalAlignment(SwingConstants.CENTER);
		placarP1.setBounds(telaW/2 - 120, 50, 100, 100);
		getContentPane().add(placarP1);
		
		placarP2.setFont(new Font("SquareFont", Font.PLAIN, 100));
		placarP2.setForeground(Color.WHITE);
		placarP2.setHorizontalAlignment(SwingConstants.CENTER);
		placarP2.setBounds(telaW/2 + 80, 50, 100, 100);
		getContentPane().add(placarP2);
	}

	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(10);}catch(Exception e) {}
				
				bolinha.setLocation(bolinha.getX()+x, bolinha.getY()+y);
				
				if(bolinha.getX() < 80) {
					placarP2.setText((Integer.parseInt(placarP2.getText()) + 1) + "");
					bolinha.setLocation(telaW/2, telaH/2);
					x=3;
				}
				if(bolinha.getX() > telaW-80) {
					placarP1.setText((Integer.parseInt(placarP1.getText()) + 1) + "");
					bolinha.setLocation(telaW/2, telaH/2);
					x=3;
				}
					
				if(bolinha.getY() < 0 || bolinha.getY() > telaH)
					y*= -1;
				
				//condição de colisão com a barra
				if((bolinha.getY()>player2.getY() && bolinha.getY()<player2.getY()+player2.getHeight()))
					if(bolinha.getX()>=player2.getX()-10 && x>0 ) {
						x*= -1;
						bolinha.setLocation(player2.getX(), bolinha.getY());
						posicaoYP1 = controle.IA(y, x, bolinha.getX(), bolinha.getY(), telaH)-player1.getHeight()/2;
						//facil
						//posicaoYP1+= ale.nextInt(2*player1.getHeight()+5)-player1.getHeight();
					}
				if((bolinha.getY()>player1.getY() && bolinha.getY()<player1.getY()+player1.getHeight()))
					if(bolinha.getX()<=player1.getX()+10 && x<0) {
						x*= -1;
						bolinha.setLocation(player1.getX()+player1.getWidth(), bolinha.getY());
						x+= ale.nextInt(2);
					}
				
				if(player1.getY() < posicaoYP1 && player1.getY() < telaH-player1.getHeight())
					controle.movimentoBarras(player1, 10);
				if(player1.getY() > posicaoYP1 && player1.getY() > 0)
					controle.movimentoBarras(player1, -10);
			}
		}
	}

	public void actions() {
		addKeyListener( new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e) {
				if((e.getKeyChar() == 'ç' || e.getKeyChar() == 'Ç') && player2.getY() > 0)
					controle.movimentoBarras(player2, -10);
				if(e.getKeyChar() == '.' && player2.getY()<telaH-player2.getHeight())
					controle.movimentoBarras(player2, 10);
			}
			//métodos obrigatórios
			@Override
			public void keyTyped(KeyEvent e){}
			@Override
			public void keyReleased(KeyEvent e) {}
		});		
	}

}
