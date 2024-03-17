package pe.edu.tecsup._08.lambda.ejercicio;

@FunctionalInterface
interface ValidacionUsuario {
    boolean validar();
}

/**
 * Una expresión lambda en Java es una forma corta y clara de representar una instancia
 * de una interfaz funcional. Permite implementar métodos de interfaz con un código conciso.
 */
public class Aplicacion {

    public static void main(String[] args) {

    	ValidacionUsuario vu = () -> true; // Implementacion
        
        System.out.println(vu.validar());
        
    }
}
