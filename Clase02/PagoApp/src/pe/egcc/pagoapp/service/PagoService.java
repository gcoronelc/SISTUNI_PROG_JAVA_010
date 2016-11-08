package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.model.PagoModel;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @page www.desarrollasoftware.com
 */
public class PagoService {

  public void procesar(PagoModel model) {
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = model.getHorasDia()
            * model.getDias() * model.getPagoHora();
    renta = ingresos * ((ingresos > 1500.0) ? 0.08 : 0.0);
    neto = ingresos - renta;
    // Reporte
    model.setIngresos(ingresos);
    model.setRenta(renta);
    model.setNeto(neto);
  }

}
