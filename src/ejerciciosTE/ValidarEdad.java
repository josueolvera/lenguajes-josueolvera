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
public class ValidarEdad {
    public static void validar(int edad)throws EdadNoNegativaException{
        if(edad < 0) throw new EdadNoNegativaException();
    }
}
