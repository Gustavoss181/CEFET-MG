package teste;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Viewer extends JFrame{
	
	JTextField texto = new JTextField();
	JButton start = new JButton("start");
	
	public Viewer() {
		editarJanela();
	}
	
	public void editarJanela() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 300);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		texto.setBounds(100, 200, 80, 20);
		getContentPane().add(texto);
		
		start.setBounds(180, 200, 80, 20);
		getContentPane().add(start);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = texto.getText();
				System.out.println(text);
			}
		});
	}

	
	
	public static void main(String[] args) {
		new Viewer();
	}
}