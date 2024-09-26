package cursoJava2024;

public class CopasDoMundo {
	public static void main(String[] args) {

		int ano = 1930;

		while (ano <= 2024) {

			if (ano == 1942 || ano == 1946) {
				ano += 4;
				continue;
			}

			System.out.println(ano);

			ano += 4;
		}
	}
}
