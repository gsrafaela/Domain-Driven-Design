package br.com.fiap.checkpoint3;

public abstract class Contribuinte {
	
	private String nome;
	private double renda;
	
	public Contribuinte(String nome, double renda) {
		this.setNome(nome);
		this.setRenda(renda);
	}
	
	public abstract double calcularImposto();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

}
