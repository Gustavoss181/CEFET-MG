package Motor;

public class Fonte {//Gera o movimento da primeira bolinha
	private int eixoY[] = new int[40], amplitude=125;
	private double angulo=0, frequencia=0, pulso = 0.72;
	
	public Fonte(double frequencia) {
		for(int i=0; i<40; i++)
			eixoY[i] = 300;
		this.frequencia = frequencia;
	}
	
	public void onda(int indice) {
		eixoY[indice] = 300 + (int)Math.round(amplitude*-Math.sin(angulo*Math.PI/180));
		//periodo
		angulo += frequencia;
		if(angulo>180)
			angulo=-180;
	}
	
	public void pulso(int indice) {
		eixoY[indice] = (300 - amplitude) + (int)Math.round((amplitude)*Math.cos(angulo*Math.PI/180));
		if(angulo<360)
			angulo+= pulso;
		if(angulo >= 90 && angulo<=270) {
			angulo = 270;
		}
	}
	
	public void setFrAm(double Fr, int Am) {
		this.frequencia = Fr;
		this.amplitude = Am;
	}
	
	public void setPulso(double duracao, int amplitude) {
		this.pulso = 360/duracao;
		this.amplitude = amplitude;
		this.angulo = 0;
	}
	
	public int[] getVetorY() {
		return eixoY.clone();
	}
	
	public int getPosicaoY(int indice) {
		return eixoY[indice];
	}
	
	public double getAngulo() {
		return angulo;
	}
	
	public void reset() {
		for(int i=0; i<40; i++)
			eixoY[i] = 300;
		this.angulo = 0;
		this.pulso = 0;
	}
}
