/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package malo;

/**
 *
 * @author alexander
 */
public class Imc {
   private float peso;
   private float estatura;
    
    public Imc(){}
    
    public float calcular (){
        if(peso<0) peso=-peso;{
        if(estatura<0)estatura=-estatura;{
        float elimc=peso/(estatura*estatura);
        return elimc;
    }
    }    
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public float getPeso(){
        return peso;
    }
    
     public void setEstatura(float e){
        this.estatura = e;
    }
    
    public float getEstatura(){
        return estatura;
    }
    
}
