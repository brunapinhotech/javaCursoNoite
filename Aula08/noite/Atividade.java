package noite;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um dia da semana");
		System.out.println("1. Segunda-feira");
		System.out.println("2. Terça-feira");
		System.out.println("3. Quarta-feira");
		int opcao = scanner.nextInt();
		String semana = "";
		switch (opcao) {
		case 1:
			semana = "Segunda-feira";
			break;
		case 2:
			semana = "Terça-feira";
			break;
		case 3:
			semana = "Quarta-feira";
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
			System.exit(0);
		}
		System.out.println("O dia da semana escolhido foi " + semana + ".");
		scanner.close();
	}
}