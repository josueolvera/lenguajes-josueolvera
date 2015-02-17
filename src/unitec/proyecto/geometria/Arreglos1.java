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
public class Arreglos1 {
    
    public void tuNombre(int x[]){
        
    }
    public static void main (String args[]){
        int x[]=new int[3];
        int []y= new int[3];
        int z[]={1,-200,45};
        
        x[0]=127;
        x[1]=200;
        x[2]=23;
        
       //Iterar
      
       int a=2;
       float b=0;
        System.out.println(a/b);
        
        
        
        
        
        
        
        for(int i=0;i<4;i++){
        System.out.println(x[i]);
        }
        //Aqui sale de ejecucion por que se lanza la excepsion y se rompe el main
        //Una excepcion es la forma de prevenir errores futuros que pudan ocasionar los usuarios
        System.out.println("Si ocurre la Excepcion nunca me veras");
        
        // la variable debe de ser del mismo tipo que el arreglo
        //Los dos puntos significa que se va interar
        for (int algo:x){
            System.out.println(algo);
        }
        
        
    
        
// x[0]=127;
    }
}
