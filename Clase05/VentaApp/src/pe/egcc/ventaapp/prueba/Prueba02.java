package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    // Dato
    double total = 1000.0;
    // Proceso
    CompAbstract comp = obtenerComp("B");
    Item[] repo = comp.procesar(total);
    // Reporte
    for (Item item : repo) {
      System.out.println(item.toString());
    }
  }

  private static CompAbstract obtenerComp(String tipo) {
    CompAbstract comp = null;
    switch(tipo){
      case "F":
        comp = new FacturaService();
        break;
      case "B":
        comp = new BoletaService();
        break;
    }
    return comp;
  }

  

}
