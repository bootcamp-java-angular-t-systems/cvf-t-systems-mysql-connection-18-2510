package ejercicio8;

public class Venta {
	private int cajero;
	private int maquina;
	private int producto;
	
	
	public Venta(int cajero, int maquina, int producto) {
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}


	public int getCajero() {
		return cajero;
	}


	public void setCajero(int cajero) {
		this.cajero = cajero;
	}


	public int getMaquina() {
		return maquina;
	}


	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}


	public int getProducto() {
		return producto;
	}


	public void setProducto(int producto) {
		this.producto = producto;
	}

}
