package Guia1_Ej_02;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

import java.util.Scanner;

public class Guia1_Ej_02 {
    
    public static void main(String[] args) {
    //creamos el objeto scanner para leer el nombre del usuario    
   Scanner leer = new Scanner(System.in);
   
   System.out.println("Ingrese su nombre");
        String cadena = leer.nextLine(); // Leer una cadena
     System.out.println("Nombre: " + cadena);
    }
}
