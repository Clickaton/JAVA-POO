/*
/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/


package Entidades;
import java.util.Arrays; //Se importa para realizar arreglos. (BUSCAR INFO)

/**
 *
 * @author Christian
 */
public class ObjetoArreglos {
    private int tamaño1;
    private int tamaño2;
    private double [] vector1=new double[tamaño1];
    private double [] vector2=new double[tamaño2];
    
    public ObjetoArreglos() {
    }


    public ObjetoArreglos(int tamaño1, int tamaño2, double[] vector1, double[] vector2) {
        this.tamaño1 = tamaño1;
        this.tamaño2 = tamaño2;
        this.vector1 = vector1;
        this.vector2 = vector2;
    }


    public int getTamaño1() {
        return tamaño1;
    }


    public void setTamaño1(int tamaño1) {
        this.tamaño1 = tamaño1;
    }


    public int getTamaño2() {
        return tamaño2;
    }


    public void setTamaño2(int tamaño2) {
        this.tamaño2 = tamaño2;
    }


    public double[] getVector1() {
        return vector1;
    }


    public void setVector1(double[] vector1) {
        this.vector1 = vector1;
    }


    public double[] getVector2() {
        return vector2;
    }


    public void setVector2(double[] vector2) {
        this.vector2 = vector2;
    }


    @Override
    public String toString() {
        return "Arreglos [tamaño1=" + tamaño1 + ", tamaño2=" + tamaño2 + ", vector1=" + Arrays.toString(vector1)
                + ", vector2=" + Arrays.toString(vector2) + "]";
    }

    
   

}
