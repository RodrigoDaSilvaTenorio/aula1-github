package studio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favore entrare con tre numero:");

		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		
		int higher = max(i1,i2,i3);
		
		showResult(higher);
		sc.close();
		
	}
	
	public static int max(int a, int b, int c) {
		
		if(a > b && a > c){
			return a;
		}else if (b > c) {
			return b;
		}else {
			return c;
		}
	}
	
	public static void showResult(int higher) {
		System.out.println("Higher is : " + higher);
	}	

}
