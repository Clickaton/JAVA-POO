/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.

 */
package Servicios;

import Entidades.Cafetera;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Metodos {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera c1 = new Cafetera();

        return c1;
    }

    public void llenarCafetera(Cafetera c1) {

        c1.setCapacidadMaxima(3000);
        System.out.println("¡LA CAFETERA SE HA LLENADO CORRECTAMENTE!");
        System.out.println("");
        System.out.println("");
    }

    public void servirTaza(Cafetera c1) {
        System.out.println("INDIQUE EL TAMAÑO DE LA TAZA EN LITROS:");
        int tamTaza = leer.nextInt();
        System.out.println("");
        if (c1.getCantidadActual() >= tamTaza) {
            c1.setCantidadActual(c1.getCantidadActual() - tamTaza);
        } else {
            System.out.println("LA CANTIDAD QUE DESEA SERVIR ES INSUFICIENTE, LE SERVIREMOS LO QUE SE ENCUENTRA DISPONIBLE");
            c1.setCantidadActual(tamTaza - c1.getCantidadActual());
            System.out.println("");
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("SE HA VACIADO LA CAFETERA CORRECTAMENTE!");
        System.out.println("");
        System.out.println("");

    }

    public void agregarCafe(Cafetera c1) {
        System.out.println("INGRESE LA CANTIDAD DE CAFE QUE DESEA INGRESAR:");
        int cantCafe = leer.nextInt();
        if (cantCafe <= c1.getCapacidadMaxima()) {
            c1.setCantidadActual(cantCafe);
            System.out.println("SE HA LLENADO LA CAFETERA CORRECTAMENTE!");
        } else {
            System.out.println("LA CANTIDAD QUE DESEA INGRESAR NO CUMPLE CON LOS REQUERIMIENTOS DEL SISTEMA");
        }
        System.out.println("");
        System.out.println("");
    }

    public void menu(Cafetera c1) {
        int opcion;
        do {
            System.out.println("~~~BIENVENIDO A NESPRESSO~~~");
            System.out.println("¿QUÉ DESEA HACER?");
            System.out.println("1.LLENAR CAFETERA");
            System.out.println("2.SERVIR TAZA DE CAFE");
            System.out.println("3.VACIAR CAFETERA");
            System.out.println("4.AGREGAR CAFE");
            System.out.println("5.SALIR");
            System.out.println("");
            System.out.println("");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    llenarCafetera(c1);
                    break;
                case 2:
                    servirTaza(c1);
                    break;
                case 3:
                    c1.setCantidadActual(0);
                    System.out.println("LA CAFETERA SE HA VACIADO CORRECTAMENTE.");
                    System.out.println("");
                    System.out.println("");
                    break;
                case 4:
                    agregarCafe(c1);
                    break;
                case 5:
                    System.out.println("ESTÁ SEGURO QUE DESEA SALIR?");
                    int opc2;
                    System.out.println("");
                    System.out.println("1.SI");
                    System.out.println("2.NO");
                    opc2=leer.nextInt();
                    if(opc2 == 2){
                        menu(c1);
                        break;
                    }
                    System.out.println("MUCHAS GRACIAS POR USAR NUESTRO SERVICIO");
                    System.out.println("");
                    System.out.println("");
                    break;
            }
        } while (opcion != 5);

    }

}
