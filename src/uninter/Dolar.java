package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println("Dolar -> " +valor);		
	}

	@Override
	public double converter() {
		double total = valor * 5.75;
		return total;
	}

	

}
