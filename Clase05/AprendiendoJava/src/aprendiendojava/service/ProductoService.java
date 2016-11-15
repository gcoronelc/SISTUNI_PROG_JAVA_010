package aprendiendojava.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class ProductoService {
  
  public List<Producto> getLista1(){
    List<Producto> lista = new ArrayList<>();
    lista.add(new Producto("A", "Producto A", 34.6, 12));
    lista.add(new Producto("B", "Producto B", 65.6, 120));
    lista.add(new Producto("C", "Producto C", 23.6, 43));
    lista.add(new Producto("D", "Producto D", 89.6, 67));
    lista.add(new Producto("E", "Producto E", 86.6, 34));
    return lista;
  }
  
  public List<Map<String,Object>> getLista2(){
    List<Map<String,Object>> lista = new ArrayList<>();
    
    // Producto 1
    Map<String,Object> r1 = new HashMap<>();
    r1.put("cod", "C01");
    r1.put("nom", "Producto A");
    lista.add(r1);
    // Producto 2
    Map<String,Object> r2 = new HashMap<>();
    r2.put("cod", "C02");
    r2.put("nom", "Producto B");
    lista.add(r2);
    // Producto 3
    Map<String,Object> r3 = new HashMap<>();
    r3.put("cod", "C03");
    r3.put("nom", "Producto CB");
    lista.add(r3);
    return lista;
  }
  
}
