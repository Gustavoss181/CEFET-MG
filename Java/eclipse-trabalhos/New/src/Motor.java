import lejos.hardware.BrickFinder;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.utility.Delay;

public class Motor {
	public static EV3LargeRegulatedMotor motor_e = new EV3LargeRegulatedMotor(MotorPort.A);
	public static EV3LargeRegulatedMotor motor_d = new EV3LargeRegulatedMotor(MotorPort.D);
	
	public static void run (EV3LargeRegulatedMotor m, float speed) {
		m.setSpeed(Math.abs(speed));
		if(speed>0){
			m.backward();
		}
		else if (speed < 0) {
			m.forward();
		} else {
			m.stop(true);
		}
	}
	
	public void sensorCor() throws InterruptedException {
		EV3ColorSensor luz1 = new EV3ColorSensor (SensorPort.S1);
		EV3ColorSensor luz4 = new EV3ColorSensor (SensorPort.S4);
		
		//recebe a cor na porta 1
		
		while(Button.readButtons()==0) {
		float[] sample1 = new float[luz1.getRGBMode().sampleSize()];
		luz1.getRGBMode().fetchSample(sample1, 0);
		int red1 = (int) (100 * sample1[0]);
		int green1 = (int) (100 * sample1[1]);
		int blue1 = (int) (100 * sample1[2]);
		
		//recebe a cor na porta 4
		float[] sample4 = new float[luz4.getRGBMode().sampleSize()];
		luz4.getRGBMode().fetchSample(sample4, 0);
		int red4 = (int) (100 * sample4[0]);
		int green4 = (int) (100 * sample4[1]);
		int blue4 = (int) (100 * sample4[2]);
		
		LCD.drawInt(red1, 1, 1);
		LCD.drawInt(green1, 4, 1);
		LCD.drawInt(blue1, 7, 1);
		
		LCD.drawInt(red4, 1, 2);
		LCD.drawInt(green4, 4, 2);
		LCD.drawInt(blue4, 7, 2);
		}
	}

}
