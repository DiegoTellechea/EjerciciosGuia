/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ej_extra_20_vectoraleatorio;

import java.util.Random;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_20_VectorAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] vector = new int[10]; // Crear un vector de tamaño 10

        // Llamar a la función para rellenar el vector con números aleatorios
        rellenarVector(vector);

        // Llamar a la función para imprimir el vector
        imprimirVector(vector);
    }

    // Función para rellenar un vector con números aleatorios
    public static void rellenarVector(int[] vector) {
        Random rand = new Random(); // Crear un objeto Random para generar números aleatorios

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); // Generar un número aleatorio entre 0 y 99 y asignarlo al elemento del vector
        }
    }

    // Función para imprimir un vector
    public static void imprimirVector(int[] vector) {
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " "); // Imprimir cada elemento del vector separado por espacio
        }
        System.out.println(); // Imprimir nueva línea
    }
}
