package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double gratificacao = 1.05;
		double imposto = 1.07;
		
		Scanner num1 = new Scanner(System.in);
		double salario = 0;
		System.out.printf("Informe seu salário: \n");
		salario = num1.nextDouble();
		
		double salarioAumentado = salario * gratificacao;
		
		double rSalario = salarioAumentado - (salario * 0.07);
		System.out.printf("o seu salario apos todas as alterações será: %.2f %n", rSalario);
	}

}
