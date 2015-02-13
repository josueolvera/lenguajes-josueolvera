/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-301
 */
public class ProbarConstructores {
    
    public static void main (String args[]){
       float f=45;
       double dedos=45.2;
       int i2=300;
       
       Cuadrado c =new Cuadrado((float)dedos);
       
       
        
        
        
        
        
        
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        i=s;
        b=(byte)l;
        l=i;
        s=(short)i;
        b=(byte)s;
        s=(short)l;
        l=s;
        b=(byte)i;
        b=(byte)s;
        i=b;
               
        
    }
    
}
