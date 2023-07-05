/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package poo_ej_12_personadate;

import entidad.Persona;
import servicio.PersonaService;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_12_PersonaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PersonaService personaService = new PersonaService();

        // Crear una persona
        System.out.println("Creación de persona:");
        Persona persona = personaService.crearPersona();

        // Mostrar los datos de la persona
        System.out.println("\nDatos de la persona:");
        personaService.mostrarPersona(persona);

        // Calcular la edad de la persona
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad: " + edad + " años");

        // Comparar la edad de la persona con otra edad específica
        int otraEdad = 30;
        boolean esMenor = personaService.menorQue(persona, otraEdad);
        System.out.println("¿Es menor que " + otraEdad + " años?: " + esMenor);
    }
}