package pe.edu.tecsup._01.enumeration.ejercicio;


public class Aplicacion {

    public static void main(String[] args) {


        if(Educacion.POSTGRADO.compareTo(Educacion.PRIMARIA) > 0)
            System.out.println("POSTGRADO tiene mayor peso que la PRIMARIA");
          
        if(Educacion.DOCTORADO.compareTo(Educacion.POSTGRADO) > 0)
            System.out.println("DOCTORADO tiene mayor peso que la POSTGRADO");
    }
}
