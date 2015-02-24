/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.encapsulamiento;

import unitec.proyecto.geometria.Rectangulo;

/**
 *
 * @author alexander
 */
public class TestArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cuadrado c = new Cuadrado();
      c.setLado(4);
      
      System.out.println("Area Cuadrado:"+c.calcularArea());
      
     /* Rectangulo r = new Rectangulo();
      r.setAltura(2);
      r.setBase(5);
      System.out.println("Area Rectangulo"+r.calcularR());
    }
    
             */
    }
    
}
