/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



/**
 *
 * @author Diego T.
 */
public class PersonaService {
  public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy):");
        String fechaNacimientoStr = leer.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(persona.getFechaNacimiento(), fechaActual);
        return periodo.getYears();
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadActual = calcularEdad(persona);
        return edadActual < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
    }
}