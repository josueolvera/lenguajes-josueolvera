/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

/**
 *
 * @author T-301
 */
public class Enumeraciones {

    public static void main(String[] args) {
        
        // malo --->System.out.println(MaquinaMala.ATASCADA);
        
        MaquinaBuena maquina= new MaquinaBuena();
        maquina.setEstado(EstadoDeMaquina.ATASCADA);
        System.out.println("El estado de la maquina es:"+maquina.getEstado());
    }
    
}
