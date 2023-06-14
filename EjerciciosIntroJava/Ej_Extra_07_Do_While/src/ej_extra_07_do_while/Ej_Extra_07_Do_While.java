/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_07_do_while;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_07_Do_While {

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

        // Bucle do-while para ingresar los números y realizar los cálculos
        do {
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
        } while (contador < n);

        // Calcular el promedio
        double promedio = (double) suma / n;

        // Mostrar los resultados
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
    }
}