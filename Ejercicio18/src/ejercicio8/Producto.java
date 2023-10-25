package ejercicio8;

public class Producto {
	private int codigo;
	private static int counter = 0;
	private String nombre;
	private int precio;
	
	
	public Producto(String nombre, int precio) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
		this.precio = precio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
