/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ej_extra_14_flia_hijos_edades;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_14_Flia_hijos_Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = leer.nextInt(); // Leer la cantidad de familias ingresada por el usuario
        
        int totalHijos = 0; // Variable para almacenar el total de hijos de todas las familias
        int totalEdad = 0; // Variable para almacenar la suma de las edades de los hijos de todas las familias
        
        // Bucle para iterar sobre cada familia
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt(); // Leer la cantidad de hijos de la familia actual
            
            // Bucle para iterar sobre cada hijo de la familia actual
            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt(); // Leer la edad del hijo actual
                
                totalHijos++; // Incrementar el contador de hijos
                totalEdad += edadHijo; // Sumar la edad del hijo a la suma total de edades
            }
        }
        
        // Verificar si se ingresaron datos de hijos
        if (totalHijos > 0) {
            double mediaEdad = (double) totalEdad / totalHijos; // Calcular la media de edad dividiendo la suma de edades entre el total de hijos
            System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
        } else {
            System.out.println("No se ingresaron datos de hijos. No es posible calcular la media de edad.");
        }
        
        leer.close(); // Cerrar el objeto Scanner
    }
}