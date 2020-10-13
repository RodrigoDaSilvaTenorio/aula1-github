package studio;

import java.util.Scanner;

public class Matriz_exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value X: ");
		int x = sc.nextInt();
		System.out.print("Value Y: ");
		int y = sc.nextInt();
		
		Integer [][] matriz = new Integer[x][y];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Search: ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(n == matriz[i][j]) {
					System.out.println("Position: " + i + "," + j);
					
					if(j > 0) {
						System.out.println("Left: "  + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: "    + matriz[i-1][j]);
					}
					if(j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) {
						System.out.println("Down: "  + matriz[i+1][j]);
					}
					 
				}
			}
		}
		sc.close();
	}

}
