package ex3;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("---BANCO X---");
		
		Conta conta1 = new Conta();
		
		conta1.nomeCliente = "Leandro";
		conta1.numeroConta = 123456;
		conta1.saldo = 1000;
		conta1.depositar();
		conta1.sacar();
		conta1.getNomeCliente();
	}

}
