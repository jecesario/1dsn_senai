package Exercicio2;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		double altura;
		double peso;
		double imc;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa para calcular o IMC ***");
		System.out.println("Digite seu peso (kg): ");
		peso = in.nextDouble();
		System.out.println("Digite sua altura (m): ");
		altura = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + String.format("%.2f", imc));
		
		in.close();

	}

}
