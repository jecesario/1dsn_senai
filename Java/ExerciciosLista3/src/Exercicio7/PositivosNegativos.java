package Exercicio7;

import java.util.Scanner;

public class PositivosNegativos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int zero = 0, positivos = 0, negativos = 0, numero = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite um número (Positivo ou Negativo): ");
			numero = in.nextInt();
			
			if(numero < 0) {
				negativos++;
			} else if(numero > 0) {
				positivos++;
			} else {
				zero++;
			}
		}
		
		in.close();
		
		System.out.println("Positivos: "+positivos+" Negativos: "+negativos+" Zeros: "+zero);

	}

}
