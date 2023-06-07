/*
 Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ej_extra_05_obrasocial;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_05_ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);

        //  Solicitar al usuario que ingrese la clase de socio ('A', 'B' o 'C').
        System.out.println("Ingrese la clase de socio ('A', 'B' o 'C'): ");

        //  Leer y almacenar la clase de socio ingresada en una variable llamada "claseSocio".
        char claseSocio = leer.nextLine().charAt(0);

        //  Solicitar al usuario que ingrese el costo del tratamiento.
        System.out.println("Ingrese el costo del tratamiento: ");

        //  Leer y almacenar el costo del tratamiento en una variable llamada "costoTratamiento".
        double costoTratamiento = leer.nextDouble();

        //  Crear una variable llamada "importePagar" y establecerla inicialmente como el valor del costo del tratamiento.
        double importePagar = costoTratamiento;

        //  Utilizar una estructura condicional (como un if-else o un switch-case) para determinar el importe en efectivo a pagar.
        switch (claseSocio) {
            case 'A':
                //  Calcular el descuento correspondiente según la clase de socio y restarlo al importe a pagar.
                importePagar -= costoTratamiento * 0.5;
                break;
            case 'B':
                importePagar -= costoTratamiento * 0.35;
                break;
            case 'C':
                // No hay descuento para la clase de socio 'C', no es necesario realizar ninguna operación.
                break;
            default:
                System.out.println("La clase de socio ingresada no es válida.");
                return;
        }

        //  Mostrar el importe en efectivo a pagar por el socio.
        System.out.println("El importe en efectivo a pagar es: " + importePagar);
    }
}