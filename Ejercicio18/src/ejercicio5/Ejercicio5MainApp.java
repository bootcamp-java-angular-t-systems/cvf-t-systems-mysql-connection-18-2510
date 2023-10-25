package ejercicio5;

import conexion.Conexion;


public class Ejercicio5MainApp {

	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio5");
		
		 Despacho despacho1 = new Despacho(13);
		 Despacho despacho2 = new Despacho(130);
		 Despacho despacho3 = new Despacho(50);
		 Despacho despacho4 = new Despacho(56);
		 Despacho despacho5 = new Despacho(24);

		 connect.createTable("Ejercicio5", despacho1, "numero");
		 
		 connect.insertData("Ejercicio5", despacho1);
		 connect.insertData("Ejercicio5", despacho2);
		 connect.insertData("Ejercicio5", despacho3);
		 connect.insertData("Ejercicio5", despacho4);
		 connect.insertData("Ejercicio5", despacho5);

		 
		 Director director1 = new Director("45896578F", "Claudia Ibañez", "45896578F", despacho2.getNumero());
		 Director director2 = new Director("1111111E", "Marta Soto", director1.getDNI(), despacho2.getNumero());
		 Director director3 = new Director("7777777A", "Marcos Arza", director1.getDNI(), despacho4.getNumero());
		 Director director4 = new Director("2222222A", "Maria Montpeat", director3.getDNI(), despacho3.getNumero());
		 Director director5 = new Director("99999999Q", "Alba Esparza", director4.getDNI(), despacho5.getNumero());

		 connect.createTable("Ejercicio5", director1, "DNI", ", FOREIGN KEY (despacho) REFERENCES despachos(numero), FOREIGN KEY (DNIJefe) REFERENCES directors (DNI)");
		 
		 connect.insertData("Ejercicio5", director1);
		 connect.insertData("Ejercicio5", director2);
		 connect.insertData("Ejercicio5", director3);
		 connect.insertData("Ejercicio5", director4);
		 connect.insertData("Ejercicio5", director5);
		 
		 
		 System.out.println("\n DESPACHOS \n");
		 connect.getValues("Ejercicio5", "despachos");
		 
		 System.out.println("\n DIRECTORES \n");
		 connect.getValues("Ejercicio5", "directors");
		 
		 
	     connect.closeConnection();

	}


}
