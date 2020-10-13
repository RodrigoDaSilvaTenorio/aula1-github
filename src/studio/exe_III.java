package studio;

import java.util.Scanner;

public class exe_III {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		/*
		System.out.print("Dimmi uno valore: ");
		int value1 = sc.nextInt();	
		sc.nextLine();
		System.out.print("Dimmi un'altro valore: ");
		int value2 = sc.nextInt();

		if(value1 == value2) {
			System.out.println("Valori uguali");
		}else if(value1 >= value2) {
			System.out.println("Primo valore e maggior");
		}else {
			System.out.println("Secondo valore e maggior");
		}
		 */

		System.out.print("Valore 1: ");
		int var1 = sc.nextInt();
		System.out.print("Valore 2: ");
		int var2 = sc.nextInt();

		while (var1!=0 && var2!=0 ) {
			if (var1<0 && var2>0) {

				System.out.println("Prima");

			}else if(var1>0 && var2>0) {

				System.out.println("Secondo");

			}else if(var1<0 && var2<0) {

				System.out.println("Terzo");

			}else {

				System.out.println("Quarto");
			}
			
			
			System.out.print("Valore 1: ");
			var1 = sc.nextInt();
			System.out.print("Valore 2: ");
			var2 = sc.nextInt();
		}

		System.out.println("Fine.");
		sc.close();
	}
}