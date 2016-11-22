package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.MateServiceImpl;
import pe.egcc.app.service.spec.MateServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
 
  public static void main(String[] args) {
    
    MateServiceSpec service;
    service = new MateServiceImpl();
    
    System.out.println("Suma: " + service.sumar(5, 7));
    System.out.println("Suma: " + service.multiplicar(5, 7));
  }
}
