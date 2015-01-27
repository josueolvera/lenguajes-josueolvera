/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

/**
 *
 * @author T-107
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //primero creamos un objeto de tipo IMC 
        Imc xxx=new Imc(); //la izquierda es la referencia y la derecha instancia
        
       float resultado= xxx.calcular(1.65f, 20);
        System.out.println("Tu imc es:"+resultado);
    }
    
}
