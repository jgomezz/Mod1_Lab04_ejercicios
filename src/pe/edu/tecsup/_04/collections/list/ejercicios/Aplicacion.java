package pe.edu.tecsup._04.collections.list.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		
		Auto otroAuto = new Auto("X001", "Toyota");
		
		List<Auto> autos = new ArrayList<>();
	
		// agrego 3 objetos a la lista de autos
		autos.add( new Auto("X001", "Toyota") );
		autos.add( new Auto("X002", "Nissan") );
		autos.add( new Auto("X003", "Pegaut") );
		
		// For each
		for (Auto auto : autos) {
			// llamar el metodo toString() del objeto
			System.out.println(auto); 
		}
		
		if(autos.contains( otroAuto )) {
			System.out.println("Tenemos a Toyota");
		} else {
			System.out.println("Toyota no esta");
		}

	}

}




