
package pe.egcc.service;

import javax.ejb.Remote;

/**
 *
 * @author Gustavo Coronel
 */
@Remote
public interface MateServiceRemote {

  int sumar(int num1, int num2);
  
}
