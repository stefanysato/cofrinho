package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro -> " +valor);		
	}

	@Override
	public double converter() {
		double total = valor * 6.14; // *em 25/03/2025
		return total;
	}

}
