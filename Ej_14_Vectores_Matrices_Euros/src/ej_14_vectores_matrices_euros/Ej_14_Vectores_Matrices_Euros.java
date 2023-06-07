/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ej_14_vectores_matrices_euros;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_14_Vectores_Matrices_Euros {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Ingrese la moneda a la que desea convertir (libras, dolares, yenes): ");
        String moneda = scanner.next();

        convertirMoneda(euros, moneda);
    }

    /**
     * Función para convertir una cantidad de euros a otra moneda.
     *
     * @param euros   Cantidad de euros a convertir.
     * @param moneda  Moneda a la que se desea convertir (libras, dolares, yenes).
     */
    public static void convertirMoneda(double euros, String moneda) {
        double resultado = 0.0;

        switch (moneda) {
            case "libras":
                resultado = euros * 0.86;
                System.out.println(euros + " euros equivalen a " + resultado + " libras.");
                break;
            case "dolares":
                resultado = euros * 1.28611;
                System.out.println(euros + " euros equivalen a " + resultado + " dólares.");
                break;
            case "yenes":
                resultado = euros * 129.852;
                System.out.println(euros + " euros equivalen a " + resultado + " yenes.");
                break;
            default:
                System.out.println("Moneda no válida. Intente nuevamente.");
        }
    }
}
