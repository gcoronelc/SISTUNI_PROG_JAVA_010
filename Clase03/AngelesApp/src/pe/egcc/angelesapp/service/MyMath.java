package pe.egcc.angelesapp.service;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @page www.desarrollasoftware.com
 */
public class MyMath {

  public static long factorial(int n) {
    long f = 1;
    while (n > 1) {
      f *= n--;
    }
    return f;
  }

  public static int mcd(int n1, int n2) {
    return 1;
  }

  public static int mcm(int n1, int n2) {
    return 1;
  }

  public static String fibonacci(int n) {
    return "";
  }

  public static boolean esPrimo(int n) {
    return true;
  }

}
