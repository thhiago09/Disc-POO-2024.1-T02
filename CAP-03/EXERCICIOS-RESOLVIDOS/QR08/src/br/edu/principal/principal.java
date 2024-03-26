package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double deposito = 0;
		double taxa = 0;
		
		Scanner num1 = new Scanner(System.in);
		System.out.print("Informe o valor do deposito \n");
		deposito = num1.nextDouble();
		
        System.out.print("Infome a porcentagem de rendimento\n");
        taxa = num1.nextDouble();
        
        double rend = deposito*(taxa/100);
        double total = deposito+rend;
        System.out.println("O rendimento do seu deposito foi de " + rend + "reais");
        System.out.println("Seu saldo após o rendimento é de " + total + "reais");
	}

}
