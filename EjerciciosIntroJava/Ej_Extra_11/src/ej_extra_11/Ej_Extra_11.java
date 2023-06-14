/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package ej_extra_11;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        // Lectura del número entero
        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();
        
        // Contador de dígitos
        int contador = 0;
        
        // Calcular la cantidad de dígitos
        while (numero != 0) {
            numero /= 10; // División entera por 10 para eliminar el último dígito
            contador++; // Incrementar el contador de dígitos
        }
        
        // Mostrar la cantidad de dígitos
        System.out.println("La cantidad de dígitos es: " + contador);
    }
}