package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email  gcoronelc@gmail.com
 * @blog   gcoronelc.blogspot.com
 * @page   www.desarrollasoftware.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    // Usando el constructor por defecto.
    Producto p = new Producto();
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    
    // Usando el constructor adicional.
    p = new Producto("Computadora", 4590.0, 100);
    System.out.println("-----------------------------");
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    
  }
  
}
