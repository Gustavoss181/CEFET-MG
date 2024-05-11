package teste;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Tecla extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public Tecla()
	{
		addKeyListener( new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				// Pressione a letra B e aparecerá a frase: Letra B
				if(e.getKeyChar() == KeyEvent.VK_A)
				System.out.println("Letra A");				
			}
			
			@Override
			public void keyReleased(KeyEvent e)
			{
								
			}
			
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
				
			}
		});
		
		setSize(500, 500);
		setVisible( true );		
	}	
	
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Tecla();
			}
		});

	}
}
