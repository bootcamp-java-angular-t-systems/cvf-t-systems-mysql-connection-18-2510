package ejercicio9;

public class Reserva {
	private String dni;
	private String numserie;
	private String comienzo;
	private String fin;
	
	
	public Reserva(String dni, String numserie, String comienzo, String fin) {
		this.dni = dni;
		this.numserie = numserie;
		this.comienzo = comienzo;
		this.fin = fin;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNumserie() {
		return numserie;
	}


	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}


	public String getComienzo() {
		return comienzo;
	}


	public void setComienzo(String comienzo) {
		this.comienzo = comienzo;
	}


	public String getFin() {
		return fin;
	}


	public void setFin(String fin) {
		this.fin = fin;
	}
	
}
