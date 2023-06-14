/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ej_extra_04;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        //  Solicitar al usuario que ingrese un número entre 1 y 10.
        System.out.println("Ingrese un número entre 1 y 10: ");

        //  Leer y almacenar el número ingresado en una variable llamada "numero".
        int numero = leer.nextInt();

        //  Crear una variable llamada "numeroRomano" y establecerla inicialmente como una cadena vacía.
        String numeroRomano = "";

        //  Utilizar una estructura condicional (como un switch-case) para asignar el número romano correspondiente
        // a cada valor del número ingresado.
        switch (numero) {
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default:
                System.out.println("El número ingresado está fuera del rango permitido.");
                return;
        }

        //  Mostrar el valor de "numeroRomano" como el equivalente romano del número ingresado.
        System.out.println("El equivalente romano de " + numero + " es: " + numeroRomano);
    }
}