/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

import java.lang.Exception;

public class NumeroNoNegativoException extends Exception{
    public NumeroNoNegativoException(){
        super("Lo siento pero no acepto valores negativos");
    }
    
}
