/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author chris
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int cantidadPaginas;
    
        public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int cantidadPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }


    
    
}
