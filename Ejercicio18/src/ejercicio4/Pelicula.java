package ejercicio4;

public class Pelicula {
	private int codigo;
	private static int counter = 0;
	private String nombre;
	private int calificacionedad;
	
	
	public Pelicula(String nombre, int calificacionedad) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCalificacionedad() {
		return calificacionedad;
	}
	public void setCalificacionedad(int calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	
	
}
