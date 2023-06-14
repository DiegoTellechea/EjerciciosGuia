/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ej_11_bucles_break_cont;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_11_Bucles_Break_Cont {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       

        int num1, num2;

        // Pedir los números hasta que sean enteros y positivos
        do {
            System.out.println("Ingrese dos números enteros y positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Ambos números deben ser enteros y positivos.");
            }
        } while (num1 <= 0 || num2 <= 0);

        // Bucle principal que se ejecutará hasta que se elija la opción 5
        while (true) {
            System.out.print("MENU\n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir\n" +
                    "Elija opción: ");

            int opcion = leer.nextInt(); // Leemos la opción elegida por el usuario

            // Realizamos la operación correspondiente según la opción elegida
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los números es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los números es: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicación de los números es: " + multiplicacion);
                    break;
                case 4:
                    double division = (double) num1 / num2; // Realizamos la división como double para obtener el resultado decimal
                    System.out.println("La división de los números es: " + division);
                    
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char confirmacion = leer.next().charAt(0); // Leemos el carácter de confirmación

                    // Verificamos si el carácter de confirmación es 'S' para salir del programa
                    if (Character.toUpperCase(confirmacion) == 'S') {
                        System.out.println("Saliendo del programa...");
                        return; // Salimos del programa
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }
}