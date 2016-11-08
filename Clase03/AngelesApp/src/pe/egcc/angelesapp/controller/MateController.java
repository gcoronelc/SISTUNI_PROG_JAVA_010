package pe.egcc.angelesapp.controller;

import pe.egcc.angelesapp.service.MyMath;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email  gcoronelc@gmail.com
 * @blog   gcoronelc.blogspot.com
 * @page   www.desarrollasoftware.com
 */
public class MateController {

  public long factorial(int num) {
    return MyMath.factorial(num);
  }

}
