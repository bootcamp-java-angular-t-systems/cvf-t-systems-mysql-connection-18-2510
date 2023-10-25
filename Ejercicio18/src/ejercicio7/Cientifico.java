package ejercicio7;

public class Cientifico {
	private String DNI;
	private String nomapels;
	
	
	public Cientifico(String dNI, String nomapels) {
		this.DNI = dNI;
		this.nomapels = nomapels;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNomapels() {
		return nomapels;
	}


	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}
	

}
