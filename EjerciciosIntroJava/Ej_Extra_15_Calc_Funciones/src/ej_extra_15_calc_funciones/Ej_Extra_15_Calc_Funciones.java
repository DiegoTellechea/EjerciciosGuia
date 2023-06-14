/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ej_extra_15_calc_funciones;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_15_Calc_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        //  Leer los dos números ingresados por el usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();

        //  Mostrar el menú de opciones y leer la opción elegida por el usuario
        System.out.println("Elija una operación:\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "Opción: ");
        int opcion = leer.nextInt();

        String operacion = "";  // Variable para almacenar la operación seleccionada
        double resultado = 0.0;  // Variable para almacenar el resultado de la operación

        //  Realizar la operación correspondiente según la opción elegida
        switch (opcion) {
            case 1:
                operacion = "sumar";
                resultado = sumar(num1, num2);
                break;
            case 2:
                operacion = "restar";
                resultado = restar(num1, num2);
                break;
            case 3:
                operacion = "multiplicar";
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                operacion = "dividir";
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // Mostrar el resultado de la operación si se seleccionó una opción válida
        if (operacion.equals("")) {
            System.out.println("No se seleccionó una opción válida");
            } else {
             System.out.println("El resultado de " + operacion + " es: " + resultado);
}

        leer.close();
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







