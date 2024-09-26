package cursoJava2024;

public class ClassesMetodos {

	public String numero;

	// Método 1: Calcula a soma de 2 valores:
	public int soma(int a, int b) {
		return a + b;

	}

	// Método 2: Verifica se um número é PAR:
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	// Método 3: Inverte uma String
	static String texto1 = "Pinho";
	static String texto2 = "Bruna";

	// Método 4: Calcula o fatorial do número 4
	public int fatorial(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return numero * fatorial(numero - 1);

	}

	// Método 5: Encontra o maior número em um array de inteiros
	public int maiorNumero(int[] numeros) {
		int maior = numeros[0];
		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		return maior;
	}

	// Este método executa outros métodos!
	public static void main(String[] args) {

		// Instanciando a classe que criamos:
		ClassesMetodos util = new ClassesMetodos();

		// Chamando os métodos:
		System.out.println("Soma de 5 e 3: " + util.soma(5, 3));
		System.out.println("O número 4 é par? " + util.ehPar(4));
		System.out.println("Nome completo: " + texto2.substring(0) + " " + texto1.substring(0));
		System.out.println("O fatorial de 5 é: " + util.fatorial(5));
		int [] numeros = {1, 5, 6, 8, 44};
		System.out.println("O maior numero do Array é: " + util.maiorNumero(numeros));
	}
}
