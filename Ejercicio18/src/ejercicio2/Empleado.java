package ejercicio2;

public class Empleado {
	
	private String DNI;
	private String nombre;
	private String apellidos;
	private int departamento;
	
	
	public Empleado(String DNI, String nombre, String apellidos, int departamento) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getDepartamento() {
		return departamento;
	}


	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

}
