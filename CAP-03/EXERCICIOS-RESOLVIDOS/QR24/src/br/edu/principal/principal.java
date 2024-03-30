package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double hora, h, m, convert;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horário: ");
		hora = sc.nextDouble();
		h = (int)hora;
		m = hora - h;
		convert = (h * 60) + (m * 100);
		System.out.println("A hora digitada equivale a " + convert + " minutos");
		
	}

}
