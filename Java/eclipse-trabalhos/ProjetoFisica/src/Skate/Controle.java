package Skate;

public class Controle {
	
	public int tempo = 3;
	boolean pause = true;
	Motor bolinha = new Motor();
	
	void movimento() {
		bolinha.movimento();
	}
	
	public void reset() {
		bolinha.reset();
	}
}
