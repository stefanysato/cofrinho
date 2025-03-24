package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	// Lista de moedas
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

	public void adicionar(Moeda moeda) {
		moedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		moedas.remove(moeda);
	}
	
	public void listarMoedas() {
		for (Moeda m : moedas) {
			m.info();
		}
	}
	
	public double totalConvertido() {
		double total = 0;
		for (Moeda m : moedas) {
			total += m.converter();
		}
		
		return total;
	}
	
}
