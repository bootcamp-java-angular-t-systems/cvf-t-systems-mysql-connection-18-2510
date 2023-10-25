package ejercicio3;

public class Almacen {
	private int codigo;
	private static int counter = 0;
	private String lugar;
	private int capacidad;
	
	public Almacen(String lugar, int capacidad) {
		counter++;
		this.codigo = counter;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
