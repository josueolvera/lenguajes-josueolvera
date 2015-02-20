/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-301
 */
public class ValidarValorNoNegativo {
    public static void validar(float valor)throws NumeroNoNegativoException{
        if(valor<0) throw new NumeroNoNegativoException();
        
            
    }
}
