package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double horasTrabalhadas, salarioMin;
		
		System.out.println("Informe o número de horas trabalhadas: ");
		horasTrabalhadas = input.nextDouble();
		
		System.out.println("Informe o salário mínimo: ");
		salarioMin = input.nextDouble();
		
		double valorDaHora = salarioMin/2 ;
		double salarioBruto = horasTrabalhadas*valorDaHora;
		double imposto = salarioBruto/100*3;
		double salarioAReceber = salarioBruto - imposto;
		
		System.out.println("O salário a receber é : " + salarioAReceber);
	}

}
