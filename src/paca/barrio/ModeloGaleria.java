/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

import java.util.ArrayList;


public class ModeloGaleria {
    
    public static ArrayList<Galeria> generarGaleria(){
        ArrayList<Galeria> arreglo = new ArrayList<Galeria>();
        Galeria g1 =new Galeria("Barca","Mejor equipo del mundo","/paca/barrio/uno.jpg");
        Galeria g2 = new Galeria("Clasico","Los mejores de la liga ","/paca/barrio/dos.jpg");
        Galeria g3 = new Galeria("Real Madrid","Peor del mundo junto con penaldo","/paca/barrio/tres.jpg");
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        
        return arreglo;
    }
}
