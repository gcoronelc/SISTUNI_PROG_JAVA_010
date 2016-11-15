package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {

    String[] ciudades = {"Lima","Cuzco","Arequipa","Trujillo", "Chiclayo"};

    // Recorrido tipo colección
    for (String ciudad : ciudades) {
      System.out.println(ciudad);
    }
    
    
    List<String> nombres = new ArrayList<>();
    nombres.add("Messi");
    nombres.add("Neymar");
    nombres.add("Cueva");
    nombres.add("Paolo");
    nombres.add("Beto");
    
    // Recorrido tipo colección
    System.out.println("------------------");
    for (String nombre : nombres) {
      System.out.println(nombre);
    }
    
    
  }
  
}
