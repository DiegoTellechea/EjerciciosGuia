/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ej_extra_22_llenarmatrizaleatoria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_22_llenarMatrizAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        // Crear la matriz y llenarla con valores aleatorios
        int[][] matriz = generarMatrizAleatoria(filas, columnas);

        // Mostrar la matriz
        System.out.println("Matriz:");
        mostrarMatriz(matriz, filas, columnas);

        // Calcular la suma de los elementos de la matriz
        int suma = sumarElementosMatriz(matriz, filas, columnas);

        // Mostrar la suma de los elementos de la matriz
        System.out.println("La suma de los elementos de la matriz es: " + suma);

        scanner.close();
    }

    // Función para generar una matriz de tamaño NxM con valores aleatorios
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10); // Generar valor aleatorio entre 0 y 9
            }
        }

        return matriz;
    }

    // Procedimiento para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para sumar los elementos de una matriz
    public static int sumarElementosMatriz(int[][] matriz, int filas, int columnas) {
        int suma = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}