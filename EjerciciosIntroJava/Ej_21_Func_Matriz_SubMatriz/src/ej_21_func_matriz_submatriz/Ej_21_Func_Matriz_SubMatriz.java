/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ej_21_func_matriz_submatriz;

    

/**
 *
 * @author Diego T.
 */
public class Ej_21_Func_Matriz_SubMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
       // Definir la matriz M de 10x10
        int[][] matrizM = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        // Definir la matriz P de 3x3 que queremos encontrar en la matriz M
        int[][] matrizP = {
            {35, 36, 37},
            {45, 46, 47},
            {55, 56, 57}
        };

        // Variables para almacenar la información de la submatriz encontrada
        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;

        // Obtener las dimensiones de la matriz M y P
        int filasM = 10;
        int columnasM = 10;
        int filasP = 3;
        int columnasP = 3;

        // Mostrar la matriz M
        System.out.println("Matriz M:");
        mostrarMatriz(matrizM);

        // Mostrar la matriz P
        System.out.println("Matriz P:");
        mostrarMatriz(matrizP);

        // Bucle para recorrer todas las posibles submatrices de 3x3 en la matriz M
        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                // Llamada a la función esSubmatriz para verificar si la submatriz actual coincide con la matriz P
                if (esSubmatriz(matrizM, matrizP, i, j, filasP, columnasP)) {
                    encontrada = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Mostrar los resultados
        if (encontrada) {
            System.out.println("La matriz P está contenida dentro de la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + filaInicio + " y columna " + columnaInicio + ".");
        } else {
            System.out.println("La matriz P no está contenida dentro de la matriz M.");
        }
    }

    // Función para verificar si una submatriz coincide con la matriz P
    public static boolean esSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio, int filasP, int columnasP) {
        // Bucle para comparar los elementos de la submatriz con la matriz P
        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                // Comparar el elemento actual de la submatriz con el elemento correspondiente de la matriz P
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    // Si hay una diferencia, la submatriz no coincide con la matriz P
                    return false;
                }
            }
        }
        // Si todos los elementos coinciden, la submatriz coincide con la matriz P
        return true;
    }

    // Función para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}