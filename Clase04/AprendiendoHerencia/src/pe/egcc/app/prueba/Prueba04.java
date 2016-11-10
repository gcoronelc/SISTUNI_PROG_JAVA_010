package pe.egcc.app.prueba;

import pe.egcc.app.caso1.Clase1;
import pe.egcc.app.caso1.Clase2;
import pe.egcc.app.caso1.Clase3;
import pe.egcc.app.caso1.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {

    Clase2 obj = new Clase2();

    System.out.println("Compatibilidad con:");
    System.out.println("Object: " + ((obj instanceof Object) ? "SI" : "NO"));
    System.out.println("Clase1: " + ((obj instanceof Clase1) ? "SI" : "NO"));
    System.out.println("Clase2: " + ((obj instanceof Clase2) ? "SI" : "NO"));
    System.out.println("Clase3: " + ((obj instanceof Clase3) ? "SI" : "NO"));
    System.out.println("Clase4: " + ((obj instanceof Clase4) ? "SI" : "NO"));

  }

}
