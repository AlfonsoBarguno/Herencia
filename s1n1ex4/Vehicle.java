package s1n1ex4;

public class Vehicle {
	private static final String material = "Acero";
	private final int ruedas;
	private static int duraci�n;
	
	public Vehicle () {
		
		
		this.duraci�n = duraci�n;
		this.ruedas = 0;
		System.out.println("El veh�culo tiene una duraci�n de "+ duraci�n);
		
	}
	public void iniciar() {
		System.out.println("Con este m�todo se inicia Vehicle.");
	}
	
	public static void parar() {
		System.out.println("Con este m�todo se para Vehicle.");
	}
	public void accelerar() {
		System.out.println("Con este m�todo se acelera Vehicle");
	}
}
