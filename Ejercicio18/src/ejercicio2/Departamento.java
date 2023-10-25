package ejercicio2;

public class Departamento {
	private int codigo;
	private static int counter = 0;
	private String nombre;
	private int presupuesto;
	
	
	public Departamento(String nombre, int presupuesto) {
		counter++;
		this.codigo = counter;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
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


	public int getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

}
