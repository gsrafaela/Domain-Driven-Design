package checkpoint2;

public class ContaBancaria {
	
	//atributos
	private int numConta;
	private String tipo; //cc ou cp
	private String dono; //titular da conta
	private double saldo;
	private boolean status; //true or false
	
	//metodo construtor
	public ContaBancaria() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	

	//metodos personalizados ou operacionais
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + (this.isStatus()? "Ativa" : "Inativa"));
	}
	public void tipoConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if(t.equals("cc")) {
			this.setSaldo(50);
		}else if(t.equals("cp")) {
			this.setSaldo(150);
		}else {
			System.out.println("Formato de conta inválida, não foi possível abrir a conta.");
			this.setStatus(false);
		}	
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não encerrada");
			System.out.println("Saldo positivo: " + this.getSaldo());
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta não encerrada");
			System.out.println("Saldo negativo " + this.getSaldo());
		}else {
			this.setStatus(false);
			System.out.println("Conta encerrada com sucesso.");
		}
	}
	
	public void depositar(double v) {
		if(this.isStatus()) {
			this.saldo = this.saldo + v; // ou this.saldo += v
			System.out.println("Depósito realizado!");
		}else {
			System.out.println("Não foi possível realizar o depósito");
			System.out.println("Motivo: " + (this.isStatus()? "Conta ativa" : "Conta inativa"));
		}
	}
	
	public void sacar(double v) {
		if(this.isStatus()) {
			if(this.getSaldo() > v) {
				this.saldo = this.saldo - v; // ou this.saldo -= v
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado!");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Saque não realizado - Conta Inativa");
		}
	}
	
	public void pagarMensalidade() {
		float v = 0;
		if(this.tipo.equals("cc")) {
			v = 12;
		}else if (this.tipo.equals("cp")) {
			v = 20;
		}
		if(this.isStatus()) {
			this.saldo -= v;
		}
	}
	
	//getters and setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
	
	
