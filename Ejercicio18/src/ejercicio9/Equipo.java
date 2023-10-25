package ejercicio9;

public class Equipo {
	private String numserie;
	private String nombre;
	private int facultad;
	
	
	public Equipo(String numserie, String nombre, int facultad) {
		this.numserie = numserie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public String getNumserie() {
		return numserie;
	}


	public void setNumserie(String numserie) {
		this.numserie = numserie;
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
