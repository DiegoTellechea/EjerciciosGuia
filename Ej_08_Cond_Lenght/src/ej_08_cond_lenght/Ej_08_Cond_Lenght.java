/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Length() en Java.
 */
package ej_08_cond_lenght;

import java.util.Scanner;

/**
 *
 * author Diego T.
 */
public class Ej_08_Cond_Lenght {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese una frase de 8 letras:"); // Solicitar al usuario que ingrese una frase
        String frase = leer.nextLine(); // Leer la frase ingresada por el usuario y almacenarla en la variable "frase"

        if (frase.length() == 8) { // Verificar si la longitud de la frase es igual a 8 utilizando la función length()
            System.out.println("CORRECTO"); // Imprimir "CORRECTO" si la longitud de la frase es 8
        } else {
            System.out.println("INCORRECTO"); // Imprimir "INCORRECTO" si la longitud de la frase no es 8
        }
    }

}