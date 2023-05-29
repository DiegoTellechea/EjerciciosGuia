package ej_11_guia_vocales;

import java.util.Scanner;

/**
 * Este programa codifica una frase ingresada por el usuario reemplazando las vocales por caracteres específicos.
 * Cada vocal se reemplaza de la siguiente manera: 'a' por '@', 'e' por '#', 'i' por '$', 'o' por '%', 'u' por '*'.
 * El programa utiliza un subprograma llamado 'codificar' para realizar la codificación.
 * 
 * Ejercicio 11 - Guía de Vocales
 * 
 * @author Diego T.
 */
public class Ej_11_Guia_Vocales {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase y finalice con un punto");
        Scanner leer = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        String frase = leer.nextLine(); // Leemos la frase ingresada por el usuario
        
        String codificacion = codificar(frase); // Llamamos al subprograma 'codificar' y guardamos el resultado en una variable
        System.out.println("Codificación: " + codificacion); // Imprimimos la codificación resultante
    }
    
    /**
     * Codifica una frase reemplazando las vocales por caracteres específicos.
     * 
     * @param frase la frase a codificar
     * @return la frase codificada
     */
    public static String codificar(String frase) {
        frase = frase.toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        String resultado = ""; // Variable para almacenar el resultado de la codificación
        
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i); // Obtenemos el caracter en la posición 'i' de la frase
            
            switch (caracter) {
                case 'a':
                    resultado = resultado.concat("@"); // Si es 'a', concatenamos '@' al resultado
                    break;
                case 'e':
                    resultado = resultado.concat("#"); // Si es 'e', concatenamos '#' al resultado
                    break;
                case 'i':
                    resultado = resultado.concat("$"); // Si es 'i', concatenamos '$' al resultado
                    break;
                case 'o':
                    resultado = resultado.concat("%"); // Si es 'o', concatenamos '%' al resultado
                    break;
                case 'u':
                    resultado = resultado.concat("*"); // Si es 'u', concatenamos '*' al resultado
                    break;
                default:
                    resultado = resultado.concat(Character.toString(caracter)); // Si no es una vocal, simplemente concatenamos el caracter original al resultado
                    break;
            }
        }
        
        return resultado; // Devolvemos el resultado de la codificación
    }
}