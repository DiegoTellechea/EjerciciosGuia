/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ej_07_condeureka;

import java.util.Scanner;

/**
 *
 * author Diego T.
 */
public class Ej_07_CondEureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese una frase:"); // Solicitar al usuario que ingrese una frase
        String frase = leer.nextLine(); // Leer la frase ingresada por el usuario y almacenarla en la variable "frase"
        String fraseMinusculas = frase.toLowerCase(); // Convertir la frase a minúsculas y almacenarla en la variable "fraseMinusculas"

        if (fraseMinusculas.equals("eureka")) { // Comparar la frase en minúsculas con la cadena "eureka" utilizando la función equals()
            System.out.println("Correcto"); // Imprimir "Correcto" si la frase es igual a "eureka"
        } else {
            System.out.println("Incorrecto"); // Imprimir "Incorrecto" si la frase no es igual a "eureka"
        }
    }

}