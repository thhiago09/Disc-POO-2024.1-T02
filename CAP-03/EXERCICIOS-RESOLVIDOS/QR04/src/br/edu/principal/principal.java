package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner num1 = new Scanner(System.in);
		double salario = 0;
		System.out.printf("Informe seu salário: \n");
		salario = num1.nextDouble();
		
		double ns = salario * 1.25;
		
		System.out.printf("O seu salário após o aumento será de: %.2f %n ", ns);

	}

}
