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
public class Rectangulo2 {
   
    private int  ladoMayor;
    private int ladoMenor;
    
    
    public Rectangulo2(int ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

   /* public Rectangulo2(int ladoMenor) { 
        this.ladoMenor = ladoMenor;
    }
    /*
    aqui se viola la regla 3 por que ya confundiria a la clase main
    para solucionarlo tendriamos que cambiar en tipo de atributo
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
