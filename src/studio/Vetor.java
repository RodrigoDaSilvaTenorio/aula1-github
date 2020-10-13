package studio;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double alt = 0.0;
		
		double[] vect = new double[n];
		
		for(int i=0 ; i<n ; i++) {
			vect[i] = sc.nextDouble();
			alt += vect[i];
		}
		
		double avg = alt / n;
		
		System.out.printf("AVG: %.2f%n" , avg);
		
		sc.close();
		
	}

}
