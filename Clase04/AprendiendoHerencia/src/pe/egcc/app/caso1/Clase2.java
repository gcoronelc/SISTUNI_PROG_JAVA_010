package pe.egcc.app.caso1;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1 {

  public Clase2() {
    super("Gustavo");
    System.out.println("Hola desde Clase2");
  }
  
  
  @Override
  public int sumar(int n1, int n2) {
    int s;
    s = (n1 + n2) / (n1 - n2);
    return s;
  }

  public int multiplicar(int n1, int n2) {
    return (n1 * n2);
  }

}
