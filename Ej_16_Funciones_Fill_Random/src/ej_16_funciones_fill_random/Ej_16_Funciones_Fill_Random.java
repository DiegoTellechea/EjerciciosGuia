/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ej_16_funciones_fill_random;


//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_16_Funciones_Fill_Random {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();

        int[] vector = new int[tamaño];

        // Llenar el vector con valores aleatorios
        fillRandom(vector);

        System.out.println("Ingrese un número a buscar: ");
        int numero = leer.nextInt();

        // Buscar el número en el vector y mostrar los resultados
        buscarNumero(vector, numero);
    }

    /**
     * Llena un vector con valores aleatorios.
     *
     * @param vector El vector a llenar.
     */
    public static void fillRandom(int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(100); // Generar un número aleatorio entre 0 y 99
        }
    }

    /**
     * Busca un número en el vector y muestra los resultados.
     *
     * @param vector El vector en el que se busca el número.
     * @param numero El número a buscar.
     */
    public static void buscarNumero(int[] vector, int numero) {
        boolean encontrado = false;
        boolean repetido = false;
        int posicion = -1;

        // Recorrer el vector para buscar el número
        /**El símbolo de exclamación (!) se utiliza como operador lógico de negación en el condicional if. 
         * En el código, la variable encontrado es una variable booleana que se inicializa en false. 
         * Al utilizar !encontrado dentro de la condición if, se está negando el valor de encontrado, 
         * es decir, se evalúa si la variable es false. En este caso, se utiliza para verificar si se ha encontrado 
         * el número en el vector. Si encontrado es false, significa que aún no se ha encontrado el número,
         * y al utilizar !encontrado, se evalúa la condición como true para ejecutar el bloque de código dentro del if.
         * Si la condición !encontrado es true, se establece la variable encontrado como true y se guarda la posición 
         * del número en la variable posicion. Si encontrado ya era true, significa que el número ya había sido encontrado
         * anteriormente, lo que indica que está repetido en el vector.*/  
              
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                if (!encontrado) {  //el símbolo de exclamación se utiliza para negar el valor de una variable booleana y cambiar su estado de false a true o viceversa.
                    encontrado = true;
                    posicion = i;
                } else {
                    repetido = true;
                }
            }
        }

        // Mostrar los resultados
        if (encontrado) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion);
            if (repetido) {
                System.out.println("El número está repetido en el vector.");
            } else {
                System.out.println("El número no está repetido en el vector.");
            }
        } else {
            System.out.println("El número " + numero + " no se encuentra en el vector.");
        }
    }
}
