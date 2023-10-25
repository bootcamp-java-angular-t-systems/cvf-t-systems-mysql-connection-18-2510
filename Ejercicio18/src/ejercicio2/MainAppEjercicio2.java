package ejercicio2;

import conexion.Conexion;
import ejercicio1.Articulo;
import ejercicio1.Fabricante;

public class MainAppEjercicio2 {
	
	 public static void main(String[] args) {
		 Conexion connect = new Conexion("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "contrasenya123");
		 
		 connect.createDB("Ejercicio2");
		
		 Departamento departamento1 = new Departamento("Departamento 1", 10000);
		 Departamento departamento2 = new Departamento("Departamento 2", 20000);
		 Departamento departamento3 = new Departamento("Departamento 3", 30000);
		 Departamento departamento4 = new Departamento("Departamento 4", 40000);
		 Departamento departamento5 = new Departamento("Departamento 5", 50000);

		 
		 connect.createTable("Ejercicio2", departamento1, "codigo");
		 
		 connect.insertData("Ejercicio2", departamento1);
		 connect.insertData("Ejercicio2", departamento2);
		 connect.insertData("Ejercicio2", departamento3);
		 connect.insertData("Ejercicio2", departamento4);
		 connect.insertData("Ejercicio2", departamento5);
		 
		 
		 Empleado empleado1 = new Empleado("789456123A", "Antonio", "Alvarez Agustí", departamento3.getCodigo());
		 Empleado empleado2 = new Empleado("741852963A", "María", "Martínez Marín", departamento3.getCodigo());
		 Empleado empleado3 = new Empleado("548625856A", "Claudia", "Carrasco Caceres", departamento2.getCodigo());
		 Empleado empleado4 = new Empleado("741857482A", "Lucía", "Lopez Lalueza", departamento4.getCodigo());
		 Empleado empleado5 = new Empleado("741853333A", "Pablo", "Pinto Pozo", departamento3.getCodigo());

		 
		
		 connect.createTable("Ejercicio2", empleado1, "DNI", ", FOREIGN KEY (departamento) REFERENCES departamentos(codigo)");
		 
		 connect.insertData("Ejercicio2", empleado1);
		 connect.insertData("Ejercicio2", empleado2);
		 connect.insertData("Ejercicio2", empleado3);
		 connect.insertData("Ejercicio2", empleado4);
		 connect.insertData("Ejercicio2", empleado5);
		 
		 System.out.println("\n EMPLEADOS \n");
		 connect.getValues("Ejercicio2", "empleados");
		 
		 System.out.println("\n DEPARTAMENOTS \n");
		 connect.getValues("Ejercicio2", "departamentos");
		 
	     connect.closeConnection();
    }

}
