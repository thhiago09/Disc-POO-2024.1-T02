package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double custo, convite, qtdvendas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do custo do espetáculo: ");
		custo = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o valor do convite desse espetáculo: ");
		convite = sc2.nextDouble();
		qtdvendas = custo / convite;
		System.out.println("A quantidade mínima de convites que devem ser vendidos é: " + qtdvendas);
	}

}
