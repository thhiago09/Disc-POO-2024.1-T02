package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioFixo, valorVendas;
		
		System.out.println("Informe seu salário fixo: ");
		salarioFixo = input.nextDouble();
		
		System.out.println("Informe o valor das vendas: ");
        valorVendas = input.nextDouble();
        
        double valorComissoes = valorVendas/100*4;
        double salarioFinal = salarioFixo + valorComissoes;
        
        System.out.println("Suas comissões foram:  " + valorComissoes);
        System.out.println("Seu salário final foi:  " + salarioFinal);

	}

}
