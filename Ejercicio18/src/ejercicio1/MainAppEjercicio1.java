package ejercicio1;

import java.lang.reflect.Field;

import conexion.Conexion;

public class MainAppEjercicio1 {
	
	 public static void main(String[] args) {
		 Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio1");
		
		 Fabricante fabricante1 = new Fabricante("Fabricant 1");
		 Fabricante fabricante2 = new Fabricante("Fabricant 2");
		 Fabricante fabricante3 = new Fabricante("Fabricant 3");
		 Fabricante fabricante4 = new Fabricante("Fabricant 4");
		 Fabricante fabricante5 = new Fabricante("Fabricant 5");
		 
		 connect.createTable("Ejercicio1", fabricante1, "codigo");
		 
		 connect.insertData("Ejercicio1", fabricante1);
		 connect.insertData("Ejercicio1", fabricante2);
		 connect.insertData("Ejercicio1", fabricante3);
		 connect.insertData("Ejercicio1", fabricante4);
		 connect.insertData("Ejercicio1", fabricante5);
		 
		 
		 Articulo articulo1 = new Articulo("Articulo 1", 250, fabricante2.getCodigo());
		 Articulo articulo2 = new Articulo("Articulo 2", 145, fabricante2.getCodigo());
		 Articulo articulo3 = new Articulo("Articulo 3", 123, fabricante3.getCodigo());
		 Articulo articulo4 = new Articulo("Articulo 4", 98, fabricante4.getCodigo());
		 Articulo articulo5 = new Articulo("Articulo 5", 45, fabricante5.getCodigo());
		 
		
		 connect.createTable("Ejercicio1", articulo1, "codigo", ", FOREIGN KEY (fabricante) REFERENCES fabricantes(codigo)");
		 
		 connect.insertData("Ejercicio1", articulo1);
		 connect.insertData("Ejercicio1", articulo2);
		 connect.insertData("Ejercicio1", articulo3);
		 connect.insertData("Ejercicio1", articulo4);
		 connect.insertData("Ejercicio1", articulo5);
		 
		 System.out.println("\n ARTICULOS \n");
		 connect.getValues("Ejercicio1", "articulos");
		 
		 System.out.println("\n FABRICANTES \n");
		 connect.getValues("Ejercicio1", "fabricantes");
		 
	     connect.closeConnection();
    }
}
