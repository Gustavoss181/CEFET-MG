package matriz;
import java.util.Random;
public class cmatriz {

	public float[][] preenche(int n){
		Random aleatorio = new Random();
		float[][] N = new float[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				N[i][j] = 9*aleatorio.nextFloat()+1;
			}
		}
		
		return N;
	}
	
	public float[][] soma(float[][] A, float[][] B){
		float[][] C = new float[A.length][A[0].length];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				C[i][j] = A[i][j]+B[i][j];
			}
		}
		
		return C;
	}
	
	public void upper(float[][] N) {
		for(int i=0; i<N.length; i++) {
			for(int j=0; j<N[0].length; j++) {
				if(j>i) {
					System.out.printf("%.2f ",N[i][j]);
				}
				else {
					System.out.printf("0.00 ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	public void lower(float[][] N) {
		for(int i=0; i<N.length; i++) {
			for(int j=0; j<N[0].length; j++) {
				if(j<i) {
					System.out.printf("%.2f ",N[i][j]);
				}
				else {
					System.out.printf("0.00 ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	public void diagonal(float[][] N) {
		for(int i=0; i<N.length; i++) {
			for(int j=0; j<N[0].length; j++) {
				if(j==i) {
					System.out.printf("%.2f ",N[i][j]);
				}
				else {
					System.out.printf("0.00 ");
				}
			}
			System.out.printf("\n");
		}
	}
	
}