package prueba;

import aprendiendojava.service.ProductoService;
import java.util.Map;
import model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba08 {

  public static void main(String[] args) {
    ProductoService service = new ProductoService();
    
    for(Producto p: service.getLista1()){
      System.out.println(p.getNom() + " - " + p.getPrecio());
    }
    
    System.out.println("-------------");
    for(Map<String,Object> r: service.getLista2()){
      System.out.println(r.get("cod") + " - " + r.get("nom") );
    }
    
    
    
    
  }
  
}
