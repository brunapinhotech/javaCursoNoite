package manha;

import java.util.Scanner;

public class At3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("que horas são?");
			int n1 = scanner.nextInt();

			switch (n1) {
			case 6, 7, 8, 9, 10, 11:
				System.out.println("ola! bom dia.");
				break;

			case 12, 13, 14, 15, 16, 17:
				System.out.println("boa tarde!");
				break;
			case 18, 19, 20, 21, 22, 23:
				System.out.println("tenha uma boa noite!");
			default:
				System.out.println("vai dormir, voce é corno nao morcego!");

			}
		}

	}

}