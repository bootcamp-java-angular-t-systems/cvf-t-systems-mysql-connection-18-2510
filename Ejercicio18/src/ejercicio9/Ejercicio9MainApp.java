package ejercicio9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import conexion.Conexion;


public class Ejercicio9MainApp {

	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio9");
		
		 
		 Facultad facultad1 = new Facultad("Unviersitat Politecnica de Catalunay");
		 Facultad facultad2 = new Facultad("Unviersitat Pompeu Fabra");
		 Facultad facultad3 = new Facultad("Unviersitat de Barcelona");
		 Facultad facultad4 = new Facultad("Unviersitat Autonoma de Barcelona");
		 Facultad facultad5 = new Facultad("Unviersitat de Girona");

		 connect.createTable("Ejercicio9", facultad1 , "codigo");
		 
		 connect.insertData("Ejercicio9", facultad1);
		 connect.insertData("Ejercicio9", facultad2);
		 connect.insertData("Ejercicio9", facultad3);
		 connect.insertData("Ejercicio9", facultad4);
		 connect.insertData("Ejercicio9", facultad5);

		 
		 
		 
		 Investigador investigador1 = new Investigador("45454544A", "Ferran Velasco", facultad2.getCodigo());
		 Investigador investigador2 = new Investigador("12345678A", "Mar Marquez", facultad1.getCodigo());
		 Investigador investigador3 = new Investigador("11111111A", "Marta Doblas", facultad1.getCodigo());
		 Investigador investigador4 = new Investigador("78958572A", "Carma Forcadell", facultad4.getCodigo());
		 Investigador investigador5 = new Investigador("66666666A", "Jose Marin", facultad3.getCodigo());

		 connect.createTable("Ejercicio9", investigador1, "dni", ", FOREIGN KEY (facultad) REFERENCES facultads (codigo)");
		 
		 connect.insertData("Ejercicio9", investigador1);
		 connect.insertData("Ejercicio9", investigador2);
		 connect.insertData("Ejercicio9", investigador3);
		 connect.insertData("Ejercicio9", investigador4);
		 connect.insertData("Ejercicio9", investigador5);
	

		 
		 
		 Equipo equipo1 = new Equipo("AAA", "Equipo 1", facultad2.getCodigo());
		 Equipo equipo2 = new Equipo("14D", "Equipo 2", facultad3.getCodigo());
		 Equipo equipo3 = new Equipo("12A", "Equipo 3", facultad5.getCodigo());
		 Equipo equipo4 = new Equipo("89D", "Equipo 4", facultad5.getCodigo());
		 Equipo equipo5 = new Equipo("OO9", "Equipo 4", facultad1.getCodigo());
		 
		 connect.createTable("Ejercicio9", equipo1, "numserie", ", FOREIGN KEY (facultad) REFERENCES facultads (codigo)");
		 
		 connect.insertData("Ejercicio9", equipo1);
		 connect.insertData("Ejercicio9", equipo2);
		 connect.insertData("Ejercicio9", equipo3);
		 connect.insertData("Ejercicio9", equipo4);
		 connect.insertData("Ejercicio9", equipo5);
		 
		 
		 
		 String dateStr = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
		 Reserva reserva1 = new Reserva(investigador2.getDni(), equipo1.getNumserie(), dateStr, dateStr);
		 Reserva reserva2 = new Reserva(investigador3.getDni(), equipo3.getNumserie(), dateStr, dateStr);
		 Reserva reserva3 = new Reserva(investigador2.getDni(), equipo2.getNumserie(), dateStr, dateStr);
		 Reserva reserva4 = new Reserva(investigador1.getDni(), equipo2.getNumserie(), dateStr, dateStr);
		 Reserva reserva5 = new Reserva(investigador5.getDni(), equipo5.getNumserie(), dateStr, dateStr);
		 
		 

		 ArrayList<String> pks = new ArrayList<String>();
		 pks.add("dni");
		 pks.add("numserie");
		 
		 connect.createTable("Ejercicio9", reserva1, pks, ", FOREIGN KEY (dni) REFERENCES investigadors (dni), FOREIGN KEY (numserie) REFERENCES equipos (numserie)");
		 
		 connect.insertData("Ejercicio9", reserva1);
		 connect.insertData("Ejercicio9", reserva2);
		 connect.insertData("Ejercicio9", reserva3);
		 connect.insertData("Ejercicio9", reserva4);
		 connect.insertData("Ejercicio9", reserva5);
		
		 System.out.println("\n RESERVAS \n");
		 connect.getValues("Ejercicio9", "reservas");
		 System.out.println("\n EQUIPOS \n");
		 connect.getValues("Ejercicio9", "equipos");
		 System.out.println("\n FACULTADES \n");
		 connect.getValues("Ejercicio9", "facultads");
		 System.out.println("\n INVESTIGADORS \n");
		 connect.getValues("Ejercicio9", "investigadors");
	     connect.closeConnection();

	}

}
