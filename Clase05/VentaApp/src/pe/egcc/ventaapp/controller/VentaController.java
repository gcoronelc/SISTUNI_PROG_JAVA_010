package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaController {

  public String[] getTipos(){
    return CompFactory.getTipos();
  }

  public Item[] procesar(String tipo, double total) {
    CompAbstract comp;
    comp = CompFactory.getComp(tipo);
    return comp.procesar(total);
  }

  
}
