package br.com.fiap.checkpoint3;

public class PessoaJuridica extends Contribuinte {

	public PessoaJuridica(String nome, double renda) {
		super(nome, renda);
	}

	@Override
	public double calcularImposto() {
		double imposto;
		imposto = this.getRenda() * 0.10;
		return imposto;
	}
}
