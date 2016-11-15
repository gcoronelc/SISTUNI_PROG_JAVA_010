package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    
    int[] lista  = new int[5];
    
    for (int i = 0; i < lista.length; i++) {
      int num = lista[i];
      System.out.println(num);
    }
    
    // ------------------------------------------------
    
    List<Integer> numeros = new ArrayList<>();
    numeros.add(16);
    numeros.add(56);
    numeros.add(43);
    numeros.add(23);
    numeros.add(78);
    numeros.add(45);
    
    for (int i = 0; i < numeros.size(); i++) {
      int nro = numeros.get(i);
      System.out.println(nro);
    }
    
    System.out.println("---------------");
    numeros.remove(4);
    numeros.set(1, 1000);
    
    for (int i = 0; i < numeros.size(); i++) {
      int nro = numeros.get(i);
      System.out.println(nro);
    }
    
    
    
  }

  
}
