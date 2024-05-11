package Control;

import Motor.Motor;

public class Controle {
	
	public int tempo = 3;
	public boolean pause = true;
	public Motor bolinha = new Motor();
	
	public void movimento() {
		bolinha.movimento();
	}
	
	public void reset() {
		bolinha.reset();
	}
}
