package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.MateServiceImpl;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    MateServiceImpl o = new MateServiceImpl();
    
    o.saludo();
    System.out.println("6 + 7 = " + o.sumar(6, 7));
    
  }
  
}
