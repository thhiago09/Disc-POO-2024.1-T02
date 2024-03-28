package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Celsius; 
		System.out.printf("Digite a temperatura em Celsius: %n");
		Celsius = sc.nextDouble();
		
		double FH = Celsius * 1.8 + 32;
		System.out.printf("Sua temperatura em Fahrenheit é de: %.2f ", FH);
	}

}
