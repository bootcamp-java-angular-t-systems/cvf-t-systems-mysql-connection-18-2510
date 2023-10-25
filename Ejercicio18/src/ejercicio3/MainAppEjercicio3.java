package ejercicio3;

import conexion.Conexion;
import ejercicio2.Departamento;
import ejercicio2.Empleado;

public class MainAppEjercicio3 {

	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio3");
		
		 Almacen almacen1 = new Almacen("Barcelona", 10000);
		 Almacen almacen2 = new Almacen("Girona", 400);
		 Almacen almacen3 = new Almacen("Lleida", 200);
		 Almacen almacen4 = new Almacen("Tarragona", 50);
		 Almacen almacen5 = new Almacen("Badalona", 100);
		 
		 connect.createTable("Ejercicio3", almacen1, "codigo");
		 
		 connect.insertData("Ejercicio3", almacen1);
		 connect.insertData("Ejercicio3", almacen2);
		 connect.insertData("Ejercicio3", almacen3);
		 connect.insertData("Ejercicio3", almacen4);
		 connect.insertData("Ejercicio3", almacen5);

		 
		 Caja caja1 = new Caja("3D45", "Calcetines", 300, almacen1.getCodigo());
		 Caja caja2 = new Caja("45E3", "Guantes", 500, almacen1.getCodigo());
		 Caja caja3 = new Caja("3111", "iPads", 30000, almacen3.getCodigo());
		 Caja caja4 = new Caja("TE90", "Bolis bic", 300, almacen2.getCodigo());
		 Caja caja5 = new Caja("023A", "Paquetes de AliExpress", 20, almacen5.getCodigo());

		 connect.createTable("Ejercicio3", caja1, "numreferencia", ", FOREIGN KEY (almacen) REFERENCES almacens(codigo)");
		 
		 connect.insertData("Ejercicio3", caja1);
		 connect.insertData("Ejercicio3", caja2);
		 connect.insertData("Ejercicio3", caja3);
		 connect.insertData("Ejercicio3", caja4);
		 connect.insertData("Ejercicio3", caja5);
		 
		 
		 System.out.println("\n ALMACENES \n");
		 connect.getValues("Ejercicio3", "almacens");
		 
		 System.out.println("\n CAJAS \n");
		 connect.getValues("Ejercicio3", "cajas");
		 
	     connect.closeConnection();
	}

}
