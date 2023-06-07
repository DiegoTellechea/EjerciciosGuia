/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ej_extra_13;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        
        // Solicitar la altura de la escalera al usuario
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        
        // Bucle para dibujar cada línea de la escalera
        for (int i = 1; i <= altura; i++) {
            // Bucle para imprimir los números de cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Salto de línea después de cada línea de números
        }
    }
}