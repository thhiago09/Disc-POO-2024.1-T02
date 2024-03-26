package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario, cheque1, cheque2;
		
		System.out.println("Informe o salario depositado: ");
		salario = input.nextDouble();
		
		System.out.println("Informe o primeiro valor retirado: ");
		cheque1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor retirado: ");
		cheque2 = input.nextDouble();
		
		double valorRetirado1 = cheque1 + cheque1/10000*38;
		double valorRetirado2 =  cheque2 + cheque2/10000*38;
		double saldoAtual = salario - valorRetirado1 - valorRetirado2;
		
		
		System.out.println("O saldo atual da conta é : " + saldoAtual);
	}

}
