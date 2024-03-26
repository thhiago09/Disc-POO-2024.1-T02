package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double alturaDegrau, alturaAlcancar;
		
		System.out.println("Informe a altura de cada degrau: ");
		alturaDegrau = input.nextDouble();
		
		System.out.println("Informe a altura que deseja alcançar : ");
		alturaAlcancar = input.nextDouble();
		
		double quantDegraus = alturaAlcancar/alturaDegrau;
		
		
		
		System.out.println("A quantidade de degraus necessária para alcançar tal altura é: " + quantDegraus);

	}

}
