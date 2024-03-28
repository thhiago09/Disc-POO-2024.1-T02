package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pesoDoSaco, forGato1, forGato2;
		
		System.out.println("Informe o peso do saco de ração: ");
		pesoDoSaco = input.nextDouble();
		
		System.out.println("Informe a quantidade fornecida para o primeiro gato : ");
		forGato1 = input.nextDouble();
		
		System.out.println("Informe a quantidade fornecida para o segundo gato: ");
		forGato2 = input.nextDouble();
		
		double gastoGato1 = forGato1/1000*5;
		double gastoGato2 =(forGato2/1000*5);
		double pesoAtualDoSaco = pesoDoSaco - gastoGato1 - gastoGato2;
		
		
		System.out.println("O peso atual do saco é: " + pesoAtualDoSaco + " KG");
	}

}
