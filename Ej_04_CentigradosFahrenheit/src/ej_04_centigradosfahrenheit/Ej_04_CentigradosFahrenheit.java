/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_04_centigradosfahrenheit;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_04_CentigradosFahrenheit {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de grados centígrados: ");
        double gradosCentigrados = leer.nextDouble(); // Solicitamos al usuario que ingrese los grados centígrados y los guardamos en la variable "gradosCentigrados"
        
        // Calculamos la conversión de grados centígrados a grados Fahrenheit utilizando la fórmula F = 32 + (9 * C / 5)
        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println("Equivalente en grados Fahrenheit: " + gradosFahrenheit);
    }
}