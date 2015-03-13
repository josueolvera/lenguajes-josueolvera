/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threads;

/**
 *
 * @author JOSUE
 */
public class ThreadsTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread Josue=new Thread(new Runnable(){
           

            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    String nombre= Thread.currentThread().getName();
                System.out.println(nombre+"  gano");
                }catch(Exception e){}
                }
            
        }
        );
         Thread Robinson = new Thread (new Runnable(){

            @Override
            public void run() {
                try{
                    Thread.sleep(6000);
                    String nombre = Thread.currentThread().getName();
                    System.out.println(nombre+"  llego despues");
                }catch(Exception e){}
            }
             
         }
         );
         Thread Charly = new Thread ( new Runnable(){

            @Override
            public void run() {
                try{
                    Thread.sleep(9000);
                    String nombre= Thread.currentThread().getName();
                    System.out.println(nombre+"  Es el ultimo");
                }catch(Exception e){}
            }
             
         }
         );
         
         Josue.setName("Josue");
         Robinson.setName("Robinson");
         Charly.setName("Charly");
         
         Josue.start();
         Robinson.start();
         Charly.start();
    }
    
}
