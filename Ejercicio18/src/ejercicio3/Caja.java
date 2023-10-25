package ejercicio3;

public class Caja {
	private String numreferencia;
	private String contenido;
	private int valor;
	private int almacen;
	
	
	public Caja(String numreferencia, String contenido, int valor, int almacen) {
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}


	public String getNumreferencia() {
		return numreferencia;
	}


	public void setNumreferencia(String numreferencia) {
		this.numreferencia = numreferencia;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getAlmacen() {
		return almacen;
	}


	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}

}
