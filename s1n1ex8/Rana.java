package s1n1ex8;

public class Rana extends Anfibio {

	private int distancia;
	private double kilos;
	private boolean respirar;

	public void moverse(int distancia) {
		System.out.println("Con este m�todo se mueve.");
	}

	public void comer(double kilos) {
		System.out.println("Con este m�todo come.");
	}

	public void respirar(boolean respirar) {
		System.out.println("Con este m�todo respirar.");
	}
}
