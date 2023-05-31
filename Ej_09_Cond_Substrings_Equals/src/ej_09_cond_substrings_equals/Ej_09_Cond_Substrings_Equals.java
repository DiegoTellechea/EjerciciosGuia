/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ej_09_cond_substrings_equals;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_09_Cond_Substrings_Equals {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese una frase o palabra"); // Pedimos al usuario que ingrese una frase o palabra
        String frase = leer.nextLine(); // Leemos la frase ingresada y la guardamos en la variable 'frase'
        String fraseMin = frase.toLowerCase(); // Convertimos la frase a minúsculas y la guardamos en la variable 'fraseMin'
        
        String letra = fraseMin.substring(0); // Extraemos la primera letra de la frase utilizando el método 'substring'
        
        if (letra.equals("a")) { // Comparamos la primera letra con el valor "a" utilizando el método 'equals'
            System.out.println("CORRECTO"); // Si la primera letra es "a", mostramos el mensaje "CORRECTO"
        } else {
            System.out.println("INCORRECTO"); // Si la primera letra no es "a", mostramos el mensaje "INCORRECTO"
        }
    }
}








