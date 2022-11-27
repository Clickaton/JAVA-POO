/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Metodos {

    Scanner leer = new Scanner(System.in);
    Rectangulo r1 = new Rectangulo();//Creo el rectangulo fuera de los métodos para poder usarlo en todos

    public Rectangulo crearRectangulo() { // el método se crea de forma idéntica a la entidad u "objeto" creado.
//        Rectangulo r1 = new Rectangulo(); Si creo el rectangulo acá, voy a tener que hacerlo en todos los metodos.
        System.out.println("Ingrese la base del rectangulo:");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextInt());

        return r1;
    }

    public void calcularSuperficie() {
        int superficieRectangulo = (r1.getBase() * r1.getAltura());
        System.out.println("La superficie del rectangulo es: " + superficieRectangulo);
    }

    public void calcularPerimetro() {
        int perimetroRectangulo = (r1.getAltura() + r1.getBase()) * 2;
        System.out.println("El perímetro del rectangulo es: " + perimetroRectangulo);
    }

    public void dibujarRectangulo() {  // El codigo para crear un rectangulo con ciclo for.

        for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {

                if ((i > 1 && i < r1.getAltura()) && (j > 1 && j < r1.getBase())) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

//Base del rectangulo 
    }

}
