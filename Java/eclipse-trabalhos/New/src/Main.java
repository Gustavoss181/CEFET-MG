import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
public class Main {


	public static EV3LargeRegulatedMotor motor_e = new EV3LargeRegulatedMotor(MotorPort.A);
	public static EV3LargeRegulatedMotor motor_d = new EV3LargeRegulatedMotor(MotorPort.D);
	public static EV3ColorSensor sensor_e = new EV3ColorSensor(SensorPort.S1);
	public static EV3ColorSensor sensor_d = new EV3ColorSensor(SensorPort.S4);
	
	public static void main(String[] args) throws InterruptedException {
		Motor motor = new Motor();
		
		motor_e.stop(true);
		motor_d.stop(true);
		
		motor.run(motor_e, 10);
	}

}
