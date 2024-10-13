package pe.edu.tecsup._03.collections.ejercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		// diasSemanas, variable en modo lectura : Inmutable
		Collection<String> diasSemanas 
			= Arrays.asList("Lunes","Martes","Miercoles","Feriado");

		
		System.out.println(diasSemanas);
		System.out.println(diasSemanas.size());
		
		// _diasSemanas, variable en modo lectura : Mutable
		Collection _diasSemanas = new ArrayList<String>(diasSemanas);
		
		_diasSemanas.remove("Feriado");
		System.out.println(_diasSemanas);
		

		if (_diasSemanas.contains("Miercoles")) {
			System.out.println("El dia Miercoles esta contenido");
		}
	}

}

/*

  Crear una collecion de dias de la semana, incluir "Feriado"
  
  Cuantos dias hay

  Luego eliminar feriado

  Verificar si el dia miercoles esta en listado

*/
