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
public class Rectangulo {

   
    private int  ladoMayor;
    private int ladoMenor;
    //omitimos encapsulamiento
    public Rectangulo(){// aqui observamos la regla 2 
        ladoMayor=2;
        ladoMenor=2;
    }
    /* si no huebieramos inicializdo en 2 el consytructor por defecto inicializa 
    las variables asu valor primitivo*/

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
