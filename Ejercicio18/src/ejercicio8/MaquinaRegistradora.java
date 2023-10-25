package ejercicio8;

public class MaquinaRegistradora {
	private int codigo;
	private static int counter = 0;
	private int piso;
	
	public MaquinaRegistradora(int piso) {
		counter++;
		this.codigo = counter;
		this.piso = piso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	

}
