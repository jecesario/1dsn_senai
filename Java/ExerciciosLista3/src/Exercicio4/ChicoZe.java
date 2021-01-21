package Exercicio4;

public class ChicoZe {

	public static void main(String[] args) {
			
			double chico = 1.5, ze = 1.1, anos = 0;
			
			while (chico >= ze) {
				chico = chico+0.02;
				ze = ze+0.03;
				anos++;
			}
			System.out.println("Demorou "+anos+" anos para Zé ficar maior que chico!");
			
	}
	
}
