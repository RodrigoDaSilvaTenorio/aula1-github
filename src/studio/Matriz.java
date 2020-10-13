package studio;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Main Diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
 		System.out.println();
 		
		int negativo = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] < 0) {
					negativo += 1;
				}
			}
		}		
		
		System.out.println("Qt. negative number: " + negativo);
		
		sc.close();
	}

}
