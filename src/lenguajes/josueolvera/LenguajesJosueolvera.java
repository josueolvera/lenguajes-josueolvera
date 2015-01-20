/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealenguajesorientados;

/**
 *
 * @author alexander
 */
public abstract class Persona {
    private String nombre;
    private int  edad;
    private double altura;
    private float peso;
    private String correo;
    private int numero;
    public double imc;
    
    public Persona(){}
    
    public void peso(){
        System.out.println("El peso de"+nombre+"es:"+peso);
    }
    
     public void masaCorporal(){
         imc=peso/(altura*altura);
         System.out.println("La masa corporal es:"+imc );
     }
    
    public void setNombre(String s){
        nombre = s;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(float p){
        peso = p;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setCorreo(String c){
        correo = c;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setNumero(int n){
        numero = n;
    }
    
    public int getNumero(){
        return numero;
    }
}
