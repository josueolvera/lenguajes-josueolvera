/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package malo;

/**
 *
 * @author alexander
 */
public class Malo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Imc objeto;
       
       objeto = new Imc();
       objeto.setPeso(82);
       objeto.setEstatura(1.68f);
       
       System.out.println("El peso es:"+objeto.getPeso());
       System.out.println("La estatura es:"+objeto.getEstatura());
       System.out.println("El Imc es:"+objeto.calcular());
       
       
    }
}


/*1.-¿Estamos usando los atributos de la claxe Imc en el main?
 * R=No por que en el metodo de la clase imc se volvieron a declarar otros atributos
 * 
 * 2.-¿Que modificarias en la clase imc para que el metodo calcula ocupara los atributos?
 * R=eliminaria los argumentos del metodo para que ocupe los atributos declarados
 * public float calcular ()
 * 
 * 3.-¿En la clase main tal y como esta trata de imprimir el valor de los atributos 
 * y modificar su valor?
 * R=System.out.println("El peso es:"+objeto.getPeso());
       System.out.println("La estatura es:"+objeto.getEstatura());
       System.out.println("El Imc es:"+objeto.calcular());
       
 * 
 * 4.-Poner los atributos negativos es imposible en este problema como le harias para imedir 
 * que en el metodo main en este problema el peso y la estatura sean negativos 
 * R=public float calcular (){
        if(peso<0) peso=-peso;{
        if(estatura<0)estatura=-estatura;{
        float elimc=peso/(estatura*estatura);
        return elimc;
 * 
 * 
 *
 * 
 */
