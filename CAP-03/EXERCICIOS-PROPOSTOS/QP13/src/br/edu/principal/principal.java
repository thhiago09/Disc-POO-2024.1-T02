package br.edu.principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
	int num, mult;
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite um número");
	num= sc.nextInt();
	for(int i=0; i<=10; i++) {
		mult= num*i;
		System.out.println(num+" x "+i+" = "+mult);
		
	}
	}

}
