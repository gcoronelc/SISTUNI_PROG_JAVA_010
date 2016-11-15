package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  // Tipos de Comprobante
  public static final String COMP_FACTURA = "Factura";
  public static final String COMP_BOLETA = "Boleta";
  
  
  public static String[] getTipos(){
    String[] tipos = {COMP_FACTURA, COMP_BOLETA};
    return tipos;
  }
  
  public static CompAbstract getComp(String tipo){
    CompAbstract comp = null;
    switch(tipo){
      case COMP_FACTURA:
        comp = new FacturaService();
        break;
      case COMP_BOLETA:
        comp = new BoletaService();
        break;
    }
    return comp;
  }
  
}
