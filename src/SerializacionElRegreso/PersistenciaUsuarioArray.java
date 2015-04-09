/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializacionElRegreso;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuarioArray {
    private ArrayList<Usuario> usuarios;
   
    //buscarTodis
    public  ArrayList<Usuario> buscarTodos() throws Exception{
        
        File f = new File ("Macintosh HD\\Usuarios\\alexander\\Escritorio\\archivaldo.mejorado");
        FileInputStream fis = new FileInputStream (f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuarios = new ArrayList <Usuario>();
        usuarios= (ArrayList<Usuario>)ois.readObject();
        
        return usuarios;
        
        
    }
     //Guardar
    public void guardar (Usuario us) throws Exception{
        usuarios = new ArrayList <Usuario>();
        File f =new File("Macintosh HD\\Usuarios\\alexander\\Escritorio\\archivaldo.mejorado");
        if(f.exists()){
            usuarios=buscarTodos();
        }
        FileOutputStream fos =new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
          usuarios.add(us);
          oos.writeObject(usuarios);
        
        
    }
}
