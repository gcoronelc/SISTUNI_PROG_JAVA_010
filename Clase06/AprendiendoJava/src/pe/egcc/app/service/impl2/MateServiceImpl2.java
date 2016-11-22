package pe.egcc.app.service.impl2;

import pe.egcc.app.service.spec.MateServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class MateServiceImpl2 
  implements MateServiceSpec{

  @Override
  public int sumar(int n1, int n2) {
    return ((n1 + n2) / (n1 - n2));
  }

  @Override
  public int multiplicar(int n1, int n2) {
    return ((n1 + n2) * (n1 - n2));
  }
  
}
