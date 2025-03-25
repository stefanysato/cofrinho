package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar -> " +valor);		
	}

	@Override
	public double converter() {
		double total = valor * 5.68; // *em 25/03/2025
		return total;
	}

	

}
