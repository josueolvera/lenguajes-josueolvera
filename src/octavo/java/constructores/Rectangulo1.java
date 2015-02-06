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
public class Rectangulo1 {

   private int  ladoMayor;
    private int ladoMenor;
    
     public Rectangulo1() {
    }
     /* Aqui observamos la regla3 podemos tener mas de un constructor siempre y 
     cuando no se confunda la clase main que se va instanciar 
     */
    public Rectangulo1(int ladoMayor, int ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public int getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(int ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public int getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(int ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
        
    
}
