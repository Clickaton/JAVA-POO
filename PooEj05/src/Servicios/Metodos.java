/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.cuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos { //Creo el método con el mismo nombre que mi (entidad u objeto).

    Scanner leer = new Scanner(System.in);
    cuentaBancaria cta1 = new cuentaBancaria(); //Creo el objeto de forma global para no tener que pasar por parametro.

    public cuentaBancaria cuenta() {
       
        System.out.println("Ingrese el Nº de cuenta:");
        cta1.setNumeroCuenta(leer.next());
        System.out.println("Ingrese el DNI:");
        cta1.setDni(leer.next()); //saco el nextLine por next solo para que me tome el ingreso.
        return cta1;
    }

    public void ingresoDinero() {
        System.out.println("Ingrese la cantidad de dinero en la cuenta:");
    int ingreso = leer.nextInt();
    cta1.setSaldoActual(cta1.getSaldoActual()+ingreso);
    }

    public void menu() {
        double deposito;
        int retiro;
        int opcion;
        do {
            System.out.println("~~~MENU DE OPCIONES~~~");
            System.out.println("1.INGRESAR/DEPOSITAR DINERO");
            System.out.println("2.RETIRAR DINERO");
            System.out.println("3.EXTRACCIÓN RÁPIDA");
            System.out.println("4.CONSULTAR SALDO");
            System.out.println("5.CONSULTAR DATOS");
            System.out.println("6.SALIR");
            opcion=leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("INDIQUE CUANDO DINERO DESEA INGRESAR/DEPOSITAR:");
                    deposito = (leer.nextDouble());
                    cta1.setSaldoActual(cta1.getSaldoActual() + deposito);
                    System.out.println("");
                    System.out.println("");  
                    break;

                case 2:
                    System.out.println("INDIQUE CUANTO DINERO DESEA RETIRAR:");
                    deposito = (leer.nextDouble());
                    cta1.setSaldoActual(cta1.getSaldoActual()- deposito);
                    System.out.println("");
                    System.out.println("");                    
                    break;

                case 3:
                    cta1.setSaldoActual(cta1.getSaldoActual()-(cta1.getSaldoActual()*0.20));
                    System.out.println("SE HA RETIRADO SU DINERO CORRECTAMENTE!");
                    System.out.println("");
                    System.out.println("");                    
                    break;
                
                case 4:
                    System.out.println("SU SALDO ES DE : $" + cta1.getSaldoActual());
                    System.out.println("");
                    System.out.println("");                    
                    break; 
                
                case 5:
                    System.out.println("SU NÚMERO DE DOCUMENTO ES: " + cta1.getDni());
                    System.out.println("SU NÚMERO DE CUENTA ES: " + cta1.getNumeroCuenta());
                    System.out.println("SU SALDO ES DE: $" + cta1.getSaldoActual());
                    System.out.println("");
                    System.out.println("");                    
                    break;
                    
                case 6:
                    
                    System.out.println("~~MUCHAS GRACIAS POR USAR NUESTRO SERVICIO~~");
                    System.out.println("");
                    System.out.println("");                    
                   break; 
                                               
                default: System.out.println("POR FAVOR, INGRESE UNA OPCIÓN CORRECTA");
                    System.out.println("");
                    System.out.println("");                
                    break;
            }
        }while (opcion != 6);
            

        } 
    }



    

