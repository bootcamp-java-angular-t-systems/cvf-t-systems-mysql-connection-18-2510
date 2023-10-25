package ejercicio4;

public class Sala {
	private int codigo;
	private static int counter = 0;
	private String nombre;
	private int pelicula;
	
	
	public Sala(String nombre, int pelicula) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPelicula() {
		return pelicula;
	}
	public void setPelicula(int pelicula) {
		this.pelicula = pelicula;
	}
	
	
	

}
