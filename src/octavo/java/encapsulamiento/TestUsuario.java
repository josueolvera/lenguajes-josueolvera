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
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario xxx = new Usuario();
        xxx.setNombre("Josue");
        xxx.setEdad(20);
        System.out.println(xxx.getNombre());
        System.out.println(xxx.getEdad());
    }
    
}
