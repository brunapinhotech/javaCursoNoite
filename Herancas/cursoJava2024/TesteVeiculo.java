package cursoJava2024;

public class TesteVeiculo {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corrola", 2004, 4);
		Carro car = new Carro("Fiat", "Uno", 1998, 2);
		
		Moto moto = new Moto("Honda", "CB500", 2019, true);
		Moto motu = new Moto("BMW", "1200", 2020, false);

		System.out.println("Detalhes do Carro: ");
		carro.exibirDetalhes();
		
		System.out.println("\nDetalhes da Moto: ");
		moto.exibirDetalhes();
		
		System.out.println("\nDetalhes do Carro: ");
		car.exibirDetalhes();
		
		System.out.println("\nDetalhes da Moto: ");
		motu.exibirDetalhes();
	}
}