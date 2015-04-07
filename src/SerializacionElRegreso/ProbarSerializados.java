/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializacionElRegreso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarSerializados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un Usuario
        Usuario u = new  Usuario();
        u.setEmail("josue_armany@hotmail.com");
        u.setNombre("Josue Olvera R");
        u.setSueldo(10000);
        
        //Lo guardamos
        
        PersistenciaUsuario per = new PersistenciaUsuario();
        try {
            per.guardar(u);
            System.out.println("Usuario guardado con Exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
}
