package cursoJava2024;

public class VerificandoPrimos {

	public static boolean primo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int numero = 7;
		if (primo(numero)) {
			System.out.println(numero + " é um número primo");
		} else {
			System.out.println(numero + " não é um número primo");
		}
	}
}
