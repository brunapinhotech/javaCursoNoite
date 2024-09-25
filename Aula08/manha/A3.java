package manha;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos anos você tem? ");
		int numero = scanner.nextInt();
		String resultado = (numero >= 18) ? "maior de" : "menor de";
		System.out.println(numero + " você é " + resultado + " idade.");
		scanner.close();
	}
}
