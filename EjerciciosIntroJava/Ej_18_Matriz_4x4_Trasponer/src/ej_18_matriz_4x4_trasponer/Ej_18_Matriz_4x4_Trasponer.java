/*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
   traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
   obtiene cambiando sus filas por columnas (o viceversa).
 */
package ej_18_matriz_4x4_trasponer;

import java.util.Random;

/**
 *
 * @author Diego T.
 */
public class Ej_18_Matriz_4x4_Trasponer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;

        // Generar matriz aleatoria
        int[][] matriz = generarMatrizAleatoria(filas, columnas);
        System.out.println("Matriz original:");
        mostrarMatriz(matriz, filas, columnas);

        // Obtener matriz traspuesta
        int[][] matrizTraspuesta = obtenerMatrizTraspuesta(matriz, filas, columnas);
        System.out.println("\nMatriz traspuesta:");
        mostrarMatriz(matrizTraspuesta, columnas, filas);
    }

    // Función para generar una matriz aleatoria de tamaño filas x columnas
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        return matriz;
    }

    // Función para obtener la matriz traspuesta de una matriz dada
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz, int filas, int columnas) {
        int[][] matrizTraspuesta = new int[columnas][filas];

        // Recorrer la matriz original
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Intercambiar filas por columnas en la matriz traspuesta
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTraspuesta;
    }

    // Función para mostrar la matriz por pantalla
    public static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("(" + matriz[i][j] + ") ");
            }
            System.out.println();
        }
    }
}