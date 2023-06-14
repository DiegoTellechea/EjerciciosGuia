/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ej_extra_18_sumavector;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_18_SumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();

        int[] vector = new int[N];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);

        
    }
}