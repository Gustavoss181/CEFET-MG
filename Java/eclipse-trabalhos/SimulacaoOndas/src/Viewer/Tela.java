package Viewer;

import Control.Controle;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	int cont=-1;
	Controle c;
	//Atributos GUI
	JPanel[] panel;
	JButton menosF = new JButton("<"), menosA = new JButton("<"), pause = new JButton("||/>"), reset = new JButton("Resetar"), geraPulso = new JButton("^");
	JButton maisF = new JButton(">"), maisA = new JButton(">");
	JSlider sliderF = new JSlider(), sliderA = new JSlider();
	JLabel labelF = new JLabel("1.50Hz"), labelA = new JLabel("125px"), titleF = new JLabel("Frequência"), titleA = new JLabel("Amplitude");
	ButtonGroup tempo = new ButtonGroup(), pulsOnda = new ButtonGroup();
	JRadioButton normal = new JRadioButton("normal"), lento = new JRadioButton("lento"), onda = new JRadioButton("Oscilador"), pulso = new JRadioButton("Pulso");
	JPanel barra = new JPanel(), roda = new JPanel(), bolinha = new JPanel(), linha = new JPanel();
	
	public Tela(double f, int A, int nAtomos, int tempo, int tipoMove, double duracaoPulso) {
		c = new Controle(f, A, nAtomos, tempo, tipoMove, duracaoPulso);
		panel = new JPanel[c.nAtomos];
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1360, 500);
		getContentPane().setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
	
		objetos();
		actions();
		detalhes();
	}

	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(c.tempo);}catch(Exception e) {}
				if(c.pause) {
					cont++;
					if(cont >= 40) {
						c.move();
						cont = 0;
					}
					if(c.tipoMove == 1)
						c.fonte.onda(cont);
					else
						c.fonte.pulso(cont);
					panel[0].setBounds(panel[0].getX(), c.fonte.getPosicaoY(cont), panel[0].getWidth(), panel[0].getHeight());
					for(int i=1; i<c.nAtomos; i++)
						panel[i].setBounds(panel[i].getX(), c.corda[i-1].getPosicaoY(cont), panel[i].getWidth(), panel[i].getHeight());
					
					barra.setBounds(panel[0].getX(), panel[0].getY(), panel[0].getWidth(), 460 - panel[0].getY());
					if(c.tipoMove == 1) {
						double aux1 = (c.fonte.getAngulo()*Math.PI/180);
						int altura = geraPulso.getHeight()-35;
						bolinha.setBounds(149 + (int)Math.round(altura*-Math.cos(aux1)), 484 + (int)Math.round(altura*-Math.sin(aux1)), panel[0].getWidth(), panel[0].getHeight());
					}
				}
			}
		}
	}
	
	public void detalhes() {
		barra.setBounds(panel[0].getX(), panel[0].getY(), panel[0].getWidth(), 500 - panel[0].getY());
		barra.setBackground(Color.GRAY);
		getContentPane().add(barra);
		
		bolinha.setBorder(new LineBorder(Color.BLACK, panel[0].getWidth(), true));
		bolinha.setBackground(Color.GRAY);
		bolinha.setBounds(panel[0].getY(), panel[0].getY(), panel[0].getWidth(), panel[0].getHeight());
		getContentPane().add(bolinha);
		
		roda.setBorder(new LineBorder(Color.GRAY, geraPulso.getWidth()+10, true));
		roda.setBounds(geraPulso.getX(), geraPulso.getY(), geraPulso.getWidth(), geraPulso.getHeight());
		getContentPane().add(roda);
		
		linha.setBounds(150, 305, 1000, 1);
		linha.setBackground(Color.GRAY);
		getContentPane().add(linha);
	}
	
	public void objetos() {
		int x1 = 100, x2 = 927, y=550;
		
	//Controle Frequencia
		//Botoes
		menosF.setBounds(30+x1, 30+y, 41, 41);
		maisF.setBounds(180+x1, 30+y, 41, 41);
		//Barra de deslizamento
		sliderF.setValue(25);
		sliderF.setMaximum(100);
		sliderF.setMinimum(0);
		sliderF.setPaintTicks(true);
		sliderF.setBounds(30+x1, 83+y, 190, 30);
		//Área de texto
		labelF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelF.setHorizontalAlignment(SwingConstants.CENTER);
		labelF.setBounds(90+x1, 35+y, 80, 32);
		labelF.setText(c.f + "Hz");
		//Título
		titleF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleF.setHorizontalAlignment(SwingConstants.CENTER);
		titleF.setBounds(50+x1, y-10, 160, 32);
		
	//Controle Amplitude	
		//Botoes
		menosA.setBounds(30+x2, 30+y, 41, 41);
		maisA.setBounds(180+x2, 30+y, 41, 41);
		//Barra de deslizamento
		sliderA.setValue(25);
		sliderA.setMaximum(30);
		sliderA.setMinimum(0);
		sliderA.setPaintTicks(true);
		sliderA.setBounds(30+x2, 83+y, 190, 30);
		//Área de texto
		labelA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelA.setHorizontalAlignment(SwingConstants.CENTER);
		labelA.setBounds(90+x2, 35+y, 80, 32);
		labelA.setText(c.A + "px");
		//Título
		titleA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleA.setHorizontalAlignment(SwingConstants.CENTER);
		titleA.setBounds(80+x2, y-10, 100, 32);
		
		//botão pause
		pause.setBounds(563, 500, 50, 50);
		
		//tempo
		normal.setBounds(647, 500, 69, 23);
		normal.setSelected(true);
		lento.setBounds(647, 520, 69, 23);
		tempo.add(normal);
		tempo.add(lento);
		
		//reset
		reset.setBounds(330, 50, 80, 30);
		
		//pulsOnda
		onda.setBounds(130, 50, 89, 23);
		if(c.tipoMove == 1)
			onda.setSelected(true);
		else
			pulso.setSelected(true);
		pulso.setBounds(130, 70, 89, 23);
		pulsOnda.add(onda);
		pulsOnda.add(pulso);
		
		//Botao para gerar pulso
		geraPulso.setBounds(25+x1, y-90, 58, 58);
		
		getContentPane().add(menosF);
		getContentPane().add(maisF);
		getContentPane().add(sliderF);
		getContentPane().add(labelF);
		getContentPane().add(titleF);
		
		getContentPane().add(menosA);
		getContentPane().add(maisA);
		getContentPane().add(sliderA);
		getContentPane().add(labelA);
		getContentPane().add(titleA);
		
		getContentPane().add(pause);
		
		getContentPane().add(normal);
		getContentPane().add(lento);
		
		getContentPane().add(reset);
		
		getContentPane().add(onda);
		getContentPane().add(pulso);
		
		//Cada bolinha	
		for(int i=0; i<c.nAtomos; i++) {
			int r, g=0, b=0;
			if(i%9 == 0) {
				r = 0;
				g = 255;
			}else {
				r = 255;
				g = 0;
			}
			panel[i] = new JPanel();
			panel[i].setBorder(new LineBorder(new Color(r, g, b), 10, true));
			panel[i].setBounds(150+i*10, 250, 10, 10);
			getContentPane().add(panel[i]);
		}
	}
	
	public void actions() {
		// Frequencia
		menosF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(c.tipoMove == 1)
					c.setFrequency(sliderF, labelF, -1);
				else if(c.tipoMove == 2)
					c.setDuracaoPulso(sliderF, labelF, -1);
			}
		});
		maisF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(c.tipoMove == 1)
					c.setFrequency(sliderF, labelF, 1);
				else if(c.tipoMove == 2)
					c.setDuracaoPulso(sliderF, labelF, 1);
			}
		});
		sliderF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				if(c.tipoMove == 1)
					c.setFrequency(sliderF, labelF, 0);
				else if(c.tipoMove == 2)
					c.setDuracaoPulso(sliderF, labelF, 0);
			}
		});
		
		// Amplitude
		menosA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.setAmplitude(sliderA, labelA, -1);
			}
		});
		maisA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.setAmplitude(sliderA, labelA, 1);
			}
		});
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				c.setAmplitude(sliderA, labelA, 0);
			}
		});
		
		//pause
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.pause();
			}
		});
		
		//tempo
		normal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tempo = 1;
			}
		});
		lento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tempo = 8;
			}
		});
		
		//reset
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.reset();
			}
		});
		//tipo de Movimento
		onda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tipoMove = 1;
				titleF.setText("Frequência");
				labelF.setText(c.f + "Hz");
				int f = (int)(c.f*100/2);
				sliderF.setMinimum(0);
				sliderF.setValue(f);
				c.reset();
				
				getContentPane().remove(geraPulso);
			}
		});
		pulso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tipoMove = 2;
				titleF.setText("Duração do pulso");
				labelF.setText(c.duracaoPulso + "s");
				int p = (int)(c.duracaoPulso*100);
				sliderF.setMinimum(20);
				sliderF.setValue(p);
				c.reset();
				getContentPane().add(geraPulso);
			}
		});
		
		//Gerar Pulso
		geraPulso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.geraPulso();
			}
		});
	}
	
}
