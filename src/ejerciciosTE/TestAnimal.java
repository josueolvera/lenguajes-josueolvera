/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTE;

/**
 *
 * @author alexander
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Animal a:GenerarAnimales.generarAnimal()){
            System.out.println(a.getNombre()+" "+a.getEdad());
        }
    }
    
}
