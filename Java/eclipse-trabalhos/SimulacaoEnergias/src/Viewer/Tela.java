package Viewer;

import Control.Controle;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;

public class Tela extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	Controle c;
//energias
	JPanel Ec = new JPanel(), Epg = new JPanel(), Em = new JPanel(), energias = new JPanel();
//Altura
	JLabel labelA = new JLabel("Altura(min 200):"), titleA = new JLabel("Altura");
	JTextField tfA = new JTextField();
	JButton enviarA = new JButton("Enviar");
//Massa
	JLabel titleM = new JLabel("Massa");
	JSlider sliderM = new JSlider();
//Movimento
	ButtonGroup tempo = new ButtonGroup();
	JRadioButton normal = new JRadioButton("normal"), lento = new JRadioButton("lento");
	JLabel titleMove = new JLabel("Movimento");
	JPanel panelControl = new JPanel();
	JButton pause = new JButton("||/>"), reset = new JButton("Resetar");
//Imagem
	JLabel pista = new JLabel(new ImageIcon(getClass().getResource("pista2.png")));
	//JLabel skatista = new JLabel(new ImageIcon(getClass().getResource("skatista(1).png")));
	JPanel skatista = new JPanel();
//legenda
	JPanel corEc = new JPanel(), corEpg = new JPanel(), corEm = new JPanel();
	JLabel legEc = new JLabel("Energia cinética"), legEpg = new JLabel("Energia potencial gravitacional"), legEm = new JLabel("Energia mecânica");
	
	public Tela() {
		c = new Controle();
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1360, 700);
		getContentPane().setBackground(new Color(173, 216, 230));
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
	
		objetos();
		detalhes();
		actions();
	}

	public class Movimento extends Thread {
		public void run() {
			while(true) {
				try {sleep(c.tempo);}catch(Exception e) {}
				if(c.pause) {
					c.movimento();
					//bolinha
					skatista.setLocation(c.bolinha.getX()+335, c.bolinha.getY());
					//energias
					Ec.setBounds(Ec.getX(), 550-c.bolinha.getEC(), Ec.getWidth(), c.bolinha.getEC());
					Epg.setBounds(Epg.getX(), 550-c.bolinha.getEPG(), Epg.getWidth(), c.bolinha.getEPG());
					Em.setBounds(Em.getX(), 550-c.bolinha.getEM(), Em.getWidth(), c.bolinha.getEM());
				}
			}
		}
	}
	
	public void detalhes() {
		skatista.setBounds(330, 250, 20, 20);
		skatista.setBorder(new LineBorder(new Color(50, 50, 50), 20, true));
		skatista.setBackground(new Color(173, 216, 230));
		getContentPane().add(skatista);
		
		pista.setBounds(300, 250, 700, 600);
		getContentPane().add(pista);
		
		corEc.setBounds(50, 580, 20, 20);
		corEc.setBackground(Color.BLUE);
		getContentPane().add(corEc);
		legEc.setBounds(80, 580, 100, 20);
		getContentPane().add(legEc);
		
		corEpg.setBounds(50, 620, 20, 20);
		corEpg.setBackground(Color.ORANGE);
		getContentPane().add(corEpg);
		legEpg.setBounds(80, 620, 180, 20);
		getContentPane().add(legEpg);
		
		corEm.setBounds(50, 660, 20, 20);
		corEm.setBackground(Color.RED);
		getContentPane().add(corEm);
		legEm.setBounds(80, 660, 110, 20);
		getContentPane().add(legEm);
	}
	
	public void objetos() {
		
	//Área do gráfico de energias	
		Ec.setBounds(100, 200*2, 20, 300/2);
		Ec.setBackground(Color.BLUE);
		getContentPane().add(Ec);
		
		Epg.setBounds(150, 200*2, 20, 300/2);
		Epg.setBackground(Color.ORANGE);
		getContentPane().add(Epg);
		
		Em.setBounds(200, 250, 20, 300);
		Em.setBackground(Color.RED);
		getContentPane().add(Em);
		
		energias.setBounds(50, 150, 220, 405);
		energias.setBorder(new LineBorder(Color.BLACK, 5, true));
		energias.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(energias);
	//Controle Altura
		//titulo
		titleA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleA.setHorizontalAlignment(SwingConstants.CENTER);
		titleA.setBounds(1100, 170, 200, 30);
		getContentPane().add(titleA);
		//Label
		labelA.setHorizontalAlignment(SwingConstants.CENTER);
		labelA.setBounds(1080, 200, 100, 32);
		getContentPane().add(labelA);
		//Área de escrita
		tfA.setBounds(1183, 206, 86, 20);
		getContentPane().add(tfA);
		tfA.setColumns(10);
			//enviar
			enviarA.setBounds(1160, 240, 70, 20);
		getContentPane().add(enviarA);
		getContentPane().add(labelA);
		getContentPane().add(titleA);
	//Controle massa
		//título massa
		titleM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleM.setHorizontalAlignment(SwingConstants.CENTER);
		titleM.setBounds(1100, 300, 200, 30);
		getContentPane().add(titleM);
		//Slider massa
		sliderM.setValue(35);
		sliderM.setMaximum(60);
		sliderM.setMinimum(10);
		sliderM.setPaintTicks(true);
		sliderM.setBounds(1100, 350, 200, 30);
		getContentPane().add(sliderM);
		
	//Movimento
		//titulo
		titleMove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleMove.setHorizontalAlignment(SwingConstants.CENTER);
		titleMove.setBounds(1100, 420, 200, 30);
		//botão pause
		pause.setBounds(1120, 470, 50, 46);
		//tempo
		normal.setBounds(1200, 470, 69, 23);
		normal.setSelected(true);
		lento.setBounds(1200, 490, 69, 23);
		tempo.add(normal);
		tempo.add(lento);
		//reset
		reset.setBounds(1150, 550, 80, 30);
	
	//movimento
		getContentPane().add(titleMove);
		getContentPane().add(pause);
		getContentPane().add(normal);
		getContentPane().add(lento);
		getContentPane().add(reset);
		
	//Engloba Controle
		JLabel titleControl = new JLabel("Controle");
		titleControl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titleControl.setHorizontalAlignment(SwingConstants.CENTER);
		titleControl.setBounds(1050, 100, 300, 30);
		getContentPane().add(titleControl);
		panelControl.setBounds(1050, 70, 300, 550);
		panelControl.setBorder(new LineBorder(Color.BLACK, 5, true));
		panelControl.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panelControl);
		
	}
	
	public void actions() {
		enviarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.bolinha.setAltura(Integer.parseInt(tfA.getText()));
				c.reset();
				c.reset();
			}
		});
		
		sliderM.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				c.bolinha.setMassa(sliderM.getValue());
				int cor = 120 - sliderM.getValue()*2;
				skatista.setBorder(new LineBorder(new Color(cor, cor, cor), skatista.getWidth(), true));
			}
		});
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.reset();
				c.reset();
			}
		});
		
		//tempo
		normal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tempo = 2;
			}
		});
		lento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.tempo = 10;
			}
		});
		//pause
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(c.pause)
					c.pause = false;
				else
					c.pause = true;
			}
		});
	}
}
