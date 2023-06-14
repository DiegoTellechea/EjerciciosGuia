/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ej_9_guia_capturacero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_9_Guia_capturaCero {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int tope = 20; // Definimos el límite de números a leer
        
        for (int i = 1; i <= tope; i++) { // Bucle para leer los números
            System.out.print("Ingrese el número " + i + ": ");
            int numero = leer.nextInt();
            
            if (numero == 0) { // Si el número leído es cero, se sale del bucle
                System.out.println("Se capturó el número cero.");
                break;
            }
            
            if (numero < 0) { // Si el número leído es negativo, se ignora y se pasa al siguiente
                continue;
            }
            
            suma = suma + numero; // Se suma el número leído a la variable suma
        }
        
        System.out.println("La suma de los números leídos es: " + suma); // Se muestra la suma final
    }
}