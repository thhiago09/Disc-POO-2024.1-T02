package IFCE.edu.br;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double num=0;
		double quad=0;
		double cubo=0;
		double r1=0;
		double r2=0;
		Scanner num1= new Scanner(System.in);
		System.out.println("Digite um número maior que 0.");
		num= num1.nextDouble();
		
		quad= Math.pow(num, 2);
		cubo= Math.pow(num, 3);
		r1= Math.pow(num, (1.0/2));
		r2= Math.pow(num, (1.0/3));
		
		System.out.println("O quadrado desse número é:"+quad);
		System.out.println("O cubo desse número é:"+cubo);
		System.out.println("A raíz quadrada desse número  é:"+r1);
		System.out.println("A raíz cúbica desse número é:"+r2);
		
		

	}

}
