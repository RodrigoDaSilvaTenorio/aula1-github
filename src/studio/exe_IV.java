package studio;

import java.util.Scanner;

public class exe_IV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Favore, messi il tipo di Gasolio: 1.Alcol 2.Benzina 3.Diesel o 4.Fine");
		
		int x = sc.nextInt();
		int alcool = 0;
		int benzina = 0;
		int diesel = 0;
				
		while (x != 4) {
			if (x == 1) {
				alcool += 1;
			
			}else if (x == 2) {
				benzina += 1;
			
			}else if (x == 3) {
				diesel +=1;
			}
			
			x = sc.nextInt();
			
		}
		
		
		System.out.println("MUITO OBRIGADO");

		System.out.println("Alcol: " + alcool);
		System.out.println("Benzina: " + benzina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
