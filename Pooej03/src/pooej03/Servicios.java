/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej03;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Servicios {

    Scanner leer = new Scanner(System.in);

    public Operaciones crearOperacion() { //creación del método

        Operaciones Objeto1 = new Operaciones(); //Creacion de objeto.
        System.out.println("Ingrese el primer numero:");
        Objeto1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo número:");
        Objeto1.setNum2(leer.nextInt());

        return Objeto1;  //Si no se retorna te da error el programa.
    }

    public void suma(Operaciones Objeto1) { //Creacion de metodo suma
        int resultado = (Objeto1.getNum1() + Objeto1.getNum2());
        System.out.println("El resultado de la suma es " + resultado);
    }

    public void resta(Operaciones Objeto1) {
        if (Objeto1.getNum1() > Objeto1.getNum2()) {

            int resultado = Objeto1.getNum1() - Objeto1.getNum2();
            System.out.println("El resultado " + resultado);
        } else {
            int resultado = Objeto1.getNum2() - Objeto1.getNum1();
            System.out.println("El resultado " + resultado);
        }

    }

    public void multiplicar(Operaciones Objeto1) {
    if (Objeto1.getNum1() != 0 && Objeto1.getNum2() != 0) {  //Cuando pongo el admiracion al principio es 0 a equals.
    int resultado = Objeto1.getNum1() * Objeto1.getNum2();
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }     else {
        System.out.println("No se puede multiplicar por 0");
    }
                         
        
    }
    public void division(Operaciones Objeto1){
    if (Objeto1.getNum1() != 0 && Objeto1.getNum2() != 0){
    double resultado = Objeto1.getNum1() / Objeto1.getNum2();
        System.out.println("El resultado de la division es: "+resultado);
    } else if (Objeto1.getNum1()==0){
        System.out.println("El resultado de la division es 0");
    }else {
        System.out.println("No se puede dividir entre ceros.");
    }
        
    }
    
}

//    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

