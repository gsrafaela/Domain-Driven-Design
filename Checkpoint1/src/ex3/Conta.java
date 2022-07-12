package ex3;

import java.util.Scanner;

public class Conta {

	Scanner input = new Scanner(System.in);

	String nomeCliente;
	int numeroConta;
	double saldo;
	double novoSaldo;

	public void depositar() {

		System.out.println("Digite o valor do depósito: ");
		double deposito = input.nextDouble();
		double novoSaldo = saldo + deposito;
		System.out.println("Depósito realizado com sucesso, o seu saldo agora é de: " + novoSaldo);

	}

	public void sacar() {

		System.out.println("Digite o valor de saque: ");
		double saque = input.nextDouble();
		double novoSaldo2 = saldo - saque;
		System.out.println("Saque realizado com sucesso, o seu novo saldo é: " + novoSaldo);

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

}
