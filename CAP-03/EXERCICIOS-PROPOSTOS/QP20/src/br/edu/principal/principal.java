package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double ang, dist;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui o valor do ângulo: ");
		ang = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite aqui a medida da distancia que a escada está da parede em metros: ");
		dist = sc2.nextDouble();
		double tograus = ang * 3.14 / 180;
		double medescada = dist/Math.cos(tograus);
		medescada = Math.round(medescada);
		System.out.println("A medida da escada necessária para alcançar sua ponta é igual a: "+ medescada);
	}

}
