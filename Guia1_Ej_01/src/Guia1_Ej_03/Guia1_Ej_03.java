package Guia1_Ej_03;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/

import java.util.Scanner;

public class Guia1_Ej_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine(); // Solicitamos al usuario que ingrese una frase y la guardamos en la variable "frase"
        
        // Convertir la frase a mayúsculas utilizando la función toUpperCase()
        String fraseMayusculas = frase.toUpperCase();
        System.out.println("Frase en mayúsculas: " + fraseMayusculas);
        
        // Convertir la frase a minúsculas utilizando la función toLowerCase()
        String fraseMinusculas = frase.toLowerCase();
        System.out.println("Frase en minúsculas: " + fraseMinusculas);
    }
}