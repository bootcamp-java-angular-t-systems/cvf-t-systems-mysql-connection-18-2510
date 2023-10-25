package ejercicio1;

public class Articulo {
	
	private int codigo;
	private static int counter = 0;
	private String nombre;
	private int precio;
	private int fabricante;
	
	
	public Articulo(String nombre, int precio, int fabricante) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
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


	public int getFabricante() {
		return fabricante;
	}


	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}
}
