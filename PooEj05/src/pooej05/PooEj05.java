/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;
import Servicios.Metodos;

/**
 *
 * @author chris
 */
public class PooEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Metodos metodo1 = new Metodos(); //Declaro metodos para traer las clases
       metodo1.cuenta(); //traigo clase cuentabancaria
       metodo1.ingresoDinero();
       metodo1.menu();
    
    }
    
}
