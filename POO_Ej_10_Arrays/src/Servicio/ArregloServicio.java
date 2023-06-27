
/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */


package servicio;

import entidad.Arreglo;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Diego T.
 */

public class ArregloServicio {
  public static void llenarArregloAleatorio(Arreglo arreglo) {
    double[] elementos = arreglo.getElementos();
    Random random = new Random();

    for (int i = 0; i < elementos.length; i++) {
        int numeroAleatorio = random.nextInt(91) + 10;
        elementos[i] = numeroAleatorio;
    }
}

    public static void ordenarArreglo(Arreglo arreglo) {
        Arrays.sort(arreglo.getElementos()); // Ordenar arreglo de menor a mayor
    }

    public static void copiarPrimerosElementos(Arreglo origen, Arreglo destino) {
        double[] elementosOrigen = origen.getElementos();
        double[] elementosDestino = destino.getElementos();

      System.arraycopy(elementosOrigen, 0, elementosDestino, 0, 10); // Copiar los primeros 10 elementos
    }

    public static void rellenarUltimosElementos(Arreglo arreglo, double valor) {
        double[] elementos = arreglo.getElementos();

        for (int i = 10; i < elementos.length; i++) {
            elementos[i] = valor; // Rellenar los últimos 10 elementos con el valor especificado
        }
    }

    public static void mostrarArreglo(Arreglo arreglo) {
        double[] elementos = arreglo.getElementos();

        for (double elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}