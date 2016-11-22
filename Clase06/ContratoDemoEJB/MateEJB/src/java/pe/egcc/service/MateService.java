package pe.egcc.service;

import javax.ejb.Stateless;

/**
 *
 * @author Gustavo Coronel
 */
@Stateless
public class MateService implements MateServiceRemote {

  @Override
  public int sumar(int num1, int num2) {
    return (num1 + num2);
  }

}
