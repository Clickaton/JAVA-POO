/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.cadena;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Metodos {

    Scanner leer = new Scanner(System.in);
    cadena cad1 = new cadena();
    String frase2; //tarea buscar forma de renombrar la variable de forma global.
    String dobleFrase;
    String reemplazo;

    public cadena crearCadena() {
        System.out.println("Ingrese una frase o palabras separadas con un espacio:");
        cad1.setFrase(leer.nextLine()); //Si dejo solo next toma la frase hasta que hay un espacio.
        cad1.setLongitud(cad1.getFrase().length()); //ingreso la longitud de la frase

        return cad1;
    }

    public void mostrarVocales() {
        int contador = 0;

        for (int i = 0; i < cad1.getLongitud(); i++) {
            String letra = cad1.getFrase().substring(i, i + 1); //Recorro la frase letra por letra.

            switch (letra.toUpperCase()) { //tomo la variable en mayuscula con toupperCase
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    contador++;
                    break;

            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + contador);
    }

    public void invertirFrase() {

        for (int i = cad1.getLongitud() - 1; i >= 0; i--) //Se le sacan las llaves solo cuando es una linea
        {
            System.out.print(cad1.getFrase().substring(i, i + 1));
        }

        System.out.println("");
    }

    public void vecesRepetido() {
        String letra;
        int cont2 = 0;
        do {
            System.out.println("Ingrese la letra a buscar: ");
            letra = leer.nextLine();
        } while (letra.length() > 1);

        for (int i = 0; i < cad1.getLongitud(); i++) {
            String letra1 = cad1.getFrase().substring(i, i + 1);
            if (letra1.equalsIgnoreCase(letra)) //para ignorar mayusculas y minusculas.
            {
                cont2++;
            }
        }
        System.out.println("La letra " + letra + " , se repite " + cont2 + " veces.");
    }

    public void compararLongitud() {
        System.out.println("Ingrese una nueva frase:");
        frase2 = leer.nextLine();
        if (cad1.getLongitud() > frase2.length()) {
            System.out.println("La frase anterior tiene una mayor longitud que la actual.");
        } else if (cad1.getLongitud() < frase2.length()) {
            System.out.println("La frase anterior tiene una menor longitud que la actual.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }

    public void unirFrases() {
        dobleFrase = cad1.getFrase() + " + " + frase2;
        System.out.println(dobleFrase);
    }

    public void reemplazar() {
        String caracter;
        do {
            System.out.println("Ingrese un caracter que desee modificar por la letra a de la frase:");
            caracter = leer.nextLine();
        } while (caracter.length() > 1);

        for (int i = 0; i < cad1.getLongitud(); i++) {
            String letra = cad1.getFrase().substring(i, i + 1);

//            switch (letra.toUpperCase()){  El switch se suele utilizar con 5 elementos o mas.
//                case "A": letra=caracter;
            if (letra.equalsIgnoreCase("a")) { //Otra forma de utilizarlo sin el switch
                reemplazo = cad1.getFrase().substring(0, i).concat(caracter); //Se cuenta
                reemplazo += cad1.getFrase().substring(i + 1, cad1.getLongitud()); // Se reemplaza | //el += se utiliza para evitar ponernum= num + num

            }

        }
        System.out.println(reemplazo);
    }

    public boolean contiene() {
        String letra;

        do {
            System.out.println("Ingrese la letra a buscar: ");
            letra = leer.nextLine();
        } while (letra.length() > 1);

         //String letra1 = cad1.getFrase().substring(i, i + 1);
        for (int i = 0; i < cad1.getLongitud(); i++) {
            String letra1 = cad1.getFrase().substring(i, i + 1);
            if (letra1.equalsIgnoreCase(letra)) //para ignorar mayusculas y minusculas.
            {

                return true;
            }

        }
        return false;
    }
}