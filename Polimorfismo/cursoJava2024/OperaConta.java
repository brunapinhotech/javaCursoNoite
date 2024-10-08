package cursoJava2024;

public class OperaConta {

	public static void main(String[] args) {
		// Criação de conta com saldo inicial de R$ 1000,00:
		ContaBancaria conta = new ContaBancaria(1000.00);

		// Operando a conta do Cliente:
		// 1) Exibir o saldo inicial da conta:
		System.out.println("Saldo Inicial: " + conta.getSaldo());

		// 2) Realizando um depósito:
		conta.depositar(56.80);
		System.out.println("Saldo atual após o depósito de R$" + conta.getSaldo());
		// 3) Realizando um saque:
		conta.sacar(345);
		System.out.println("Saldo atual após o saque de R$" + conta.getSaldo());
	}
}