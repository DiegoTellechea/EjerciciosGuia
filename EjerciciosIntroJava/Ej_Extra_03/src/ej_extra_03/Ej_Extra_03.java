/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package ej_extra_03;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);

        //  Solicitar al usuario que ingrese una letra.
        System.out.println("Ingrese una letra: ");

        //  Leer y almacenar la letra ingresada en una variable llamada "letra".
        String letra = leer.nextLine().toLowerCase();

        //  Convertir la letra ingresada a minúscula para facilitar la comparación.

        //  Crear una variable booleana llamada "esVocal" y establecerla inicialmente como false.
        boolean esVocal = false;

        //  Comparar la letra ingresada con cada una de las vocales (a, e, i, o, u)
        // utilizando la función equals() de la clase String.
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            // Paso 6: Si la letra ingresada es igual a alguna de las vocales, establecer "esVocal" como true.
            esVocal = true;
        }

        //  Si "esVocal" es true, mostrar un mensaje indicando que la letra ingresada es una vocal.
        if (esVocal) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            // Paso 8: Si "esVocal" es false, mostrar un mensaje indicando que la letra ingresada no es una vocal.
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}