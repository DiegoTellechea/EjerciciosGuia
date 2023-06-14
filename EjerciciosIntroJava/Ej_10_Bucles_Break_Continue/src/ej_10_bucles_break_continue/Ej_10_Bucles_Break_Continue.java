/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ej_10_bucles_break_continue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_10_Bucles_Break_Continue {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numLimite;

        do {
            System.out.println("Ingrese un valor límite positivo:");
            try {
                numLimite = leer.nextInt();
                if (numLimite <= 0) {
                    System.out.println("El valor límite debe ser positivo. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero. Intente nuevamente.");
                leer.nextLine(); // Limpia el búfer del scanner
                numLimite = 0; // Establece un valor no válido para repetir el bucle
            }
        } while (numLimite <= 0);
        
        int suma = 0; // Variable para almacenar la suma de los números introducidos

        // Iteramos hasta que la suma supere el límite inicial
        while (suma <= numLimite) {
            System.out.println("Ingrese un número:");
            try {
                int num = leer.nextInt();
                suma += num; // Sumamos el número ingresado a la variable 'suma'
                
                // Verificamos si la suma supera el límite
                if (suma > numLimite) {
                    break; // Salimos del bucle si la suma supera el límite
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero. Intente nuevamente.");
                leer.nextLine(); // Limpia el búfer del scanner
            }
        }

        System.out.println("La suma de los números introducidos superó el límite inicial.");
    }
}