package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor do salário mínimo: ");
	    vlr_sal = sc.nextDouble();
	    Scanner sc2 = new Scanner(System.in);
	    System.out.println("Digite a quantidade de quilowatts consumida na sua residência:");
	    qtd_kw = sc2.nextDouble();
	    vlr_kw = vlr_sal / 5;
	    vlr_reais = vlr_kw * qtd_kw;
	    desc = vlr_reais * 15 / 100 ;
	    vlr_desc = vlr_reais - desc;
	    System.out.println("O valor de cada quilowatt é igual a: " + vlr_kw);
	    System.out.println("O valor a ser pago por essa residência é de " + (vlr_reais) + "R$");
	    System.out.println("Com um desconto de 15%, o valor a ser pago será de " + (vlr_desc) + "R$" );
	    
	}

}
