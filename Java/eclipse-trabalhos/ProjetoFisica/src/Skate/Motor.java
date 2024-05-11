package Skate;

public class Motor {
	
	double S=0, angulo=0, g, vo=0, Sx=0, Sy, G=9.8, t=0.025;
	double raio=200;
	double So=raio, aux=1, h=400;
	double m=35, Epg, Ec, Em;
	double vel;
	int auxProp = 665;
	
	public Motor(){
		vel = G*Math.sqrt(2*(h-raio)/G);
		h = auxProp - h;
		Sy = h;
		Epg = m*9.8*(auxProp-Sy)/1000;
		Em = Epg;
	}
	
	void reset() {
		S = vo = angulo = Sx = 0;
		aux = 1;
		So = raio;
		vel = G*Math.sqrt(2*(h-raio)/G);
		h = auxProp - h;
		Sy = h;
		g = G*Math.cos(angulo);
		Epg = m*9.8*(auxProp-Sy)/1000;
		Em = Epg;
	}
	
	public void movimento() {
		if(Sx>raio && Sx<2*raio){
	        Sx+= vo*t;
	        So = Sx;
	    }
	    else{
	        g = G*Math.cos(angulo);
	        Sy = Sy + vo*t*aux + g*Math.pow(t, 2)/2;
	        if(Sy>auxProp-raio){
	            S = S + vo*t + g*Math.pow(t, 2)/2;
	            Sy = (auxProp-raio) + raio*Math.sin(angulo);
	            Sx = So - raio*Math.cos(angulo);
	            angulo = S/raio;
	        }
	        if(angulo > Math.PI){
	            angulo = Math.PI;
	            aux = -1;
	            vo = vel;
	        }else if(angulo<0){
	            angulo = 0;
	            aux = 1;
	            vo = -vel;
	        }
	        vo = vo + g*t;
	    }

	    Epg = m*g*(auxProp-Sy)/1000;
	    if(Epg<0){Epg*=-1;}
	    Ec = m*Math.pow(vo, 2)/2000;
	}
	
	int getX(){
		return (int)Sx;
	}
	
	int getY() {
		return (int)Sy;
	}
	
	int getEPG() {
		return (int)Epg;
	}
	
	int getEC() {
		return (int)Ec;
	}
	
	int getEM() {
		return (int)Em;
	}
	
	void setMassa(int m) {
		this.m = m;
		Epg = m*9.8*(auxProp-h)/1000;
		Em = Epg;
	}
	
	void setAltura(int h) {
		if(h < 200)
			h = 200;
		this.h = h;
		reset();
	}

}
