/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ej_extra_16_nombre_edad_personas;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_16_Nombre_edad_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        String respuesta;
        
        do {
            System.out.print("Ingrese el nombre de la persona: "); // Solicitar el nombre de la persona al usuario
            String nombre = leer.nextLine(); // Leer el nombre ingresado
            
            System.out.print("Ingrese la edad de la persona: "); // Solicitar la edad de la persona al usuario
            int edad = leer.nextInt(); // Leer la edad ingresada
            
            leer.nextLine(); // Consumir el salto de línea pendiente
            
            System.out.println("Nombre: " + nombre); // Mostrar el nombre de la persona
            System.out.println("Edad: " + edad); // Mostrar la edad de la persona
            
            if (esMayorEdad(edad)) { // Verificar si la persona es mayor de edad
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            
            System.out.print("¿Desea seguir mostrando personas? (Ingrese 'No' para detener): "); // Preguntar al usuario si desea seguir mostrando personas
            respuesta = leer.nextLine(); // Leer la respuesta ingresada
        } while (!respuesta.equalsIgnoreCase("No")); // Repetir el bucle mientras la respuesta no sea "No" (ignorando mayúsculas o minúsculas)

      
    }

    public static boolean esMayorEdad(int edad) {
        return edad >= 18; // Verificar si la edad es mayor o igual a 18 y devolver true si es así, o false en caso contrario
    }
}