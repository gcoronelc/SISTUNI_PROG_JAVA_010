package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;


/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Variables
    double importe, impuesto, total;
    // Dato
    importe = 3560.0;
    // Proceso
    PedidoService pedidoService = new PedidoService();
    impuesto = pedidoService.calcImpuesto(importe);
    total = pedidoService.calcTotal(importe);
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }

}
