package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.MateServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class MateServiceImpl 
  implements MateServiceSpec{

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public int multiplicar(int n1, int n2) {
    return (n1 * n2);
  }
  
  public void saludo(){
    System.out.println("Hola Gustavo");
  }
  
}
