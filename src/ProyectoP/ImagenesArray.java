/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoP;

import java.util.ArrayList;

/**
 *
 * @author JOSUE
 */
public class ImagenesArray {
    
   ArrayList<Galeria> Imagenes= new ArrayList<Galeria>();
    
    
    public ImagenesArray() {
        Galeria g1 = new Galeria();
        g1.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 1.png");
        g1.setTitulo("Barcelona");
        g1.setDescripcion("Este equipo es uno de los ocho finalistas de la champions league "
                +"Estuvo en el grupo F donde quedo primer lugar del grupo con 15 puntos "
                +"Clasifico junto con el PSG y en los octavos de Final elimino al Manchester City ");
        
        Galeria g2 = new Galeria();
        g2.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 2.png");
        g2.setTitulo("Real Madrid");
        g2.setDescripcion("Es un equipo que le costo clasificar a los cuatos de Final "
                +"De la champions league con un rival que le costo trabajo vencer al Shalke04 "
                +"Estuvo en grupo B donde quedo primer lugar del grupo con 18 ptos ");
        
        Galeria g3 = new Galeria();
        g3.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 3.png");
        g3.setTitulo("Atletico de Madrid");
        g3.setDescripcion("Este equipo es uno de los ocho finalistas de la champions league "
                +"Estuvo en el grupo A donde quedo primer lugar del grupo con 13 puntos "
                +"Clasifico junto con la Juventus y en los octavos de Final elimino al Bayern Leverkusen ");
        
         Galeria g4 = new Galeria();
        g4.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 4.png");
        g4.setTitulo("Bayern Munchen");
        g4.setDescripcion("Es un equipo que no le costo clasificar a los cuatos de Final "
                +"De la champions league con un rival demasiado facil de vencer el Shakhtar "
                +"Estuvo en grupo E donde quedo primer lugar del grupo con 15 ptos");
        
        Galeria g5 = new Galeria();
        g5.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 5.png");
        g5.setTitulo("Porto");
        g5.setDescripcion("Este equipo es uno de los ocho finalistas de la champions league "
                +"Estuvo en el grupo H donde quedo primer lugar del grupo con 14 puntos "
                +"Clasifico junto con la Shakhtar y en los octavos de Final elimino al Basel 1893");
        
        Galeria g6 = new Galeria();
        g6.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 6.png");
        g6.setTitulo("Paris Saint Germain");
        g6.setDescripcion("Es un equipo que le costo clasificar a los cuatos de Final "
                +"De la champions league con un rival demasiado dificil de vencer el Chelsea "
                +"Estuvo en grupo F donde quedo segundo lugar del grupo con 13 ptos");
        
        Galeria g7 = new Galeria();
        g7.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 7.png");
        g7.setTitulo("As Monaco");
        g7.setDescripcion("Este equipo es uno de los ocho finalistas de la champions league "
                +"Estuvo en el grupo C donde quedo primer lugar del grupo con 11 puntos "
                +"Clasifico junto con el Leverkusen y en los octavos de Final elimino al Arsenal");
        
        
       Galeria g8 = new Galeria();
        g8.setUrl("\\Users\\T\\Documents\\NetBeansProjects\\lenguajes-josueolvera\\src\\Imagenes\\foto 8.png");
        g8.setTitulo("Paris Saint Germain");
        g8.setDescripcion("Es un equipo que no le costo clasificar a los cuatos de Final "
               +"De la champions league con un rival demasiado dificil de vencer el Dourtmount "
                +"Estuvo en grupo A donde quedo segundo lugar del grupo con 10 ptos"); 
        
        Imagenes.add(g1);
        Imagenes.add(g2);
        Imagenes.add(g3);
        Imagenes.add(g4);
        Imagenes.add(g5);
        Imagenes.add(g6);
        Imagenes.add(g7);
        Imagenes.add(g8);
    }

    public ArrayList<Galeria> getImagenes() {
        return Imagenes;
    }

    public void setImagenes(ArrayList<Galeria> Imagenes) {
        this.Imagenes = Imagenes;
    }
    
    
    
}
