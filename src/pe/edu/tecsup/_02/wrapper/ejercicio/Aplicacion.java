package pe.edu.tecsup._02.wrapper.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        // Float Double
        
//        float dec = 1.2425f;
//        
//        Float fDec = Float.valueOf(dec);
//        
//        float decRep = fDec.floatValue();
//        
//        System.out.println("Decimal recuperado " + decRep);
    
        
        // Boolean
        
        boolean estasEnClases = true;

        Boolean wrapperEstasEnClasess = Boolean.valueOf(estasEnClases);
        
        System.out.println("Boolean recuperado " + wrapperEstasEnClasess);

        boolean recuperadoEstasEnClases = wrapperEstasEnClasess.booleanValue();
        
        System.out.println("boolean recuperado " + recuperadoEstasEnClases);

    }
}
