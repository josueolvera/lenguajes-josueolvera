/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoP;

/**
 *
 * @author JOSUE
 */
public class Galeria {

    private String titulo;
    private String url;
    private String descripcion;
    
    public Galeria() {
    }

    public Galeria(String titulo, String url, String descripcion) {
        this.titulo = titulo;
        this.url = url;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
}
