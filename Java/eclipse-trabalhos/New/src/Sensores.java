import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;

public class Sensores {
	public static float[] getValue(EV3ColorSensor s) {
		float[] values = new float[3];
		s.getRGBMode().fetchSample(values, 0);
		return values;
	}
	
public static void calibre() {
		
		float valor_e = 0, valor_d = 0;
		
		Sound.beep();
		Sound.beep();
		
		while (Button.readButtons() == 0) {
			valor_e = getValue(sensor_e)[0];
			valor_d = getValue(sensor_d)[0];
			LCD.drawString("BRANCO_E: " + valor_e, 3, 3);
			LCD.drawString("BRANCO_D: " + valor_d, 3, 6);
			Delay.msDelay(250);
		}
		branco_e = valor_e;
		branco_d = valor_d;
		
		Sound.beep();
		
		while (Button.readButtons() == 0) {
			valor_e = getValue(sensor_e)[0];
			valor_d = getValue(sensor_d)[0];
			LCD.drawString("PRETO_E: " + valor_e, 3, 3);
			LCD.drawString("PRETO_D: " + valor_d, 3, 6);
			Delay.msDelay(250);
		}
		preto_e = valor_e;
		preto_d = valor_d;
		
		Sound.beep();
		
		offset_e = (branco_e + preto_e) / 2;
		offset_d = (branco_d + preto_d) / 2;
	}
}
