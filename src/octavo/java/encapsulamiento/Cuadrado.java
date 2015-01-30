/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.encapsulamiento;

/**
 *
 * @author alexander
 */
public class Cuadrado {
    private int lado;
    
    public void setLado(int lado){
        this.lado=lado;
    }
    public int getLado(){
        return lado;
    }
    
    public int calcularArea(){
        int area = lado*lado;
        return area;
    }
    
}
