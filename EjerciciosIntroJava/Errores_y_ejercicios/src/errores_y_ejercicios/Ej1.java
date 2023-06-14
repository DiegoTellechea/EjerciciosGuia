/*
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package errores_y_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //definimos seis variables
       Scanner leer = new Scanner(System.in);
       
       double num = leer.nextDouble();
       char cara = leer.next().charAt(0);
       boolean Var3 = leer.hasNextBoolean();
    
       
    }
    
