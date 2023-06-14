/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ej_extra_08;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        // Variables
        int cantidadNumeros = 0; // Cantidad total de números leídos
        int cantidadPares = 0; // Cantidad de números pares leídos
        int cantidadImpares = 0; // Cantidad de números impares leídos
        
        // Bucle para leer los números enteros
        while (true) {
            System.out.println("Ingrese un número entero (0 para finalizar): ");
            int numero = leer.nextInt();
            
            // Verificar si el número es múltiplo de cinco
            if (numero % 5 == 0) {
                break; // Detener la lectura
            }
            
            // Verificar si el número es negativo
            if (numero < 0) {
                continue; // Ignorar números negativos y continuar con la lectura
            }
            
            // Contar números pares e impares
            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
            
            cantidadNumeros++;
        }
        
        // Mostrar los resultados
        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}