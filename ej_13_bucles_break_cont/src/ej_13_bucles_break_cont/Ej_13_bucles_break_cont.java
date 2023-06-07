/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ej_13_bucles_break_cont;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_13_bucles_break_cont {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

             // Solicitar al usuario el tamaño del cuadrado
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int tamaño = leer.nextInt();

        // Dibujar el cuadrado
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                // Verificar si estamos en el borde o en el interior del cuadrado
                if (i == 1 || i == tamaño || j == 1 || j == tamaño) {
                    // Estamos en el borde, imprimir el carácter "*"
                    System.out.print("* ");
                } else {
                    // Estamos en el interior, imprimir espacio en blanco
                    System.out.print("  ");
                }
            }
            // Pasar a la siguiente línea para la siguiente fila
            System.out.println();
        }
    }
}