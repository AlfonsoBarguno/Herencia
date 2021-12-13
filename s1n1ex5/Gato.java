package s1n1ex5;

public class Gato extends Animal {
	private String bigotes;
	private int numBotas;
	
	public void correr (String bigotes, int numBotas) {
		System.out.println("El gato tiene "+bigotes+" y un total de "+numBotas+" botas.");
	}
}
