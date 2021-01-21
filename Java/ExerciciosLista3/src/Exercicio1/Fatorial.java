package Exercicio1;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Programa para fatorial ***");
		System.out.println("Digite um numero inteiro: ");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		int resultado = 1;
		if(numero > 0) {
			for(int i=1; i<=numero; i++) {
				resultado *= i;
			}
			System.out.println("O Fatorial de: "+numero+" é : "+resultado);
		} else {
			System.out.println("O número passado não é inteiro!");
		}
		
		in.close();

	}

}
