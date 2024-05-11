package OndaTeste;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Control extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public double f, duracaoPulso;
	public int nAtomos, tempo, A, tipoMove, fase;
	public Corda[] corda;
	public Fonte fonte;
	public boolean pause = true;
	
	public Control(double f, int A, int nAtomos, int tempo, int tipoMove, double duracaoPulso, int fase) {
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
		this.fase = fase;
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
		
				corda[nAtomos-2].setVetorY(corda[nAtomos-3].getVetorY());
			for(int i=0; i<nAtomos-2; i++)
				corda[i].setReflexao(corda[i+1].getReflexao(), corda[i+1].getFase());
			corda[nAtomos-3].setReflexao(corda[nAtomos-3].getVetorY(), this.fase);
		
		for(int i=nAtomos-3; i>0; i--) {
			corda[i].setVetorY(corda[i-1].getVetorY());
		}
		corda[0].setVetorY(fonte.getVetorY());
		fonte.setFrAm(f, A);
	}	

}
