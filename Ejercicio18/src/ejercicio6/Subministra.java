package ejercicio6;

public class Subministra {
	private int codigopieza;
	private String idproveedor;
	private int precio;
	
	
	public Subministra(int codigopieza, String idproveedor, int precio) {
		this.codigopieza = codigopieza;
		this.idproveedor = idproveedor;
		this.precio = precio;
	}


	public int getCodigopieza() {
		return codigopieza;
	}


	public void setCodigopieza(int codigopieza) {
		this.codigopieza = codigopieza;
	}


	public String getIdproveedor() {
		return idproveedor;
	}


	public void setIdproveedor(String idproveedor) {
		this.idproveedor = idproveedor;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

}
