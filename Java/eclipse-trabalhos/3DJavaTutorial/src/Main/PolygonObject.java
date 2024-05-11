package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonObject {
	
	Polygon p;
	Color c;
	double avgDist = 0;
	
	public PolygonObject(double[] x, double[] y, Color c) {
		Screen.numberOfPolygons++;
		p = new Polygon();
		for(int i=0; i<x.length; i++)
			p.addPoint((int)x[i], (int)y[i]);
		this.c = c;
	}
	
	void drawPolygon(Graphics g) {
		g.setColor(c);
		g.fillPolygon(p);
		g.setColor(Color.black);
		g.drawPolygon(p);
	}
}
