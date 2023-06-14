/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ej_06_condicionalesparimpar;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_06_CondicionalesParImpar {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
    System.out.print("Ingrese un número: ");
        int numero = leer.nextInt(); // Solicitamos al usuario que ingrese un número y lo guardamos en la variable "numero"
        
        if(numero % 2 == 0) {
            System.out.println("El número es par."); // Si el número es divisible por 2 sin dejar residuo, entonces es par
        } else {
            System.out.println("El número es impar."); // Si el número no es divisible por 2 sin dejar residuo, entonces es impar
        }
    }
}
