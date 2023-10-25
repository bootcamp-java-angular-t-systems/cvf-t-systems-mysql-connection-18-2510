package ejercicio7;

import java.util.ArrayList;

import conexion.Conexion;
import ejercicio6.Pieza;
import ejercicio6.Proveedor;
import ejercicio6.Subministra;

public class Ejercicio7MainApp {
	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio7");
		
		 Proyecto proyecto1 = new Proyecto("123A", "Proyecto 1",  39);
		 Proyecto proyecto2 = new Proyecto("124B", "Proyecto 2",  343);
		 Proyecto proyecto3 = new Proyecto("125C", "Proyecto 3",  423);
		 Proyecto proyecto4 = new Proyecto("123D", "Proyecto 4",  22);
		 Proyecto proyecto5 = new Proyecto("222A", "Proyecto 5",  66);
		 
		 connect.createTable("Ejercicio7", proyecto1, "id");
		 
		 connect.insertData("Ejercicio7", proyecto1);
		 connect.insertData("Ejercicio7", proyecto2);
		 connect.insertData("Ejercicio7", proyecto3);
		 connect.insertData("Ejercicio7", proyecto4);
		 connect.insertData("Ejercicio7", proyecto5);

		 
		 
		 Cientifico cientifico1 = new Cientifico("11111111A", "Ferran Velasco");
		 Cientifico cientifico2 = new Cientifico("22222222A", "Carme Bonet");
		 Cientifico cientifico3 = new Cientifico("33333333A", "Joan Mallorquí");
		 Cientifico cientifico4 = new Cientifico("77777777E", "Miquel Puigdemont");
		 Cientifico cientifico5 = new Cientifico("00000000A", "Nuria Fabrega");

		 		 
		 connect.createTable("Ejercicio7", cientifico1, "DNI");
		 
		 connect.insertData("Ejercicio7", cientifico1);
		 connect.insertData("Ejercicio7", cientifico2);
		 connect.insertData("Ejercicio7", cientifico3);
		 connect.insertData("Ejercicio7", cientifico4);
		 connect.insertData("Ejercicio7", cientifico5);
	
		 
		 
		 Asignado asignado1 = new Asignado(cientifico1.getDNI(), proyecto1.getId());
		 Asignado asignado2 = new Asignado(cientifico2.getDNI(), proyecto4.getId());
		 Asignado asignado3 = new Asignado(cientifico3.getDNI(), proyecto4.getId());
		 Asignado asignado4 = new Asignado(cientifico2.getDNI(), proyecto3.getId());
		 Asignado asignado5 = new Asignado(cientifico1.getDNI(), proyecto2.getId());
;

		 ArrayList<String> pks = new ArrayList<String>();
		 pks.add("cientifico");
		 pks.add("proyecto");
		 
		 connect.createTable("Ejercicio7", asignado1, pks, ", FOREIGN KEY (proyecto) REFERENCES proyectos (id), FOREIGN KEY (cientifico) REFERENCES cientificos (DNI)");
		 
		 connect.insertData("Ejercicio7", asignado1);
		 connect.insertData("Ejercicio7", asignado2);
		 connect.insertData("Ejercicio7", asignado3);
		 connect.insertData("Ejercicio7", asignado4);
		 connect.insertData("Ejercicio7", asignado5);
		 
		 
		 System.out.println("\n ASIGNADOS \n");
		 connect.getValues("Ejercicio7", "asignados");
		 
		 System.out.println("\n CIENTIFICOS \n");
		 connect.getValues("Ejercicio7", "cientificos");
		 
		 System.out.println("\n PROYECTOS \n");
		 connect.getValues("Ejercicio7", "proyectos");
	
		 
	     connect.closeConnection();

	}

}
