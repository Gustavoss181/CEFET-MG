package pongGame;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Controle {
	
	public void movimentoBarras(JPanel player, int movimento) {
		player.setLocation(player.getX(), player.getY()+movimento);
	}
	
	public int IA(int velY, int velX, int posicaoX, int posicaoY, int alturaTela) {
		for(int i=posicaoX; i>108; i+=velX) {
			posicaoY+=velY;
			if(posicaoY>alturaTela || posicaoY<0)
				velY*=-1;
		}
		return posicaoY;
	}
	
	public void ponto(JPanel bolinha, JLabel placar) {
		
	}
	
}
