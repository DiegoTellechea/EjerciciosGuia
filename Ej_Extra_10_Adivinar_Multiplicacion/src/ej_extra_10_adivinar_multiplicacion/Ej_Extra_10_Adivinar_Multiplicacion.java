/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ej_extra_10_adivinar_multiplicacion;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_10_Adivinar_Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Generar dos números aleatorios entre 0 y 10
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);
        
        // Calcular el resultado de la multiplicación
        int resultado = numero1 * numero2;
        
        // Mostrar la operación al usuario
        System.out.println("Adivina el resultado de la multiplicación:");
        System.out.println(numero1 + " * " + numero2 + " = ?");
        
        // Leer la respuesta del usuario
        int respuesta = leer.nextInt();
        
        // Verificar si la respuesta es correcta
        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta. Inténtalo nuevamente.");
            respuesta = leer.nextInt();
        }
        
        // La respuesta es correcta
        System.out.println("¡Respuesta correcta! Felicitaciones.");
    }
}