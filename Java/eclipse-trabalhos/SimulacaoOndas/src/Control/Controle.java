package Control;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import Motor.*;

public class Controle extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public double f, duracaoPulso;
	public int nAtomos, tempo, A, tipoMove;
	public Corda[] corda;
	public Fonte fonte;
	public boolean pause = true;
	
	public Controle(double f, int A, int nAtomos, int tempo, int tipoMove, double duracaoPulso) {
		this.f = f;
		this.A = A;
		this.nAtomos = nAtomos;
		this.tempo = tempo;
		this.tipoMove = tipoMove;
		this.duracaoPulso = duracaoPulso;
		corda = new Corda[nAtomos];
		for(int i=0; i<nAtomos-1; i++) {
			corda[i] = new Corda();
		}
		fonte = new Fonte(f);
	}
	
	public void setFrequency(JSlider s, JLabel l,int control) {
		s.setValue(s.getValue() + control);
		f = s.getValue();
		f = f*2/100;
		l.setText(f + "Hz");
	}
	
	public void setDuracaoPulso(JSlider s, JLabel l,int control) {
		s.setValue(s.getValue() + control);
		duracaoPulso = s.getValue();
		duracaoPulso = duracaoPulso/100;
		l.setText(duracaoPulso + "s");
	}

	public void setAmplitude(JSlider s, JLabel l,int control) {
		s.setValue(s.getValue() + control);
		A = s.getValue()*5;
		l.setText(A + "px");
	}
	
	public void geraPulso() {
		fonte.setPulso(duracaoPulso*1000, A);
	}
	
	public void pause() {
		if(pause)
			pause = false;
		else
			pause = true;
	}
	
	public void reset() {
		for(int i=0; i<nAtomos-1; i++)
			corda[i].reset();
		fonte.reset();
	}
	
	public void move() {
		for(int i=nAtomos-2; i>0; i--) {
			corda[i].setVetorY(corda[i-1].getVetorY());
		}
		corda[0].setVetorY(fonte.getVetorY());
		if(tipoMove == 1)
			fonte.setFrAm(f, A);
	}	

}
