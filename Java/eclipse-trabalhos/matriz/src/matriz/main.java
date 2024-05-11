package matriz;
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		cmatriz matriz = new cmatriz();
		int i;
		System.out.print("Indique o tamanho da matriz: ");
		i = new Scanner(System.in).nextInt();
		
		float[][] A = new float[i][i];
		float[][] B = new float[i][i];
		float[][] Soma = new float[i][i];
		
		A = matriz.preenche(i);
		B = matriz.preenche(i);
		Soma = matriz.soma(A, B);
		matriz.upper(Soma);
		matriz.lower(Soma);
		matriz.diagonal(Soma);
	}

}
