package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Digite o tamanho da escada: ");
	    double escada = sc.nextDouble();
	    System.out.println("Digite a altura que deseja pregar o quadro: ");
	    Scanner sc2 = new Scanner(System.in);
	    double altquadro = sc2.nextDouble();
	    double dist = Math.sqrt(Math.pow(escada, 2) - (Math.pow(altquadro, 2)));
	    System.out.println("Para pregar o quadro, a escada deve estar a "+  dist + " metros de distância da parede.");
	}

}
