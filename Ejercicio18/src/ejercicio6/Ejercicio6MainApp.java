package ejercicio6;

import java.util.ArrayList;

import conexion.Conexion;


public class Ejercicio6MainApp {

	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio6");
		
		 Pieza pieza1 = new Pieza("Pieza 1");
		 Pieza pieza2 = new Pieza("Pieza 2");
		 Pieza pieza3 = new Pieza("Pieza 3");
		 Pieza pieza4 = new Pieza("Pieza 4");
		 Pieza pieza5 = new Pieza("Pieza 5");

		 connect.createTable("Ejercicio6", pieza1, "codigo");
		 
		 connect.insertData("Ejercicio6", pieza1);
		 connect.insertData("Ejercicio6", pieza2);
		 connect.insertData("Ejercicio6", pieza3);
		 connect.insertData("Ejercicio6", pieza4);
		 connect.insertData("Ejercicio6", pieza5);
		 
		 
		 
		 Proveedor proveedor1 = new Proveedor("AFK3", "Proveedor 1");
		 Proveedor proveedor2 = new Proveedor("EEE4", "Proveedor 2");
		 Proveedor proveedor3 = new Proveedor("ADGF", "Proveedor 3");
		 Proveedor proveedor4 = new Proveedor("DE66", "Proveedor 4");
		 Proveedor proveedor5 = new Proveedor("KK44", "Proveedor 5");
		 		 
		 connect.createTable("Ejercicio6", proveedor1, "id");
		 
		 connect.insertData("Ejercicio6", proveedor1);
		 connect.insertData("Ejercicio6", proveedor2);
		 connect.insertData("Ejercicio6", proveedor3);
		 connect.insertData("Ejercicio6", proveedor4);
		 connect.insertData("Ejercicio6", proveedor5);
		 
		 
		 Subministra subministra1 = new Subministra(pieza1.getCodigo(), proveedor2.getId(), 34);
		 Subministra subministra2 = new Subministra(pieza3.getCodigo(), proveedor2.getId(), 38);
		 Subministra subministra3 = new Subministra(pieza3.getCodigo(), proveedor4.getId(), 342);
		 Subministra subministra4 = new Subministra(pieza4.getCodigo(), proveedor5.getId(), 75);
		 Subministra subministra5 = new Subministra(pieza5.getCodigo(), proveedor3.getId(), 54);

		 ArrayList<String> pks = new ArrayList<String>();
		 pks.add("codigopieza");
		 pks.add("idproveedor");
		 
		 connect.createTable("Ejercicio6", subministra1, pks, ", FOREIGN KEY (codigopieza) REFERENCES piezas(codigo), FOREIGN KEY (idproveedor) REFERENCES proveedors (id)");
		 
		 connect.insertData("Ejercicio6", subministra1);
		 connect.insertData("Ejercicio6", subministra2);
		 connect.insertData("Ejercicio6", subministra3);
		 connect.insertData("Ejercicio6", subministra4);
		 connect.insertData("Ejercicio6", subministra5);
		 
		 
		 System.out.println("\n PIEZAS \n");
		 connect.getValues("Ejercicio6", "piezas");
		 
		 System.out.println("\n PROVEEDORS \n");
		 connect.getValues("Ejercicio6", "proveedors");
		 
		 System.out.println("\n SUBMINISTROS \n");
		 connect.getValues("Ejercicio6", "subministras");

		 
	     connect.closeConnection();

	}

}
