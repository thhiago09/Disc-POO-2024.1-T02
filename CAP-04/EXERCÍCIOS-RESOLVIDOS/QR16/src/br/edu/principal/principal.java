package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pre,venda,novoPre;
		System.out.println("Digite a venda média mensal: ");
		venda = input.nextDouble();
		System.out.println("Digite o preco atual: ");
		pre = input.nextDouble();
		if(venda > 500 | pre <30) {
		novoPre = pre + 10/100 *pre;
		}else if(venda >= 500 && venda < 1200 | pre >= 30 && pre <80){
		novoPre = pre + 15/100 * pre;
		}else if(venda >= 1200 || pre >= 80) {
		novoPre = pre - pre*20/100;
		}else {
		novoPre = pre;
		}
		System.out.println("O novo preço é: " + novoPre);

	}

}
