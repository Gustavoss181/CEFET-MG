package Motor;

public class Corda {//Imita o movimento da bolinha anterior bolinha
	private int eixoY[] = new int[40];
	
	
	public Corda(){
		for(int i=0; i<40; i++)
			eixoY[i] = 300;
	}
	
	public void setVetorY(int[] eixoY) {
		this.eixoY = eixoY;
	}
	
	public int[] getVetorY() {
		return this.eixoY.clone();
	}
	
	public int getPosicaoY(int indice) {
		return eixoY[indice];
	}
	
	public void reset() {
		for(int i=0; i<40; i++)
			eixoY[i] = 300;
	}
}
