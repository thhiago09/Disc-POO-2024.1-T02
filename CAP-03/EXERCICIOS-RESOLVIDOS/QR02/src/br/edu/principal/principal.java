package br.edu.principal;

import java.util.Scanner;

public class principal {
	static  void calc(double n, double n2, double n3) {
		 
	 }

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		double n = 0;
		System.out.printf("Informe sua primeira nota: \n");
		n = num1.nextDouble();
		
		Scanner num2 = new Scanner(System.in);
		double n2;
		System.out.printf("Informe sua segunda nota: \n");
		n2 = num2.nextDouble();
		
		Scanner num3 = new Scanner(System.in);
		double n3;
		System.out.printf("Informe sua terceira nota: \n");
		n3 = num3.nextDouble();
		
		double media = ((n + n2 + n3)/3);
		System.out.printf("Sua média é = %.2f %n",  media);
		
			calc(n, n2, n3);
	}

}
