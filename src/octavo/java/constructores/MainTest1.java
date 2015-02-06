/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.constructores;

/**
 *
 * @author alexander
 */
public class MainTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo1 x= new Rectangulo1(7,2);
        System.out.println(x.getLadoMayor()+x.getLadoMenor());
        
        Rectangulo1 y= new Rectangulo1();
        y.setLadoMayor(5);
        y.setLadoMenor(4);
        
        System.out.println(y.getLadoMayor()+y.getLadoMenor());
        /* Al instanciar la clase vemos que podemos ocupar ambos constructores 
        por que no se violan las reglas y se crean los objetos de manera correcta 
        
        */
        
    }
    
}
