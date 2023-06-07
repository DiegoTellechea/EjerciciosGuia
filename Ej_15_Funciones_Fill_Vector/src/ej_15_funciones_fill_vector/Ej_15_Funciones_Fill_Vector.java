/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ej_15_funciones_fill_vector;

/**
 *
 * @author Diego T.
 */
public class Ej_15_Funciones_Fill_Vector {

   public static void main(String[] args) {
    int[] vector = new int[100]; // Creamos un vector de tamaño 100

        // Rellenar el vector con los 100 primeros números enteros
        rellenarVector(vector);

        // Mostrar los elementos del vector en orden descendente
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

    /**
     * Rellena un vector con los primeros 100 números enteros.
     *
     * @param vector El vector a rellenar.
     */
    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
    }
}