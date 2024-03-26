package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double precoDeFabrica, percentDeLucro, porcentImpostos;
		
		System.out.println("Informe o preço de fábrica: ");
		precoDeFabrica = input.nextDouble();
		
		System.out.println("Informe o percentual de lucro: ");
		percentDeLucro = input.nextDouble();
		
		System.out.println("Informe o percentual de impostos: ");
		porcentImpostos = input.nextDouble();
		
		double lucro = precoDeFabrica * (percentDeLucro/100);
		double impostos = precoDeFabrica * (porcentImpostos/100);
		double valorFin = precoDeFabrica + impostos + lucro;
		
		System.out.println("O lucro do vendedor foi: " + lucro);
		System.out.println("O valor de impostos foi: " + impostos);
		System.out.println("O valor total do veículo foi: " + valorFin);

	}

}
