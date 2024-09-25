package manha;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite mais um número: ");
		int numero2 = scanner.nextInt();
		int maior = (numero1 > numero2) ? numero1 : numero2;

		System.out.println("O maior número entre eles é: " + maior);

		scanner.close();
	}
}
