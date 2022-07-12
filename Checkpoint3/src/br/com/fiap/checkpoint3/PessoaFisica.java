package br.com.fiap.checkpoint3;

public class PessoaFisica extends Contribuinte {

	public PessoaFisica(String nome, double renda) {
		super(nome, renda);
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (this.getRenda() > 1500 && this.getRenda() <= 3000) {
			imposto = (this.getRenda() *0.075) - 100;
		} else if(this.getRenda() > 3000) {
			imposto = (getRenda() *0.15) - 225;
		} else {
			imposto = 0;
		}
		return imposto;
	}
}
