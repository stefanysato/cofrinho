package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	// Lista de moedas
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	
	public void menu() {
		System.out.println("[ --- Cofrinho - Menu --- ]");
		System.out.println("1. Adicionar moeda");
		System.out.println("2. Remover moeda");
		System.out.println("3. Listar todas as moedas");
		System.out.println("4. Calcular total (em R$)");
		System.out.println("0. Encerrar programa");
		System.out.println("[-------------------------]");
	}

	public void adicionar(Moeda moeda) {
		moedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		if (moedas.isEmpty()) {
			System.out.println("Cofre vazio!");
			System.out.println();
		} else {
			moedas.remove(moeda);
		}
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
