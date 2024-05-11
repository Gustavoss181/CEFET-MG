package OndaTeste;

public class Motor {
	
	private int eixoY[] = new int[100], indice=-1, amplitude=125;
	private double angulo=0, frequencia=0;
	
	public Motor(double frequencia) {
		this.frequencia = frequencia;
	}
	
	public Motor() {
		
	}
	
	public int onda() {
		indice++;
		eixoY[indice] = 300 + (int)Math.round(amplitude*-Math.sin(angulo*Math.PI/180));
		
		//periodo
		angulo += frequencia;
		if(angulo>180)
			angulo=-180;
		return eixoY[indice];
	}
	
	public int[] getY() {
		return eixoY;
	}
	
	public void setY(int[] eixoY) {
		this.eixoY = eixoY;
		this.indice = -1;
	}
	
	public void setFrAm(double Fr, int Am) {
		this.frequencia = Fr;
		//if((i<5 && i>-5) || (i>175 && i<-175))
			this.amplitude = Am;
	}
	
	public int getAmplitude() {
		return this.amplitude;
	}
	
	public double getFrequencia() {
		return this.frequencia;
	}
	
	public double getAngulo() {
		return angulo;
	}
	
	public void reset(double angulo, double fr) {
		this.angulo = angulo;
		this.frequencia = fr;
	}
	
}
