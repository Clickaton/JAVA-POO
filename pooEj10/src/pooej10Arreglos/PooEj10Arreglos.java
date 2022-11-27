/*
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/
package pooej10Arreglos;

import Entidades.ObjetoArreglos;
import ServiciosArreglos.MetodosArreglos;

/**
 *
 * @author Christian
 */
public class PooEj10Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ObjetoArreglos arg1 = new ObjetoArreglos();
        MetodosArreglos metodo1 = new MetodosArreglos();
        
        metodo1.tamañovector();
        metodo1.llenarVector1();
        metodo1.mostrarVector1();
        metodo1.llenaryMostrarVector2();
   
    }
    
}
