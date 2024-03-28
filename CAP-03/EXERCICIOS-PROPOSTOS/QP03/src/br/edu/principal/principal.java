package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite  um número ");
		num1 = sc.nextDouble();
        System.out.println("Digite um número maior que zero");
        num2= sc.nextDouble();
        double di= num1/num2;
        System.out.println(num1+" dividido por "+num2+" é igual a: "+di);
	}

}
