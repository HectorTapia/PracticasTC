import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;
public class Run {
    public static void main(String[] args) {
        
        // Arraylist impletacion con listas
        List<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Mandarina");

        // System.out.println("Lista de frutas"+listaFrutas);
        // System.out.println("Segunda fruta:"+listaFrutas.get(1));

        // for each
        // for (String fruta : listaFrutas){
        //     System.out.println("- "+fruta);
        // }

        // ----------------------------------------------------------------
        // HashSet
        Set<String> listaColores = new HashSet<>();
        listaColores.add("Rojo");
        listaColores.add("Verde");
        listaColores.add("Azul");
        listaColores.add("Rojo");

        // System.out.println("Lista de colores"+listaColores);
        // System.out.println("Contiene verde?"+listaColores.contains("Verde"));
        // for (String c : listaColores){
        //         System.out.println("- "+c);
        // }

        // --------------------------------------------------------------------
        // Map

        Map<String,Integer> listaEdades = new HashMap<>();
        listaEdades.put("Luis", 24);
        listaEdades.put("Fernando", 19);
        listaEdades.put("Diana", 24);
        listaEdades.put("Hector", 22);
        
        // System.out.println("Lista del Equipo de trabajo"+listaEdades);
        // System.out.println("Se encuenta David?"+listaEdades.containsKey("David"));

        for ( Map.Entry<String, Integer> personas : listaEdades.entrySet()){
            System.out.println("-"+personas.getKey()+";"+personas.getValue()+"anos");
        }
    }
}
