package ejercicio8;

public class Cajero {
	private int codigo;
	private static int counter = 0;
	private String nomapels;
	
	
	public Cajero(String nomapels) {
		counter++;
		this.codigo = counter;
		this.nomapels = nomapels;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNomapels() {
		return nomapels;
	}


	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}
	
	

	
}
