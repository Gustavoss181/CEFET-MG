package teste;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
  
public class testeSwing extends JButton {
    public testeSwing(String label) {
        super(label);

        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        setContentAreaFilled(false);        
    }
  
    protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
		            g.setColor(Color.lightGray);
		        } else {
		            g.setColor(getBackground());
		        }
		g.fillOval(0, 0, getSize().width-1, getSize().height-1);
		  
		super.paintComponent(g);
    }
    
    protected void paintBorder(Graphics g) {
    	g.setColor(getForeground());
    	g.drawOval(0, 0, getSize().width-1, getSize().height-1);    
    }
  
    public static void main(String[] args) {
    	
        JButton button = new testeSwing("<");
        button.setBackground(Color.white);
        button.setBounds(200, 200, button.getHeight(), button.getWidth());

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().add(button);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(150, 150);
        frame.setVisible(true);
    }
}
