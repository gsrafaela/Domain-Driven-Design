package br.com.fiap.checkpoint3;

public class Programa {

	public static void main(String[] args) {
		
		//teste do m�todo calcularImposto
		PessoaFisica c1 = new PessoaFisica("Leandro", 3000);
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Renda: " + c1.getRenda());
		System.out.println("O imposto que Leandro dever� pagar � de: " + c1.calcularImposto());
		System.out.println("------------------------------------");
		PessoaFisica c2 = new PessoaFisica("Pitas", 3001);
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Renda: " + c2.getRenda());
		System.out.println("O imposto que Pitas dever� pagar � de: " + c2.calcularImposto());
		System.out.println("------------------------------------");
		PessoaFisica c3 = new PessoaFisica("Leandro", 1500);
		System.out.println("Nome: " + c3.getNome());
		System.out.println("Renda: " + c3.getRenda());
		System.out.println("O imposto que Leandro dever� pagar � de: " + c3.calcularImposto());
		System.out.println("------------------------------------");
		PessoaJuridica c4 = new PessoaJuridica("FIAP", 10000);
		System.out.println("Nome: " + c4.getNome());
		System.out.println("Renda: " + c4.getRenda());
		System.out.println("O imposto que FIAP dever� pagar � de: " + c4.calcularImposto());
		
		//Estava testando como criar ArrayList por�m n�o consegui
		
		/*ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();
		contribuintes.add(new PessoaFisica("Leandro", 1500));
		contribuintes.add(new PessoaJuridica("FIAP", 10000));
		System.out.println(contribuintes.get(1));*/
	}
	
}
