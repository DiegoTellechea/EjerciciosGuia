/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package ej_extra_17_primoapp;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_17_PrimoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();

        // Verificar si el número ingresado es primo
        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        
    }

    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        // Un número menor o igual a 1 no es primo
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número es divisible por algún número desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Si se encuentra un divisor, el número no es primo
                return false;
            }
        }

        // Si no se encontraron divisores, el número es primo
        return true;
    }
}
