package cursoJava2024;

public class Array {

	public int soma(int a, int b) {
		return a + b;
	}

	public int subtra(int a, int b) {
		return a - b;
	}

	public int multip(int a, int b) {
		return a * b;
	}

	public int divisao(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Array uti = new Array();

		System.out.println("A Soma de 5 e 3 é: " + uti.soma(5, 3));
		System.out.println("A Subtração de 8 menos 2 é: " + uti.subtra(8, 2));
		System.out.println("A Multiplicação de 6 vezes o 9 é: " + uti.multip(6, 9));
		System.out.println("A Divisão de 9 por 3 é: " + uti.divisao(9, 3));

	}

}
