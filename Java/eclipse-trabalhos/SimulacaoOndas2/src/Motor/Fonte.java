package Motor;

import java.util.Random;

public class Fonte {
	private int vel = 40,eixoY[] = new int[vel], amplitude=75, ale;
	private double angulo=0, frequencia=0, pulso = 0.72;
	
	public Fonte(double frequencia) {
		for(int i=0; i<vel; i++)
			eixoY[i] = 0;
		this.frequencia = frequencia;
	}
	
	public void onda(int indice) {
		eixoY[indice] = (int)Math.round(amplitude*-Math.sin(angulo*Math.PI/180) + 0*Math.cos(ale*Math.PI/180));
		//periodo
		angulo += frequencia;
		if(angulo>180)
			angulo=-180;
	}
	
	public void pulso(int indice) {
		eixoY[indice] = (int)Math.round(amplitude*Math.cos(angulo*Math.PI/180)) - this.amplitude;
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
		this.ale = new Random().nextInt(360);
		return eixoY[indice] + 300;
	}
	
	public double getAngulo() {
		return angulo;
	}
	
	public void reset() {
		for(int i=0; i<vel; i++)
			eixoY[i] = 0;
		this.angulo = 0;
		this.pulso = 0;
	}
}