/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Cuadrado implements Superficies {
    private float lado;
    
    /**
     * Este constructor tiene un argumento de tipo flotante
     * @param lado El parametro que debes ingresar es el valor
     * del lado de tu cuadrado
     * @throws unitec.proyecto.geometria.NumeroNoNegativoException
     * @throws unitec.proyecto.geometria.RangoInvalidoException
     */
    
    public Cuadrado(float lado) throws NumeroNoNegativoException,RangoInvalidoException{

        ValidarValorNoNegativo.validar(lado);
        ValidarRango.validar(lado);
        this.lado=lado;
    }
    
    public Cuadrado(){
    
}
    
    public float calcularArea(){
       System.out.print("El area del cuadrado es:");
        float area=lado*lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException,RangoInvalidoException  {
        
          ValidarValorNoNegativo.validar(lado);
          ValidarRango.validar(lado);
          this.lado=lado;
            }
}
