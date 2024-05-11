package Main;

import java.awt.Color;
import java.awt.Polygon;

public class DPolygon {
	
	Color c;
	double[] x, y, z;
	int poly = 0;
	
	public DPolygon(double[] x, double[] y, double[] z, Color c) {
		Screen.numberOf3dPolygons++;
		this.x = x;
		this.y = y;
		this.z = z;
		this.c = c;
		createPolygon();
	}
	
	void createPolygon() {
		poly = Screen.numberOfPolygons;
		Screen.DrawablePolygons[Screen.numberOfPolygons] = new PolygonObject(new double[x.length], new double[x.length], c);
		updatePolygon();
	}
	
	
	void updatePolygon() {
		double dx = -50*Calculator.CalculatePositionX(Screen.viewFrom, Screen.viewTo, Screen.viewTo[0], Screen.viewTo[1], Screen.viewTo[2]);
		double dy = -50*Calculator.CalculatePositionY(Screen.viewFrom, Screen.viewTo, Screen.viewTo[0], Screen.viewTo[1], Screen.viewTo[2]);
		double[] newX = new double[x.length];
		double[] newY = new double[x.length];
		
		for(int i=0; i<x.length; i++) {
			newX[i] = dx + DDDTutorial.screenSize.getWidth()/2 + 50*Calculator.CalculatePositionX(Screen.viewFrom, Screen.viewTo, x[i], y[i], z[i]);
			newY[i] = dy + DDDTutorial.screenSize.getHeight()/2 + 50*Calculator.CalculatePositionY(Screen.viewFrom, Screen.viewTo, x[i], y[i], z[i]);
		}
		Screen.DrawablePolygons[poly] = new PolygonObject(newX, newY, c);
		Screen.DrawablePolygons[poly].avgDist = getDist();
		Screen.numberOfPolygons--;
	}
	
	double getDist() {
		double total = 0;
		for(int i=0; i<x.length; i++)
			total+= getDistanceToP(i);
		return total/x.length;
	}
	
	double getDistanceToP(int i) {
		double x = Screen.viewFrom[0]-this.x[i], y = Screen.viewFrom[1]-this.y[i], z = Screen.viewFrom[2]-this.z[i];
		return Math.sqrt(x*x + y*y + z*z);
	}
	
}
