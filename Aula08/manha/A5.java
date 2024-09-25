package manha;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Digite mais um número: ");
		int numero2 = scanner.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma deles é: " + soma);
		scanner.close();
	}

}
