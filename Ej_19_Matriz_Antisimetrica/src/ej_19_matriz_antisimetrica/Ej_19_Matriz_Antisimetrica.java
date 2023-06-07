/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_19_matriz_antisimetrica;

/**
 *
 * @author Diego T.
 */
public class Ej_19_Matriz_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int[][] matriz = {
            {0, 1, -2},
            {-1, 0, 3},
            {2, -3, 0}
        };
        
        boolean esAntisimetrica = esAntisimetrica(matriz);
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    /**
     * Función para comprobar si una matriz es antisimétrica.
     * @param matriz La matriz a comprobar.
     * @return true si la matriz es antisimétrica, false en caso contrario.
     */
    public static boolean esAntisimetrica(int[][] matriz) {
        int filas = 3;
        int columnas = 3;
        
        // Verificar si la matriz es antisimétrica
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Verificar si el elemento de la matriz no es igual a su negativo en la matriz traspuesta
                if (!(matriz[i][j] == -matriz[j][i])) {
                    return false; // Hay al menos un elemento que no cumple la condición, la matriz no es antisimétrica.
                }
            }
        }
        
        // Si se llega hasta aquí, la matriz cumple la condición de antisimetría.
        return true;
    }
}