package Exercicio4;

public class Temperatura {

	public static void main(String[] args) {
		double celsius = 0;
		double fahrenheit;
		
		for(int i = 0; i < 100; i++) {
			fahrenheit = (celsius * 1.8) + 32;
			System.out.println(celsius + "° Celsius é igual a " + String.format("%.1f", fahrenheit) + "° Fahrenheit");
			celsius++;
		}

	}

}
