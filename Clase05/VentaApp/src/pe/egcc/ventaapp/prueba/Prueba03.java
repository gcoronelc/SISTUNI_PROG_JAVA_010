package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    // Dato
    double total = 1000.0;
    // Proceso
    CompAbstract comp;
    comp = CompFactory
            .getComp(CompFactory.COMP_BOLETA);
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item item : repo) {
      System.out.println(item.toString());
    }
  }

  

}
