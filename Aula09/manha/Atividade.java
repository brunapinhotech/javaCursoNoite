package manha;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha o seu horário de trabalho:");
		System.out.println("1. 06h às 11h");
		System.out.println("2. 12h às 17h");
		System.out.println("3. 18h às 23h");
		System.out.println("4. 00h às 05h");

		int opcao = scanner.nextInt();
		String hora = "";
		switch (opcao) {
		case 1:
			hora = "seu horário será das 06h às 11h! Um bom dia.";
			break;
		case 2:
			hora = "seu horário será das 12h às 17h! Uma boa tarde.";
			break;
		case 3:
			hora = "seu horário será das 18h às 23h! Uma boa noite.";
			break;
		case 4:
			hora = "seu horário será das 00h às 05h! Boa madrugada.";
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
			System.exit(0);
		}
		System.out.println("A opção escolhida foi aceita e " + hora);
		scanner.close();
	}
}