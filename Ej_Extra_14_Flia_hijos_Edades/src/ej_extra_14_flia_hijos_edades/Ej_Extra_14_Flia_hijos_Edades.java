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
        
       Scanner leer = new Scanner(System.in);

       System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = leer.nextInt();
        
        int totalHijos = 0;
        int totalEdad = 0;
        
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();
            
            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt();
                
                totalHijos++;
                totalEdad += edadHijo;
            }
        }
        
        if (totalHijos > 0) {
            double mediaEdad = (double) totalEdad / totalHijos;
            System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
        } else {
            System.out.println("No se ingresaron datos de hijos. No es posible calcular la media de edad.");
        }
        
        leer.close();
    }
}
