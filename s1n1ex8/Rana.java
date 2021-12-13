package s1n1ex8;

public class Rana extends Anfibio {

	private int distancia;
	private double kilos;
	private boolean respirar;

	public void moverse(int distancia) {
		System.out.println("Con este método se mueve.");
	}

	public void comer(double kilos) {
		System.out.println("Con este método come.");
	}

	public void respirar(boolean respirar) {
		System.out.println("Con este método respirar.");
	}
}
