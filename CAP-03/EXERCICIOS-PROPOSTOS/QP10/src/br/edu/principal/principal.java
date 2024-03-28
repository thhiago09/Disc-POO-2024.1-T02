package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
         System.out.println("Digite a medida do lado de um quadrado em cm");
         num= sc.nextDouble();
         double area = num*num;
         System.out.println("A área do quadrado é de: "+area+" centímetros quadrados");
	}

}
