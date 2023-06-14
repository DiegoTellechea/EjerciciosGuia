/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
package ej_extra_24_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_24_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci a generar: ");
        int n = leer.nextInt();

        // Crear el vector para almacenar los números de la sucesión de Fibonacci
        int[] fibonacci = new int[n];

        // Generar la sucesión de Fibonacci y almacenar los números en el vector
        generarSucesionFibonacci(fibonacci);

        // Mostrar los números de la sucesión de Fibonacci
        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        leer.close();
    }

    // Función para generar la sucesión de Fibonacci y almacenar los números en un vector
    public static void generarSucesionFibonacci(int[] fibonacci) {
        int n = fibonacci.length;

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}







