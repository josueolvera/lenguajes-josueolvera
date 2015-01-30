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
public class Rectangulo {
    private int altura;
    private int base;
    
    public void setAltura(int altura){
        this.altura= altura;
    }
    
    public void setBase (int base){
        this.base= base ;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public int calcularR(){
        int area = base*altura;
        return area;
        
    }
}
