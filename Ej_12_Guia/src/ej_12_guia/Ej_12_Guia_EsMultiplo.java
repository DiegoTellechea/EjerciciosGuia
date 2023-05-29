/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
 * que el primer número sea múltiplo del segundo, e imprima si el primer número es múltiplo del
 * segundo, sino informe que no lo son.
 */
package ej_12_guia;

import java.util.Scanner;

/**
 * Ejercicio 12 - Guía de Ejercicios
 * Verifica si un número es múltiplo de otro número.
 * 
 * Autor: Diego T.
 */
public class Ej_12_Guia_EsMultiplo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt(); // Se lee el primer número ingresado por el usuario
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt(); // Se lee el segundo número ingresado por el usuario
        
        EsMultiplo(numero1, numero2); // Se llama al procedimiento EsMultiplo y se le pasan los dos números
    }
    
    /**
     * Verifica si un número es múltiplo de otro número y muestra el resultado por consola.
     * 
     * @param numero1 el primer número ingresado por el usuario
     * @param numero2 el segundo número ingresado por el usuario
     */
    public static void EsMultiplo(int numero1, int numero2) {
        if (numero1 % numero2 == 0) { // Se verifica si el primer número es múltiplo del segundo
            System.out.println(numero1 + " es múltiplo de " + numero2); // Se imprime el mensaje indicando que es múltiplo
        } else {
            System.out.println(numero1 + " no es múltiplo de " + numero2); // Se imprime el mensaje indicando que no es múltiplo
        }
    }
}
