package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println("Euro -> " +valor);		
	}

	@Override
	public double converter() {
		double total = valor * 6.20;
		return total;
	}

		
	
}
