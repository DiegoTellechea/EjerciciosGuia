/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ej_extra_01;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Obtener el tiempo en minutos desde el usuario
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = leer.nextInt();
        
        // Calcular el equivalente en días y horas
        int horas = minutos / 60; // Obtener el número de horas
        int dias = horas / 24; // Obtener el número de días
        horas = horas % 24; // Obtener las horas restantes
        
        // Mostrar el resultado
        System.out.println("Equivalente: " + dias + " día(s), " + horas + " hora(s).");
    }
}