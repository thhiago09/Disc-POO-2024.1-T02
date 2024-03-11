package IFCE.edu.br;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double pes=0;
		Scanner num= new Scanner(System.in);
		System.out.println("Digite uma medida  de distância em pés");
		pes = num.nextDouble();
		double jarda= pes/3;
		double milha=jarda/1760;
		double polegadas= pes*12;
		System.out.println(pes+" pés é igual a "+polegadas+" polegadas");
		System.out.println(pes+" pés é igual a "+jarda+" jardas");
		System.out.println(pes+" pés é igual a "+milha+" milhas");

	}

}
