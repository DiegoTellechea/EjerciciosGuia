/*
 *
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

 */
package ej_13_14_guia_vector;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
;

public class Ej_13_14_Guia_Vector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  // Crear un objeto Scanner llamado "leer" para la entrada de datos
        
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadCompaneros = leer.nextInt();  // Leer la cantidad de compañeros de equipo
        
        leer.nextLine();  // Limpiar el buffer de entrada
        
        String[] equipo = new String[cantidadCompaneros];  // Crear un arreglo de tipo String llamado "equipo" con la dimensión proporcionada
        
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i + 1) + ": ");
            String nombre = leer.nextLine();  // Leer el nombre del compañero
            equipo[i] = nombre;  // Asignar el nombre del compañero a la posición correspondiente en el arreglo
        }
        
        System.out.println("Nombres de los compañeros de equipo:");
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.println(equipo[i]);  // Imprimir en pantalla los nombres de los compañeros de equipo
        }
    }
}