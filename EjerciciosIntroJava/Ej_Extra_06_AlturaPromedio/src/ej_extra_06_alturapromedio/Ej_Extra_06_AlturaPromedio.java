/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ej_extra_06_alturapromedio;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_06_AlturaPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        // Variables para almacenar los datos
        int N; // Cantidad de personas
        double altura; // Altura de cada persona
        double sumaEstaturas = 0; // Suma de todas las estaturas
        double sumaEstaturasDebajo160 = 0; // Suma de estaturas por debajo de 1.60 mts
        double promedioEstaturas; // Promedio de estaturas en general
        double promedioEstaturasDebajo160; // Promedio de estaturas por debajo de 1.60 mts

        // Leer la cantidad de personas
        System.out.println("Ingrese la cantidad de personas: ");
        N = leer.nextInt();

        // Calcular sumas
        for (int i = 0; i < N; i++) {
            // Leer la altura de cada persona
            System.out.println("Ingrese la altura de la persona " + (i + 1) + ": ");
            altura = leer.nextDouble();

            // Sumar la altura a la suma total de estaturas
            sumaEstaturas += altura;

            // Verificar si la altura es menor a 1.60 mts y sumarla a la suma de estaturas por debajo de 1.60 mts
            if (altura < 1.60) {
                sumaEstaturasDebajo160 += altura;
            }
        }

        // Calcular promedios
        promedioEstaturas = sumaEstaturas / N;
        promedioEstaturasDebajo160 = sumaEstaturasDebajo160 / N;

        // Mostrar resultados
        System.out.println("El promedio de estaturas en general es: " + promedioEstaturas);
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioEstaturasDebajo160);
    }
}