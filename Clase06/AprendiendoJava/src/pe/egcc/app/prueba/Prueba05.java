package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.MateServiceImpl;
import pe.egcc.app.service.spec.MateServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    MateServiceSpec o = new MateServiceImpl(); // UpCasting
    
    MateServiceImpl x = (MateServiceImpl) o; // DownCasting
        
    x.saludo();
    System.out.println("6 + 7 = " + o.sumar(6, 7));
    
  }
  
}
