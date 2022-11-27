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
package pooej04;

import Entidades.Rectangulo;
import Servicios.Metodos;

/**
 *
 * @author chris
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Este metodo es mas compatible con los arraylist.
        //Para transmitir un parametro.
      
    Metodos metodo1 = new Metodos(); //Creo un nuevo servicio para traer el de la lógica al main.
    Rectangulo r1 = metodo1.crearRectangulo(); //Se trae al objeto con el mismo nombre y se lo iguala con el nombre del método..
    metodo1.calcularSuperficie(); //Se trae al método para calcular la superficie
    metodo1.dibujarRectangulo();//Se trae al método para dibujar el rectangulo
    
    
    
            
            
    
    
    
    
    
    
}
}