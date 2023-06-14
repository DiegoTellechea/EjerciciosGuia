/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ej_20_funciones_matrices_cuadrado_magico;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_20_Funciones_Matrices_Cuadrado_Magico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] cuadrado = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Introducir los números del cuadrado por teclado
        System.out.println("Introduce los números del cuadrado (1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = scanner.nextInt();

                // Comprobar si el número introducido es válido (entre 1 y 9)
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Número inválido. Debe estar entre 1 y 9.");
                    return; // Terminar el programa si hay un número inválido
                }
            }
        }

        // Comprobar si el cuadrado es mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    // Función para comprobar si un cuadrado es mágico
    public static boolean esCuadradoMagico(int[][] cuadrado) {
        // Calcular la suma objetivo
        int sumaObjetivo = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        // Comprobar filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2];
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            int sumaColumna = cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j];
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        // Comprobar diagonales
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
            return false;
        }

        return true; // Si todas las comprobaciones pasan, el cuadrado es mágico
    }
}