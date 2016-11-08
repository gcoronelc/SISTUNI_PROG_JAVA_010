package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog gcoronelc.blogspot.com
 * @page www.desarrollasoftware.com
 */
public class Producto {

  // Variables privadas
  private String nombre;
  private double precio;
  private int stock;

  /**
   * Constructor por defecto
   */
  public Producto() {
    // Inicialización de las variables
    /*this.nombre = "Televisor";
    this.precio = 1580.0;
    this.stock = 500;*/
    this("Televisor", 1850.0, 500);
  }

  /**
   * Constructor adicional.
   * Se dice que el constructor esta sobrecargado.
   * 
   * @param nombre Nombre del producto.
   * @param precio Precio de venta, debe ser mayor a cero.
   * @param stock  Stock en almacén, debe ser mayor o igual a cero.
   */
  public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
