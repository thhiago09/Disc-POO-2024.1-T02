package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner num2 = new Scanner(System.in);
		double per = 0;
		System.out.printf("Informe seu percentual: \n");
		per = num2.nextDouble();
		
		Scanner num1 = new Scanner(System.in);
		double salario = 0;
		System.out.printf("Informe seu salário: \n");
		salario = num1.nextDouble();
		
		double aumento = salario * per/100;
		
		System.out.printf("Seu novo salario é = %.2f %n ", (aumento + salario));
	}

}
