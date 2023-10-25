package ejercicio4;

import conexion.Conexion;
import ejercicio3.Almacen;
import ejercicio3.Caja;

public class MainAppEjercicio4 {
	public static void main(String[] args) {
		Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio4");
		
		 Pelicula pelicula1 = new Pelicula("Buscando a nemo", 13);
		 Pelicula pelicula2 = new Pelicula("Monstruos SA", 13);
		 Pelicula pelicula3 = new Pelicula("La Cenicienta", 13);
		 Pelicula pelicula4 = new Pelicula("Matrix", 18);
		 Pelicula pelicula5 = new Pelicula("El rey Leon", 12);

		 
		 connect.createTable("Ejercicio4", pelicula1, "codigo");
		 
		 connect.insertData("Ejercicio4", pelicula1);
		 connect.insertData("Ejercicio4", pelicula2);
		 connect.insertData("Ejercicio4", pelicula3);
		 connect.insertData("Ejercicio4", pelicula4);
		 connect.insertData("Ejercicio4", pelicula5);

		 
		 Sala sala1 = new Sala("Sala 1", pelicula1.getCodigo());
		 Sala sala2 = new Sala("Sala 2", pelicula1.getCodigo());
		 Sala sala3 = new Sala("Sala 3", pelicula2.getCodigo());
		 Sala sala4 = new Sala("Sala 4", pelicula5.getCodigo());
		 Sala sala5 = new Sala("Sala 5", pelicula5.getCodigo());

		 connect.createTable("Ejercicio4", sala1, "codigo", ", FOREIGN KEY (pelicula) REFERENCES peliculas(codigo)");
		 
		 connect.insertData("Ejercicio4", sala1);
		 connect.insertData("Ejercicio4", sala2);
		 connect.insertData("Ejercicio4", sala3);
		 connect.insertData("Ejercicio4", sala4);
		 connect.insertData("Ejercicio4", sala5);
		 
		 
		 System.out.println("\n PELICULAS \n");
		 connect.getValues("Ejercicio4", "peliculas");
		 
		 System.out.println("\n SALAS \n");
		 connect.getValues("Ejercicio4", "salas");

		 
	     connect.closeConnection();
	}

}
