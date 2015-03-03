/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTE;
import java.util.*;

/**
 *
 * @author alexander
 */
public class GenerarAnimales {
    public static ArrayList<Animal> generarAnimal(){
        ArrayList <Animal> animales = new ArrayList<Animal>();
            Animal a1 =new Animal("LEON",2);
            Animal a2 =new Animal("DELFIN",6);
            
            animales.add(a1);
            animales.add(a2);
            return animales;
        
    }
}
