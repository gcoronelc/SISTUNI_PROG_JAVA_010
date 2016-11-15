/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {
  
  private String cod;
  private String nom;
  private double precio;
  private int stock;

  public Producto() {
  }

  public Producto(String cod, String nom, double precio, int stock) {
    this.cod = cod;
    this.nom = nom;
    this.precio = precio;
    this.stock = stock;
  }

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
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
