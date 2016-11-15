package prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {


  public static void main(String[] args) {
    
    Map<String,Object> rec = new HashMap<>();
    
    rec.put("cod", "P001");
    rec.put("nom", "VOLT");
    rec.put("precio", 2.30);
    rec.put("stock", 200);
    rec.put("nom", "GREEN");
    
    
    for(String key: rec.keySet()){
      System.out.println(key + " ==> " + rec.get(key));
    }
    
    
  }
  
}
