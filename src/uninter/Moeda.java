package uninter;

public abstract class Moeda {	
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}

	public abstract void info();
	
	public abstract double converter();

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	public static void menu() {
		System.out.println("[ - Selecione a moeda: -- ]");
		System.out.println("1. Real");
		System.out.println("2. Dolar");
		System.out.println("3. Euro");
		System.out.println("[ ----------------------- ]");
	}
}
