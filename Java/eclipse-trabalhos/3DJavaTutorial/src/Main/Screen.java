package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Screen extends JPanel implements KeyListener{
	
	double sleepTime = 1000/30, lastRefresh = 0;
	static double[] viewFrom = new double[] {30, 1, 30};
	static double[] viewTo = new double[] {1, 1, 1};
	static int numberOfPolygons = 0, numberOf3dPolygons = 0;
	
	static PolygonObject[] DrawablePolygons = new PolygonObject[1000];
	static DPolygon[] dPolygons = new DPolygon[1000];
	
	int[] newOrder;
	
	boolean[] keys = new boolean[10];
	
	public Screen() {
		/*dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 2, 2, 0}, new double[]{0, 0, 2, 2}, new double[]{0, 0, 0, 0}, Color.green);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 2, 2, 0}, new double[]{0, 0, 2, 2}, new double[]{3, 3, 3, 3}, Color.blue);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 2, 2, 0}, new double[]{0, 0, 0, 0}, new double[]{0, 0, 3, 3}, Color.red);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 2, 2, 0}, new double[]{2, 2, 2, 2}, new double[]{0, 0, 3, 3}, Color.gray);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 0, 0, 0}, new double[]{0, 2, 2, 0}, new double[]{0, 0, 3, 3}, Color.pink);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{2, 2, 2, 2}, new double[]{0, 2, 2, 0}, new double[]{0, 0, 3, 3}, Color.orange);*/
		
		//------------------------------------------------ z -> altura / x -> / y -> 
		
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{0, 2, 2, 0}, new double[]{2, 2, 0, 0}, new double[]{0.1, 0.1, 0.1, 0.1}, Color.blue);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{1, 2, 2}, new double[]{1, 2, 0}, new double[]{2, 0.1, 0.1}, Color.blue);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{1, 2, 0}, new double[]{1, 0, 0}, new double[]{2, 0.1, 0.1}, Color.blue);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{1, 0, 2}, new double[]{1, 2, 2}, new double[]{2, 0.1, 0.1}, Color.blue);
		dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{1, 0, 0}, new double[]{1, 0, 2}, new double[]{2, 0.1, 0.1}, Color.blue);
		
		//------------------------------------------------
		
		//for(int i=-3; i<5; i++)
			//for(int j=-3; j<5; j++)
				//dPolygons[numberOf3dPolygons] = new DPolygon(new double[]{i, i, i+1, i+1}, new double[]{j, j+1, j+1, j}, new double[]{0, 0, 0, 0}, Color.green);
		
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		
		control();
		
		g.clearRect(0, 0, 2000, 1200);
		//g.drawString(System.currentTimeMillis() + "", 20, 20);
		
		g.drawString("ViewFrom: x = " + viewFrom[0] + "/ y = " + viewFrom[1] + "/ z = " + viewFrom[2], 20, 20);
		g.drawString("ViewTo: x = " + viewTo[0] + "/ y = " + viewTo[1] + "/ z = " + viewTo[2], 20, 40);
		
		dPolygons[0].updatePolygon();
		
		for(int i=0; i < numberOf3dPolygons; i++)
			dPolygons[i].updatePolygon();
		
		setOrder();
		for(int i=0; i < numberOfPolygons; i++)
			DrawablePolygons[newOrder[i]].drawPolygon(g);
		
		SleepAndRefresh();
	}
	
	void setOrder() {
		
		double[] k = new double[numberOfPolygons];
		newOrder = new int[numberOfPolygons];
		for(int i=0; i<numberOfPolygons; i++) {
			k[i] = DrawablePolygons[i].avgDist;
			newOrder[i] = i;
		}
		
		double temp;
		int tempr;
		for(int a=0; a<k.length-1; a++)
			for(int b=0; b<k.length-1; b++)
				if(k[b] < k[b+1]) {
					temp = k[b];
					tempr = newOrder[b];
					newOrder[b] = newOrder[b+1];
					k[b] = k[b+1];
					
					newOrder[b+1] = tempr;
					k[b+1] = temp;
				}
		
	}
	
	public void SleepAndRefresh() {
		while(true) {
			if((System.currentTimeMillis() - lastRefresh) > sleepTime) {
				lastRefresh = System.currentTimeMillis();
				repaint();
				break;
			}else {
				try {
					Thread.sleep((long)(sleepTime - (System.currentTimeMillis() - lastRefresh)));
				}catch(Exception e){}
			}
		}
	}

	void control() {
		Vector viewVector = new Vector(viewTo[0] - viewFrom[0], viewTo[1] - viewFrom[1], viewTo[2] - viewFrom[2]);
		
		if(keys[4]) {
			viewFrom[0] += viewVector.x;
			viewFrom[1] += viewVector.y;
			viewFrom[2] += viewVector.z;
			viewTo[0] += viewVector.x;
			viewTo[1] += viewVector.y;
			viewTo[2] += viewVector.z;
		}
		if(keys[6]) {
			viewFrom[0] -= viewVector.x;
			viewFrom[1] -= viewVector.y;
			viewFrom[2] -= viewVector.z;
			viewTo[0] -= viewVector.x;
			viewTo[1] -= viewVector.y;
			viewTo[2] -= viewVector.z;
		}
		if(keys[0])
			viewFrom[0]++;
		if(keys[1])
			viewFrom[0]--;
		if(keys[2])
			viewFrom[1]++;
		if(keys[3])
			viewFrom[1]--;
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			keys[0] = true;
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			keys[1] = true;
		if(e.getKeyCode() == KeyEvent.VK_UP)
			keys[2] = true;
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			keys[3] = true;
		if(e.getKeyCode() == KeyEvent.VK_W)
			keys[4] = true;
		if(e.getKeyCode() == KeyEvent.VK_A)
			keys[5] = true;
		if(e.getKeyCode() == KeyEvent.VK_S)
			keys[6] = true;
		if(e.getKeyCode() == KeyEvent.VK_D)
			keys[7] = true;
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			keys[0] = false;
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			keys[1] = false;
		if(e.getKeyCode() == KeyEvent.VK_UP)
			keys[2] = false;
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
			keys[3] = false;
		if(e.getKeyCode() == KeyEvent.VK_W)
			keys[4] = false;
		if(e.getKeyCode() == KeyEvent.VK_A)
			keys[5] = false;
		if(e.getKeyCode() == KeyEvent.VK_S)
			keys[6] = false;
		if(e.getKeyCode() == KeyEvent.VK_D)
			keys[7] = false;
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
}
