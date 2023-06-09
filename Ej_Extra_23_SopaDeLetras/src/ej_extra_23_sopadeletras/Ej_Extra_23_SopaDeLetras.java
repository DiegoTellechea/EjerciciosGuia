/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ej_extra_23_sopadeletras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_23_SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 20; // Número de filas de la matriz
        int columnas = 20; // Número de columnas de la matriz

        char[][] sopaLetras = new char[filas][columnas];

        // Inicializar la matriz de la sopa de letras con caracteres especiales para indicar posiciones vacías
        inicializarSopaLetras(sopaLetras, filas, columnas);

        // Leer las palabras ingresadas por el usuario y colocarlas en la matriz
        leerPalabras(sopaLetras, filas, columnas);

        // Rellenar los espacios vacíos con números aleatorios
        rellenarEspaciosVacios(sopaLetras, filas, columnas);

        // Mostrar la sopa de letras
        mostrarSopaLetras(sopaLetras, filas, columnas);
    }

    // Función para inicializar la matriz de la sopa de letras con caracteres especiales
    public static void inicializarSopaLetras(char[][] sopaLetras, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sopaLetras[i][j] = '_'; // Usar el carácter especial '_' para indicar posiciones vacías
            }
        }
    }

    // Procedimiento para leer las palabras ingresadas por el usuario y colocarlas en la matriz
    public static void leerPalabras(char[][] sopaLetras, int filas, int columnas) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String palabra;
            do {
                System.out.print("Ingrese una palabra (entre 3 y 5 caracteres): ");
                palabra = leer.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);

            // Colocar la palabra en una fila aleatoria de la matriz
            int fila = generarNumeroAleatorio(0, filas - 1);
            colocarPalabra(sopaLetras, palabra, fila, columnas);
        }

        leer.close();
    }

    // Procedimiento para colocar una palabra en una fila de la matriz
    public static void colocarPalabra(char[][] sopaLetras, String palabra, int fila, int columnas) {
        for (int i = 0; i < palabra.length(); i++) {
            sopaLetras[fila][i] = palabra.charAt(i);
        }
    }

    // Procedimiento para rellenar los espacios vacíos con números aleatorios
    public static void rellenarEspaciosVacios(char[][] sopaLetras, int filas, int columnas) {
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (sopaLetras[i][j] == '_') {
                    // Rellenar el espacio vacío con un número aleatorio del 0 al 9
                    sopaLetras[i][j] = (char) (random.nextInt(10) + '0');
                }
            }
        }
    }

    // Procedimiento para mostrar la sopa de letras
    public static void mostrarSopaLetras(char[][] sopaLetras, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para generar un número aleatorio en un rango dado
    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}






