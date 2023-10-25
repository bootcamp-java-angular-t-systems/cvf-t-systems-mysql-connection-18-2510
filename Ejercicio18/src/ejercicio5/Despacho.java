package ejercicio5;

public class Despacho {
	private int numero;
	private static int counter = 0;
	private int capacidad;
	
	
	public Despacho(int capacidad) {
		counter++;
		this.numero = counter;
		this.capacidad = capacidad;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

}
