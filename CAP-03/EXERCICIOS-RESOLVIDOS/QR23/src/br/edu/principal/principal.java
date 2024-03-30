package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		float num1, inteiro, decimal, arredond;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número real: ");
		num1 = sc.nextFloat();
		inteiro = (int)num1;
		System.out.println("A parte inteira do número digitado é "+ inteiro);
		decimal = num1 - inteiro;
		System.out.println("A parte decimal do número digitado é: " + decimal);
		arredond = Math.round(num1);
		System.out.println("O número que foi digitado é " + arredond + " na forma arredondada");
		
	}

}
