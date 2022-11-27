/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01libro;

import Entidades.Libro;
import Servicios.Metodos;

/**
 *
 * @author chris
 */
public class PooEj01Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Metodos m1 = new Metodos();
       Libro l1 = m1.nuevoMetodo(); // Esta es la forma para llamar al servicio donde se encuentra la lógica
       m1.impresion(l1);
       // System.out.println(m1); 
        
       
              
        
    }
}
