/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_19_compararvectores;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_19_CompararVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in); // Crear objeto Scanner llamado "leer" para leer la entrada del usuario

        System.out.print("Ingrese el tamaño de los vectores: ");
        int N = leer.nextInt(); // Leer el tamaño de los vectores desde la entrada del usuario

        int[] vector1 = new int[N]; // Crear el primer vector de tamaño N
        int[] vector2 = new int[N]; // Crear el segundo vector de tamaño N

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = leer.nextInt(); // Leer cada elemento del primer vector desde la entrada del usuario
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = leer.nextInt(); // Leer cada elemento del segundo vector desde la entrada del usuario
        }

        boolean sonIguales = true; // Inicializar la variable sonIguales como true

        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false; // Si se encuentra una diferencia entre los elementos, actualizar sonIguales a false
                break; // Salir del bucle, ya que no es necesario seguir comparando los elementos
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales."); // Mostrar mensaje si los vectores son iguales
        } else {
            System.out.println("Los vectores son diferentes."); // Mostrar mensaje si los vectores son diferentes
        }

    

    }
}