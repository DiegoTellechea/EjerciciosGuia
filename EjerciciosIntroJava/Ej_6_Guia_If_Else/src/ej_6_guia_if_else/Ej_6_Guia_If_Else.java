/*
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 *alguno de ellos es mayor a 25.
 */
package ej_6_guia_if_else;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6_Guia_If_Else {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num3 = 25; // Establecemos el valor límite de 25
        
        System.out.println("Ingrese número 1: ");
        int num1 = leer.nextInt(); // Solicitamos al usuario que ingrese el primer número y lo guardamos en la variable "num1"
        
        System.out.println("Ingrese número 2: ");
        int num2 = leer.nextInt(); // Solicitamos al usuario que ingrese el segundo número y lo guardamos en la variable "num2"
        
        // Comparamos los números ingresados con el valor límite de 25
        if (num1 > num3 && num2 > num3) {
            System.out.println("Ambos números son mayores a 25."); // Si ambos números son mayores a 25, se imprime este mensaje
        } else if (num1 > num3 || num2 > num3) {
            System.out.println("Al menos uno de los números es mayor a 25."); // Si al menos uno de los números es mayor a 25, se imprime este mensaje
        } else {
            System.out.println("Ninguno de los números es mayor a 25."); // Si ninguno de los números es mayor a 25, se imprime este mensaje
        }
    }
}