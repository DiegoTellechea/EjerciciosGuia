/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ej_10_bucles_break_continue;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_10_Bucles_Break_Continue {

  
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in); 

        System.out.println("Ingrese un valor límite positivo");
        int numLimite = leer.nextInt();

        // Verificamos si el valor límite es positivo
        if (numLimite <= 0) {
            System.out.println("Ingrese un número límite positivo");
            numLimite = leer.nextInt(); 
        }

        int suma = 0; // Variable para almacenar la suma de los números introducidos

        // Iteramos hasta que la suma supere el límite inicial
        while (suma <= numLimite) {
            System.out.println("Ingrese un número:");
            int num = leer.nextInt();

            suma += num; // Sumamos el número ingresado a la variable 'suma'

            // Verificamos si la suma supera el límite
            if (suma > numLimite) {
                break; // Salimos del bucle si la suma supera el límite
            }
        }

        System.out.println("La suma de los números introducidos superó el límite inicial.");
    }
}
