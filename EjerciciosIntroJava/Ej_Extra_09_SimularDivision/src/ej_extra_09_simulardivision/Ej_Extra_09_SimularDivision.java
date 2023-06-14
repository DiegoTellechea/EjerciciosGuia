/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package ej_extra_09_simulardivision;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_09_SimularDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        // Lectura de los números enteros mayores que uno
        System.out.println("Ingrese el dividendo (mayor que 1): ");
        int dividendo = leer.nextInt();
        
        System.out.println("Ingrese el divisor (mayor que 1): ");
        int divisor = leer.nextInt();
        
        // Validación de los números ingresados
        if (dividendo <= 1 || divisor <= 1) {
            System.out.println("Error: Los números deben ser mayores que 1.");
            return;
        }
        
        // Variables
        int cociente = 0; // Cociente de la división
        int residuo = dividendo; // Residuo de la división
        
        // Simulación de la división utilizando restas
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        
        // Mostrar los resultados
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
}