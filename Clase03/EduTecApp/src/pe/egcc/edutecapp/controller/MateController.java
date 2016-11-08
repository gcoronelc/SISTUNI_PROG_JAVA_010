package pe.egcc.edutecapp.controller;

import pe.egcc.edutec.lib.MateLib;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email  gcoronelc@gmail.com
 * @blog   gcoronelc.blogspot.com
 * @page   www.desarrollasoftware.com
 */
public class MateController {

  private MateLib mate;

  public MateController() {
    mate = new MateLib();
  }
    
  public int promediar(int num1, int num2) {
    return mate.promediar(num1, num2);
  }

}
