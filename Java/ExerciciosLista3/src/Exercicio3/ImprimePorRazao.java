package Exercicio3;

import java.util.Scanner;

public class ImprimePorRazao {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero para inicio: ");
		int inicio = in.nextInt();
		System.out.println("Digite um numero para quantidade: ");
		int qnt = in.nextInt();
		System.out.println("Digite um numero para razao: ");
		int razao = in.nextInt();
		
		System.out.println("Inicio: "+inicio+" Quantidade: "+qnt+" Razão: "+razao);
		
		for(int i = 0; i < qnt; i++) {
			System.out.println(inicio);
			inicio = inicio + razao;
		}
		
		in.close();
	}
	
}
