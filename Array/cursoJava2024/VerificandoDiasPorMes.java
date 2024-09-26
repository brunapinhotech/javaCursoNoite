package cursoJava2024;

import java.util.Scanner;

public class VerificandoDiasPorMes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome de um mês: ");
		String mes = scanner.nextLine().trim().toLowerCase();

		switch (mes) {
		case "janeiro":
		case "março":
		case "maio":
		case "julho":
		case "agosto":
		case "outubro":
		case "dezembro":
			System.out.println("O mês escolhido tem 31 dias.");
			break;

		case "abril":
		case "junho":
		case "setembro":
		case "novembro":
			System.out.println("O mês escolhido tem 30 dias.");
			break;

		case "fevereiro":
			System.out.println("O mês escolhido tem 28 ou 29 dias (ano bissexto).");
			break;

		default:

			System.out.println("Mês inválido. Por favor, informe um mês válido.");
			break;
		}

		scanner.close();
	}
}