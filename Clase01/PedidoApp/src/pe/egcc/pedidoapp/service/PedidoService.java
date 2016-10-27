package pe.egcc.pedidoapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public class PedidoService {

  /**
   * Permite calcular el impuesto de un pedido.
   * 
   * @param importe Importe del pedido.
   * @return Retorna el impuesto.
   */
  public double calcImpuesto(double importe) {
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }

  /**
   * Calcula el total de un pedido.
   * 
   * @param importe Importe del pedido.
   * @return Retorna el total del pedido.
   */
  public double calcTotal(double importe) {
    double total;
    total = importe + calcImpuesto(importe);
    return total;
  }

}
