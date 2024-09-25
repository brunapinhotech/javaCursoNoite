package manha;

public class IfConciso {
	public static void main(String[] args) {

		// Declarando variavel:
		int numero = 7;

		// Uso do if normal:
		/*
		 * if ( numero >= 10 ) { System.out.println( "Valor maior/igual que 10"); } else
		 * { System.out.println("Valor menor que 10"); }
		 */

		// Uso do if ternário
		String resultado = (numero > 10) ? "maior que 10" : "menor que 10";
		System.out.println("O número " + numero + " é " + resultado + ".");
	}
}