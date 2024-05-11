package Main;

public class Calculator {
	
	static double drawX = 0, drawY = 0;
	
	static double CalculatePositionX(double[] ViewFrom, double[] ViewTo, double x, double y, double z) {
		setStuff(ViewFrom, ViewTo, x, y, z);
		return drawX;
	}
	
	static double CalculatePositionY(double[] ViewFrom, double[] ViewTo, double x, double y, double z) {
		setStuff(ViewFrom, ViewTo, x, y, z);
		return drawY;
	}
	
	static void setStuff(double[] ViewFrom, double[] ViewTo, double x, double y, double z) {
		Vector viewVector = new Vector(ViewTo[0] - ViewFrom[0], ViewTo[1] - ViewFrom[1], ViewTo[2] - ViewFrom[2]);
		Vector directionVector = new Vector(1, 1, 1);
		Vector planeVector1 = viewVector.CrossProduct(directionVector);
		Vector planeVector2 = viewVector.CrossProduct(planeVector1);
		
		//---------------------------------------------------------------
		
		Vector rotationVector = getRotationVector(ViewFrom, ViewTo);
		Vector weirdVector1 = viewVector.CrossProduct(rotationVector);
		Vector weirdVector2 = viewVector.CrossProduct(weirdVector1);
		
		//----------------------Calculation------------------------------
		
		Vector viewToPoint = new Vector(x - ViewFrom[0], y - ViewFrom[1], z - ViewFrom[2]);
		
		double t = (viewVector.x*ViewTo[0] + viewVector.y*ViewTo[1] + viewVector.z*ViewTo[2]
				 - (viewVector.x*ViewFrom[0] + viewVector.y*ViewFrom[1] + viewVector.z*ViewFrom[2]))
				 / (viewVector.x*viewToPoint.x + viewVector.y*viewToPoint.y + viewVector.z*viewToPoint.z);
		
		x = ViewFrom[0] + viewToPoint.x * t;
		y = ViewFrom[1] + viewToPoint.y * t;
		z = ViewFrom[2] + viewToPoint.z * t;
		
		if(t>=0) {
			drawX = weirdVector2.x * x + weirdVector2.y * y + weirdVector2.z * z;
			drawY = weirdVector1.x * x + weirdVector1.y * y + weirdVector1.z * z;
		}
	}
	
	static Vector getRotationVector(double[] ViewFrom, double[] ViewTo)
	{
		double dx = Math.abs(ViewFrom[0]-ViewTo[0]);
		double dy = Math.abs(ViewFrom[1]-ViewTo[1]);
		double xRot, yRot;
		
		xRot=dy/(dx+dy);		
		yRot=dx/(dx+dy);
		
		if(ViewFrom[1]>ViewTo[1])
			xRot = -xRot;
		if(ViewFrom[0]<ViewTo[0])
			yRot = -yRot;

		Vector V = new Vector(xRot, yRot, 0);
		return V;
	}
	
}
