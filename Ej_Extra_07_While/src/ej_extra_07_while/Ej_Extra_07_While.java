/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package ej_extra_07_while;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_07_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Variables
        int n; // Cantidad de números a ingresar
        int contador = 0; // Contador para controlar el bucle
        int numero; // Número ingresado por el usuario
        int suma = 0; // Suma de los números ingresados
        int maximo; // Valor máximo
        int minimo; // Valor mínimo

        // Solicitar la cantidad de números a ingresar
        System.out.println("Ingrese la cantidad de números: ");
        n = leer.nextInt();

        // Solicitar el primer número y utilizarlo para inicializar maximo y minimo
        System.out.println("Ingrese un número: ");
        numero = leer.nextInt();
        maximo = numero;
        minimo = numero;
        suma += numero;
        contador++;

        // Bucle while para ingresar los números y realizar los cálculos
        while (contador < n) {
            System.out.println("Ingrese un número: ");
            numero = leer.nextInt();
            
            // Actualizar el máximo y mínimo
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            
            suma += numero;
            contador++;
        }

        // Calcular el promedio
        double promedio = (double) suma / n;

        // Mostrar los resultados
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
    }
}