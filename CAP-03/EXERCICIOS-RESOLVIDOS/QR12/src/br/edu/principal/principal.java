package IFCE.edu.br;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		double r1=0;
		double r2=0;
		
		Scanner num= new Scanner(System.in);
		System.out.println("Digite um número.");
		num1 = num.nextDouble();   
		
		System.out.println("Digite outro número");
		num2= num.nextDouble();
		
		
		r1= Math.pow(num1, num2);
		r2= Math.pow(num2, num1);
		System.out.println(num1 +" elevado a "+num2+" é igual a "+r1);
		System.out.println(num2 +" elevado a " +num1+" é igual a "+r2);
		

	}

}
