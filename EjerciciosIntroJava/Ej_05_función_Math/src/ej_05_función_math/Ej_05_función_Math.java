/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ej_05_función_math;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_05_función_Math {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt(); // Solicitamos al usuario que ingrese un número entero y lo guardamos en la variable "numero"
        
        // Calculamos el doble del número
        int doble = numero * 2;
        
        // Calculamos el triple del número
        int triple = numero * 3;
        
        // Calculamos la raíz cuadrada del número utilizando la función Math.sqrt()
        double raizCuadrada = Math.sqrt(numero);
        
        // Mostramos los resultados por pantalla
        System.out.println("Doble del número: " + doble);
        System.out.println("Triple del número: " + triple);
        System.out.println("Raíz cuadrada del número: " + raizCuadrada);
    }
}