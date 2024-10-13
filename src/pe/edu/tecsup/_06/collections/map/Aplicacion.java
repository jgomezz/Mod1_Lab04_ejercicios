package pe.edu.tecsup._06.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Aplicacion {

    public static void main(String[] args) {
       
       Map<String, String> dict = new HashMap<String, String>();
       
       dict.put("Camaleon", "Es un animal....!");
       dict.put("Llama", "Es un animal de los Andes de Latinoamerica....!");
       
       System.out.println(dict.get("Llama"));
       
        
    }

}
