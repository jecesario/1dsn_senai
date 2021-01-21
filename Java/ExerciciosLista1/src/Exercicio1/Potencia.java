package Exercicio1;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		int numero;
		int resultado;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa que calcula um número elevado a 3 ***");
		System.out.println("Digite um número: ");
		numero = in.nextInt();
		
		resultado = (int) Math.pow(numero, 3);
		
		System.out.println(numero + "³ é igual a: " + resultado);
		
		in.close();

	}

}
