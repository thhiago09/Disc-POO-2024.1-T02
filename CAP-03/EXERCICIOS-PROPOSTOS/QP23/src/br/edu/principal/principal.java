package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double ang1, ang2;
		
		System.out.println("Informe o valor em gruas do primeiro ângulo: ");
		ang1 = input.nextDouble();
		
		System.out.println("Informe o valor em graus do segundo ângulo: ");
        ang2 = input.nextDouble();
       
        double ang3 = 180 - ang1 - ang2;
    
        System.out.println("O terceiro ângulo de triângulo tem:  " + ang3 + " graus");
	}

}
