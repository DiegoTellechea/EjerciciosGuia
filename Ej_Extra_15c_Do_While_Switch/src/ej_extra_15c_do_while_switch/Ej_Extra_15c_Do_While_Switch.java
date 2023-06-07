/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_15c_do_while_switch;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_15c_Do_While_Switch {

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

        boolean opcionValida = false;

        do {
            System.out.print("Seleccione la operación a realizar (+, -, *, /): ");
            operacion = leer.next();

            switch (operacion) {
                case "+":
                    resultado = sumar(num1, num2);
                    opcionValida = true;
                    break;
                case "-":
                    resultado = restar(num1, num2);
                    opcionValida = true;
                    break;
                case "*":
                    resultado = multiplicar(num1, num2);
                    opcionValida = true;
                    break;
                case "/":
                    resultado = dividir(num1, num2);
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (!opcionValida);

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