package ejercicio5;

public class Director {
	private String DNI;
	private String nomapels;
	private String DNIJefe;
	private int despacho;
	
	
	public Director(String dNI, String nomapels, String DNIJefe, int despacho) {
		this.DNI = dNI;
		this.nomapels = nomapels;
		this.DNIJefe = DNIJefe;
		this.despacho = despacho;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		this.DNI = dNI;
	}


	public String getNomapels() {
		return nomapels;
	}


	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}


	public String getDNIJefe() {
		return DNIJefe;
	}


	public void setDNIJefe(String DNIJefe) {
		this.DNIJefe = DNIJefe;
	}


	public int getDespacho() {
		return despacho;
	}


	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	
}
