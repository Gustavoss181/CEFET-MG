package Main;

public class Vector {
	double x = 0, y = 0, z = 0;
	
	public Vector(double x, double y, double z) {
		double Lenght = Math.sqrt(x*x + y*y + z*z);
		if(Lenght > 0) {
			this.x = x/Lenght;
			this.y = y/Lenght;
			this.z = z/Lenght;
		}
	}
	
	Vector CrossProduct(Vector v) {
		Vector crossVector = new Vector(
			y*v.z - z*v.y,
			z*v.x - x*v.z,
			x*v.y - y*v.x
		);
		return crossVector;
	}
}
