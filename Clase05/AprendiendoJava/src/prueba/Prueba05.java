/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    JFrame form1 = new JFrame();
    JButton boton = new JButton("Saludo a todos");
    form1.add(boton);
    
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Hola Todos");
      }
    });
    
    
    
    form1.setVisible(true);
    
    
  }
  
}
