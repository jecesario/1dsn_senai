package Exercicio3;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {

		int mes;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa que retorna o mês com base no número ***");
		System.out.println("Digite um número de 1 a 12: ");
		mes = in.nextInt();
		
		switch(mes) {
			case 1:
				System.out.println("Mês: Janeiro");
				break;
			case 2:
				System.out.println("Mês: Fevereiro");
				break;
			case 3:
				System.out.println("Mês: Março");
				break;
			case 4:
				System.out.println("Mês: Abril");
				break;
			case 5:
				System.out.println("Mês: Maio");
				break;
			case 6:
				System.out.println("Mês: Junho");
				break;
			case 7:
				System.out.println("Mês: Julho");
				break;
			case 8:
				System.out.println("Mês: Agosto");
				break;
			case 9:
				System.out.println("Mês: Setembro");
				break;
			case 10:
				System.out.println("Mês: Outubro");
				break;
			case 11:
				System.out.println("Mês: Novembro");
				break;
			case 12:
				System.out.println("Mês: Dezembro");
				break;
			default:
				System.out.println("Valor digitado diferente de um número de 1 a 12!");
		}
		
		in.close();
	}

}
