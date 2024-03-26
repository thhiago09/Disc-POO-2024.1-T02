package br.edu.principal;

import java.util.Scanner;

public class princpal {

	public static void main(String[] args) {
		double raio = 0;
		double area = 0;
		
		Scanner num1 = new Scanner(System.in);
		System.out.print("Informe o raio do circulo \n");
		raio = num1.nextDouble();
		
		area = 3.14*(Math.pow(raio, 2));
		System.out.print("A área do círculo é de " + area + "unidades");


}}
