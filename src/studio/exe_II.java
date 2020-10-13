package studio;

import java.util.Locale;
import java.util.Scanner;

public class exe_II {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		String x = sc.next();
//		int x = sc.nextInt();
//		double x = sc.nextDouble();
//		char x = sc.next().charAt(0);
		
		int a;
		String x,y,z;
		
		a = sc.nextInt();
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		//System.out.printf("Voce digitou: %.2f%n", x);
		System.out.println("Voce digitou: ");
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		 	
		sc.close();
		
	}

}
