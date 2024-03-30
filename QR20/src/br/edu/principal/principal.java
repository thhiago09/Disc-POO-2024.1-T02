package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double alt, ang, escada, tograus;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite aqui a medida do ângulo em graus: ");
		ang = sc.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite aqui a altura em metros da parede onde está a ponta da escada:");
		alt = sc2.nextDouble();
		tograus = ang * 3.14 / 180;
		escada = alt / Math.sin(tograus);
		escada = Math.round(escada);
		System.out.println("A escada tem medida igual a: " + escada + " metros");
	}

}
