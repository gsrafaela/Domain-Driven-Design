package ex1;

public class Contador {

	int cont;

	public void zerarContador() {
		cont = 0;
	}
	
	public void incrementarContador() {
		cont = cont++;
	}
	
	public int obterContador() {
		return cont;
	}
}