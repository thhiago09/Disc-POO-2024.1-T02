package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double peso;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Digite aqui seu peso em quilogramas: ");
	    peso = sc.nextDouble();
	    double nvp1 = peso + (peso * 0.15);
	    System.out.println("Se seu peso aumentar em 15%, você terá um peso de: " + nvp1 + "Kg.");
	    double nvp2 = peso - (peso * 0.20);
	    System.out.println("Se seu peso diminuir em 20%, você terá um peso de: " + nvp2 + "Kg.");
	}

}
