/*
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/


package ServiciosArreglos;
import Entidades.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class MetodosArreglos {
    
    Scanner leer = new Scanner(System.in);
    BigDecimal big1;

    ObjetoArreglos nuevoArreglo = new ObjetoArreglos();


    //Metodo para pedir el tamaño de los vectores al usuario
    public void tamañovector() {
        System.out.println("Ingrese el tamaño del vector 1");
        nuevoArreglo.setTamaño1(leer.nextInt());
        System.out.println("Ingrese el tamaño del vector 2");
        nuevoArreglo.setTamaño2(leer.nextInt());
    }

    //Metodo para llenar el vector 1 de forma aleatoria
    public void llenarVector1() {
        double num;
        double [] aux = new double[nuevoArreglo.getTamaño1()];
        for (int i=0; i<(nuevoArreglo.getTamaño1()); i++) {
        big1 = new BigDecimal(Math.random()*100);
        num = big1.setScale(2,RoundingMode.DOWN).doubleValue();
        aux[i]=num;
        }   
        nuevoArreglo.setVector1(aux);
    }   


    //Metodo para mostrar el vector 1
    public void mostrarVector1(){
        
        System.out.println("El vector 1 es : "+Arrays.toString(nuevoArreglo.getVector1()));
        
    }

    //Metodo para llenar el vector 2 con los primeros 10 numeros ordenados de menor a mayor del vector 1 y luego 0,5
    public void llenaryMostrarVector2(){
        double [] aux = new double [nuevoArreglo.getTamaño1()];
        double [] aux2 = new double [nuevoArreglo.getTamaño2()];
        aux=nuevoArreglo.getVector1();
        Arrays.sort(aux);

        System.out.println("El vector auxiliar ordenado es :"+Arrays.toString(nuevoArreglo.getVector1()));

        for (int i=0; i<nuevoArreglo.getTamaño2(); i++) {
            if (i<10) {
                aux2[i]=aux[i];
        }else{
            Arrays.fill(aux2,10,20,0.5);
        }

        }
        nuevoArreglo.setVector2(aux2);
        System.out.println("El vector 2 es :"+Arrays.toString(nuevoArreglo.getVector2()));
    }    
    

    
}
