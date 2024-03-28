package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cateto1, cateto2;
		
		System.out.println("Informe o primeiro cateto: ");
		cateto1 = input.nextDouble();
		
		System.out.println("Informe o segundo cateto: ");
        cateto2 = input.nextDouble();
        
        double hipotenusaAoQuad = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double hipotenusa = Math.pow(hipotenusaAoQuad, 0.5 );
       
        
        System.out.println("A hipotenusa desse triângulo é:  " + hipotenusa);
	}

}
