package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.MateServiceImpl;
import pe.egcc.app.service.impl2.MateServiceImpl2;
import pe.egcc.app.service.spec.MateServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    MateServiceSpec o = new MateServiceImpl();
    
    System.out.println("COMPATIBLE CON:");
    System.out.println("MateServiceImpl: " + ((o instanceof MateServiceImpl)?"SI":"NO"));
    System.out.println("MateServiceImpl2: " + ((o instanceof MateServiceImpl2)?"SI":"NO"));
    System.out.println("MateServiceSpec: " + ((o instanceof MateServiceSpec)?"SI":"NO"));
    System.out.println("Object: " + ((o instanceof Object)?"SI":"NO"));
  

        
  
  }
  
}
