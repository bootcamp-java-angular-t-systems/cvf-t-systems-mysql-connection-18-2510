package ejercicio8;

import java.util.ArrayList;

import conexion.Conexion;
import ejercicio7.Asignado;
import ejercicio7.Cientifico;
import ejercicio7.Proyecto;

public class Ejercicio8MainApp {
	
	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio8");
		
		 Cajero cajero1 = new Cajero("Ferran Velasco");
		 Cajero cajero2 = new Cajero("Amparo Rodenas");
		 Cajero cajero3 = new Cajero("Sara Velasco");
		 Cajero cajero4 = new Cajero("Andreu Alvarez");
		 Cajero cajero5 = new Cajero("Nil Miro");

		 
		 connect.createTable("Ejercicio8", cajero1, "codigo");
		 
		 connect.insertData("Ejercicio8", cajero1);
		 connect.insertData("Ejercicio8", cajero2);
		 connect.insertData("Ejercicio8", cajero3);
		 connect.insertData("Ejercicio8", cajero4);
		 connect.insertData("Ejercicio8", cajero5);
		 
		 
		 

		 Producto producto1 = new Producto("Producto 1", 39);
		 Producto producto2 = new Producto("Producto 2", 2342);
		 Producto producto3 = new Producto("Producto 3", 543);
		 Producto producto4 = new Producto("Producto 4", 33);
		 Producto producto5 = new Producto("Producto 5", 653);

		 connect.createTable("Ejercicio8", producto1, "codigo");
		 
		 connect.insertData("Ejercicio8", producto1);
		 connect.insertData("Ejercicio8", producto2);
		 connect.insertData("Ejercicio8", producto3);
		 connect.insertData("Ejercicio8", producto4);
		 connect.insertData("Ejercicio8", producto5);
		 
		 
		 
		 MaquinaRegistradora maquina1 = new MaquinaRegistradora(1);
		 MaquinaRegistradora maquina2 = new MaquinaRegistradora(2);
		 MaquinaRegistradora maquina3 = new MaquinaRegistradora(3);
		 MaquinaRegistradora maquina4 = new MaquinaRegistradora(4);
		 MaquinaRegistradora maquina5 = new MaquinaRegistradora(5);
		 
		 connect.createTable("Ejercicio8", maquina1, "codigo");
		 
		 connect.insertData("Ejercicio8", maquina1);
		 connect.insertData("Ejercicio8", maquina2);
		 connect.insertData("Ejercicio8", maquina3);
		 connect.insertData("Ejercicio8", maquina4);
		 connect.insertData("Ejercicio8", maquina5);
		 
		 
		 
		 Venta venta1 = new Venta(cajero1.getCodigo(), maquina3.getCodigo(), producto2.getCodigo());
		 Venta venta2 = new Venta(cajero2.getCodigo(), maquina4.getCodigo(), producto1.getCodigo());
		 Venta venta3 = new Venta(cajero3.getCodigo(), maquina5.getCodigo(), producto1.getCodigo());
		 Venta venta4 = new Venta(cajero4.getCodigo(), maquina4.getCodigo(), producto4.getCodigo());
		 Venta venta5 = new Venta(cajero1.getCodigo(), maquina3.getCodigo(), producto5.getCodigo());

		 ArrayList<String> pks = new ArrayList<String>();
		 pks.add("cajero");
		 pks.add("maquina");
		 pks.add("producto");
		 
		 connect.createTable("Ejercicio8", venta1, pks, ", FOREIGN KEY (cajero) REFERENCES cajeros (codigo), FOREIGN KEY (maquina) REFERENCES maquinaRegistradoras (codigo), FOREIGN KEY (producto) REFERENCES productos (codigo)");
		 
		 connect.insertData("Ejercicio8", venta1);
		 connect.insertData("Ejercicio8", venta2);
		 connect.insertData("Ejercicio8", venta3);
		 connect.insertData("Ejercicio8", venta4);
		 connect.insertData("Ejercicio8", venta5);
		 
		 
		 
		 System.out.println("\n CAJEROS \n");
		 connect.getValues("Ejercicio8", "cajeros");
		 
		 System.out.println("\n MAQUINAS REGISTRADORAS \n");
		 connect.getValues("Ejercicio8", "maquinaRegistradoras");
		 
		 System.out.println("\n PRODUCTOS \n");
		 connect.getValues("Ejercicio8", "productos");
		 
		 System.out.println("\n VENTAS \n");
		 connect.getValues("Ejercicio8", "ventas");

		 
	     connect.closeConnection();

	}


}
