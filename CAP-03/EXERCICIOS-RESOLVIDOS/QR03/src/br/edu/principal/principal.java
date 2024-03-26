package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Pesos
		int peso1 = 3;
		int peso2 = 3;
		int peso3 = 4;
		
		//"inputs" das notas
		Scanner num1 = new Scanner(System.in);
		double n1 = 0;
		System.out.printf("Informe sua primeira nota: \n");
		n1 = num1.nextDouble();
		
		Scanner num2 = new Scanner(System.in);
		double n2;
		System.out.printf("Informe sua segunda nota: \n");
		n2 = num2.nextDouble();
		
		Scanner num3 = new Scanner(System.in);
		double n3;
		System.out.printf("Informe sua terceira nota: \n");
		n3 = num3.nextDouble();
		
		double media = ((n1 * peso1 + n2 * peso2 + n3 * peso3)/(peso1 + peso2 + peso3));
		System.out.printf("Sua média é = %.2f %n",  media);


	}

}
