/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;
import java.util.*;

public class GenerarSuperficies {
    
    public static ArrayList<Superficies> obtenerFiguras()throws Exception{
        ArrayList<Superficies> figuritas=new ArrayList<Superficies>();
        //Primero creamos cuadraddos
        
        Cuadrado c1 =new Cuadrado(12);
        Cuadrado c2 =new Cuadrado(14);
        Cuadrado c3 =new Cuadrado(13);
        
        //Crear dos Rectangulos 
        Rectangulo r1 =new Rectangulo(15,10);
        
        //Crear dos triangulos
        Triangulo t1=new Triangulo(6,12);
        Triangulo t2=new Triangulo(5,13);
        
        //Crear dos circulos
        Circulo cir1=new Circulo(6);
        Circulo cir2=new Circulo (8);
     
        //Agregarlos al ArrayList
        
        figuritas.add(c1);
        figuritas.add(c2);
        figuritas.add(c3);
        figuritas.add(r1);
        figuritas.add(t1);
        figuritas.add(t2);
        figuritas.add(cir1);
        figuritas.add(cir2);
        
        return figuritas;
    }
}
