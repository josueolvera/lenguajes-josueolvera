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
public class Rectangulo3 {

    private int  ladoMayor;
    private int ladoMenor;
    
    public Rectangulo3(int ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    /*
    Aqui pondremos aprueba la regla 4
    */
  
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
