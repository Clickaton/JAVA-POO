/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author chris
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String conv = "";

    public Libro nuevoMetodo() { //Creación del metodo para poder utilizar el Scanner
        Libro libro01 = new Libro(); //Creación del objeto para poder utilizar sus atributos 
        System.out.println("Ingrese el Número ISBN del libro:");
        libro01.ISBN = leer.nextInt();
        conv = Integer.toString(libro01.ISBN);
        if (conv.length() != 9 && conv.length() < 9) {
              do {
                System.out.println("Ingrese el Número ISBN del libro:");
            String conv = ""; //Creo la variable para hacer la conversión de int a String
              libro01.ISBN = leer.nextInt();
             conv = Integer.toString(libro01.ISBN); //Realizo la converversion con el metodo toString               
            } while (conv.length() != 9 && conv.length() < 9);
        }
        System.out.println("Escriba el nombre del autor");
        libro01.autor = leer.next();
        System.out.println("Escriba la cantidad de páginas:");
        libro01.cantidadPaginas = leer.nextInt();
        System.out.println("Escriba el título");
        libro01.titulo = leer.next();
        return libro01;
    }
    public void impresion(Libro libro01){
        System.out.println("El número ISBN del libro es: "+ libro01.ISBN);
        System.out.println("El nombre del autor es: "+libro01.autor);
        System.out.println("La cantidad de páginas es de: "+libro01.cantidadPaginas);
        System.out.println("El título del libro es: "+libro01.titulo);
    }
    
}
