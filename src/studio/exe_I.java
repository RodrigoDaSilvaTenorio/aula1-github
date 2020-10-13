package studio;

import java.util.Locale;

public class exe_I {

	public static void main(String[] args) {
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha

		String prod1 = "Computer";
		String prod2 = "Office desk";
		
		int age  = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 =  650.5;
		double measure = 53.23453;
		
		System.out.println("PRODUCTS:");
		System.out.printf("%s price: $ %.2f%n", prod1, price1);
		System.out.printf("%s price: $ %.2f%n", prod2, price2);
		
		System.out.printf("Record: %d years old, code: %d and gender: %s%n",age,code,gender);
		System.out.println();
		System.out.printf("Measure with eight decimals places: %.8f%n",measure);
		System.out.printf("Measure with three decimals places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.println("US decimal point: " + measure);
		
	}

}
