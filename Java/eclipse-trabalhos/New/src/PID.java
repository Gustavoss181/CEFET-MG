import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;

public class PID {
	
	public static float branco_e, branco_d, preto_e, preto_d, offset_e, offset_d;
	
	
	public static void pid(EV3ColorSensor sensor_e, EV3ColorSensor sensor_d, EV3LargeRegulatedMotor motor_e, EV3LargeRegulatedMotor motor_d) {
		
		Sound.beep();
		
		LCD.clear();
		
		LCD.drawString("APERTE UM BOTAO PRA COMECAR", 3, 3);
		Button.waitForAnyPress();
		Delay.msDelay(1000);
		
		//kp = 1600, kd = 500, ki = 0, base_vel = 40
		final float kp = 1400, kd = 650, ki = 60;
		int cont = 0;
		float proporcional_e, proporcional_d, derivada_e = 0, derivada_d = 0, integral_e = 0, integral_d = 0;
		float erro_e, erro_d, somaInt_e = 0, somaInt_d = 0, final_e, final_d, base_vel = 90;
		float valor_e, valor_d;
		
		LCD.clear();
		LCD.drawString("RODANDO", 3, 3);
		
		while (Button.readButtons() == 0) {
			
			valor_e = getValue(sensor_e)[0];
			valor_d = getValue(sensor_d)[0];
			
			if (valor_e > offset_e && valor_d > offset_d) {
				run(motor_e, 200);
				run(motor_d, 200);
			} else if (valor_e < preto_e + 0.02 && valor_d > offset_d){
				Sound.beep();
				run(motor_e, -100);
				run(motor_d, 400);
			} else if (valor_d < preto_d + 0.02 && valor_e > offset_e){
				Sound.beep();
				run(motor_d, -100);
				run(motor_e, 400);
			} else {
				erro_e = valor_e - offset_e;
				erro_d = valor_d - offset_d;
				
				proporcional_e = erro_e;
				proporcional_d = erro_d;
				
				//derivada = proporcional_atual - proporcional_anterior
				
				if (cont != 0) {
					derivada_e = proporcional_e - derivada_e;
					derivada_d = proporcional_d - derivada_d;
				}
				
				final_e = proporcional_e * kp + derivada_e * kd + integral_e * ki + base_vel;
				final_d = proporcional_d * kp + derivada_d * kd + integral_d * ki + base_vel;
				
				somaInt_e += proporcional_e;
				somaInt_d += proporcional_d;
				cont++;
				if (cont > 0) {
					integral_e = somaInt_e / cont;
					integral_d = somaInt_d / cont;
				}
				
				derivada_e = proporcional_e;
				derivada_d = proporcional_d;

				run(motor_e, final_e);
				run(motor_d, final_d);
			}
			
		
		}
		
	}
}
