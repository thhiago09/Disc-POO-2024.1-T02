package br.edu.principal;

import java.util.Scanner;

public class principal {
	static  void calc(int n, int n2) {
		 
	 }

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		int n;
		System.out.printf("Informe um número: \n");
		n = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		int n2;
		System.out.printf("Informe um número: \n");
		n2 = num2.nextInt();
		
			calc(n, n2);
			
			System.out.println(n + n2);
			System.out.println(n - n2);
			System.out.println(n / n2);
			System.out.println(n * n2);
	}

}
