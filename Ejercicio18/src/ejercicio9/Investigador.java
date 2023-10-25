package ejercicio9;

public class Investigador {
	private String dni;
	private String nombre;
	private int facultad;
	
	
	public Investigador(String dni, String nombre, int facultad) {
		this.nombre = nombre;
		this.facultad = facultad;
		this.dni = dni;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getFacultad() {
		return facultad;
	}


	public void setFacultad(int facultad) {
		this.facultad = facultad;
	}

	

}
