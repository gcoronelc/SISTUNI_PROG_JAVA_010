package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();

    lista.add(12);
    lista.add(92);
    lista.add(45);
    lista.add(23);
    lista.add(87);
    lista.add(23);
    lista.add(67);
    lista.add(10);

    lista.stream()
            .filter(n -> n > 30)
            .sorted()
            .forEach(n -> System.out.println(n));

    System.out.println("Original");
    for (Integer n : lista) {
      System.out.println(n);
    }

  }

}
