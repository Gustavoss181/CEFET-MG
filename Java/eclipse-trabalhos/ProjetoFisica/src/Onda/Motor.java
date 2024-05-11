package Onda;

import java.lang.Math;

public class Motor{
	
	public int ale=90;
	private int eixoY, amplitude=100;
	public double i=0, frequencia=0.5;
	
	public Motor(double i) {
		this.i = i*-40*frequencia;
	}
	
	public int Y() {
		if(i>0 && i<=360)
			eixoY = (int)Math.round(amplitude*-Math.sin(i*Math.PI/180) + 100*Math.cos(ale*Math.PI/180));
		
		if(i>=360)
			i=0;
		//periodo
		i += frequencia;
		return eixoY;
	}
	
	public void getAmplitude(int amplitude) {
		this.amplitude = amplitude;
	}
	
	public void getFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}
	
}
