package s1n1ex4;

public class Vehicle {
	private static final String material = "Acero";
	private final int ruedas;
	private static int duración;
	
	public Vehicle () {
		
		
		this.duración = duración;
		this.ruedas = 0;
		System.out.println("El vehículo tiene una duración de "+ duración);
		
	}
	public void iniciar() {
		System.out.println("Con este método se inicia Vehicle.");
	}
	
	public static void parar() {
		System.out.println("Con este método se para Vehicle.");
	}
	public void accelerar() {
		System.out.println("Con este método se acelera Vehicle");
	}
}
