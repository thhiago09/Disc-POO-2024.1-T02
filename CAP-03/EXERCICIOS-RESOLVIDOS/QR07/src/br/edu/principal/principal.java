package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double gratificacao = 50;
		double imposto = 0.10;
		
		Scanner num1 = new Scanner(System.in);
		double salario = 0;
		System.out.printf("Informe seu salário: \n");
		salario = num1.nextDouble();
		
		double salarioAumentado = salario + gratificacao;
		
		double rSalario = salarioAumentado - (salario * imposto);
		System.out.printf("O seu salario pendente é de: %.2f %n", rSalario);

	}

}
