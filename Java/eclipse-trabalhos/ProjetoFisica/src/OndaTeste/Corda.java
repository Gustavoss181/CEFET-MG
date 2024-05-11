package OndaTeste;

public class Corda {
	private int fase, vel = 40;
	private int[] eixoY = new int[vel], reflexao = new int[vel];
	
	public Corda(){
		for(int i=0; i<vel; i++) {
			eixoY[i] = 0;
			reflexao[i] = 0;
		}
		this.fase = 0;
	}
	
	public void setVetorY(int[] eixoY) {
		this.eixoY = eixoY;
	}
	
	public int[] getVetorY() {
		return this.eixoY.clone();
	}
	
	public void setReflexao(int[] reflexao, int fase) {
		this.reflexao = reflexao;
		this.fase = fase;
	}
	
	public int[] getReflexao() {
		return this.reflexao.clone();
	}
	
	public int getFase() {
		return this.fase;
	}
	
	public int getPosicaoY(int indice) {
		return eixoY[indice] + reflexao[indice]*fase;
	}
	
	public void reset() {
		for(int i=0; i<vel; i++)
			eixoY[i] = reflexao[i] = 0;
	}
}
