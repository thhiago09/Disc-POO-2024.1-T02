package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double altura = 0;
		double base = 0;
		
		Scanner num1 = new Scanner(System.in);
		System.out.print("Qual a altura do triangulo? \n");
		altura = num1.nextDouble();
		
		System.out.print("Infome o tamanho da base \n");
		base = num1.nextDouble();
		double area = (base*altura) / 2;
		System.out.println("A área do triangulo é de " + area + " unidades"); 
	}

}
