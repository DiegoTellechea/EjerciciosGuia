/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */

package POO_Ej_10_Arrays;

import entidad.Arreglo;
import servicio.ArregloServicio;
/**
 *
 * @author Diego T.
 */
public class POO_Ej_10_Arrays {
    public static void main(String[] args) {
        Arreglo arregloA = new Arreglo(50); // Crear arreglo A de 50 elementos
        Arreglo arregloB = new Arreglo(20); // Crear arreglo B de 20 elementos

        ArregloServicio.llenarArregloAleatorio(arregloA); // Llenar arreglo A con números aleatorios
        System.out.println("Arreglo A original:");
        ArregloServicio.mostrarArreglo(arregloA); // Mostrar arreglo A original

        ArregloServicio.ordenarArreglo(arregloA); // Ordenar arreglo A de menor a mayor
        System.out.println("\nArreglo A ordenado:");
        ArregloServicio.mostrarArreglo(arregloA); // Mostrar arreglo A ordenado

        ArregloServicio.copiarPrimerosElementos(arregloA, arregloB); // Copiar los primeros 10 elementos de A a B
        ArregloServicio.rellenarUltimosElementos(arregloB, 0.5); // Rellenar los últimos 10 elementos de B con 0.5

        System.out.println("\nArreglo B combinado:");
        ArregloServicio.mostrarArreglo(arregloB); // Mostrar arreglo B combinado
    }
}