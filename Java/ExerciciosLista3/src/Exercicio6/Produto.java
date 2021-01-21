package Exercicio6;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		
		int produto = 1;
		int numero = 1;
		Scanner in = new Scanner(System.in);
		while(numero != 0) {
			System.out.println("Adicione números para saber o produto \nAperte 0 para saber o resultado");
			numero = in.nextInt();
			
			if(numero != 0 ) {
				produto *= numero;
			}
		}
		
		in.close();
		
		System.out.println("Produto: "+produto);
	}
	
}
