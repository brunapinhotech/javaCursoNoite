package manha;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		String resultado = (numero % 2 == 0) ? "par" : "impar";
		System.out.println("O número " + numero + " é " + resultado + ".");
		scanner.close();
	}
}
