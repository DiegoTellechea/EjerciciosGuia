/*
  Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ej_extra_15b_calc_funciones_if_else;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_15b_Calc_Funciones_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        double num1, num2;
        String operacion;
        double resultado = 0;

        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextDouble();

        // Bucle para solicitar la opción hasta que se seleccione una opción válida
        while (true) {
            System.out.print("Seleccione la operación a realizar (+, -, *, /): ");
            operacion = leer.next();

            if (operacion.equals("+")) {
                resultado = sumar(num1, num2);
                break; // Salir del bucle si se selecciona una opción válida
            } else if (operacion.equals("-")) {
                resultado = restar(num1, num2);
                break; // Salir del bucle si se selecciona una opción válida
            } else if (operacion.equals("*")) {
                resultado = multiplicar(num1, num2);
                break; // Salir del bucle si se selecciona una opción válida
            } else if (operacion.equals("/")) {
                resultado = dividir(num1, num2);
                break; // Salir del bucle si se selecciona una opción válida
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        System.out.println("El resultado de " + operacion + " es: " + resultado);

        
    }

    // Funciones para realizar las operaciones matemáticas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
