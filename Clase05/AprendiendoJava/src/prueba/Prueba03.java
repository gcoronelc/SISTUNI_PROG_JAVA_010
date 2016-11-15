package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {

    String[] ciudades = {"Lima","Cuzco","Arequipa","Trujillo", "Chiclayo"};

    // Recorrido usando lambda
    Stream<String> stream =  Arrays.stream(ciudades);
    stream.forEach(c -> System.out.println(c) );
   
    
    
    List<String> nombres = new ArrayList<>();
    nombres.add("Messi");
    nombres.add("Neymar");
    nombres.add("Cueva");
    nombres.add("Paolo");
    nombres.add("Beto");
    
    // Recorrido usando lambda
    System.out.println("------------------");
    nombres.stream()
            .forEach(n -> System.out.println(n) );
        
    
  }
  
}
