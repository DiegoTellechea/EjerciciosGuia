/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.


 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje


 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.


 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.



A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package poo_ej_07_personapeso;

import Entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_07_PersonaPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear 4 objetos de tipo Persona usando el método crearPersona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        // Pedir los datos de cada persona al usuario
        System.out.println("Ingrese los datos de la Persona 1:");
        PersonaServicio.crearPersona(persona1);

        System.out.println("Ingrese los datos de la Persona 2:");
        PersonaServicio.crearPersona(persona2);

        System.out.println("Ingrese los datos de la Persona 3:");
        PersonaServicio.crearPersona(persona3);

        System.out.println("Ingrese los datos de la Persona 4:");
        PersonaServicio.crearPersona(persona4);

        // Calcular el IMC y verificar si es mayor de edad para cada persona
        int persona1IMC = PersonaServicio.calcularIMC(persona1);
        boolean persona1EsMayor = PersonaServicio.esMayorDeEdad(persona1);

        int persona2IMC = PersonaServicio.calcularIMC(persona2);
        boolean persona2EsMayor = PersonaServicio.esMayorDeEdad(persona2);

        int persona3IMC = PersonaServicio.calcularIMC(persona3);
        boolean persona3EsMayor = PersonaServicio.esMayorDeEdad(persona3);

        int persona4IMC = PersonaServicio.calcularIMC(persona4);
        boolean persona4EsMayor = PersonaServicio.esMayorDeEdad(persona4);

        // Mostrar el estado de peso y la mayoría de edad de cada persona
        System.out.println(persona1.getNombre() + " - Estado de peso: " + PersonaServicio.obtenerEstadoPeso(persona1IMC) +
        ", Edad: " + PersonaServicio.obtenerEstadoEdad(persona1EsMayor));

        System.out.println(persona2.getNombre() + " - Estado de peso: " + PersonaServicio.obtenerEstadoPeso(persona2IMC) +
        ", Edad: " + PersonaServicio.obtenerEstadoEdad(persona2EsMayor));

        System.out.println(persona3.getNombre() + " - Estado de peso: " + PersonaServicio.obtenerEstadoPeso(persona3IMC) +
        ", Edad: " + PersonaServicio.obtenerEstadoEdad(persona3EsMayor));

        System.out.println(persona4.getNombre() + " - Estado de peso: " + PersonaServicio.obtenerEstadoPeso(persona4IMC) +
        ", Edad: " + PersonaServicio.obtenerEstadoEdad(persona4EsMayor));

        // Calcular el porcentaje de personas en diferentes categorías
        int[] imcs = {persona1IMC, persona2IMC, persona3IMC, persona4IMC};
        int personasPorDebajoPeso = PersonaServicio.contarPersonasEnCategoria(imcs, -1);
        int personasEnPesoIdeal = PersonaServicio.contarPersonasEnCategoria(imcs, 0);
        int personasConSobrepeso = PersonaServicio.contarPersonasEnCategoria(imcs, 1);

        boolean[] edades = {persona1EsMayor, persona2EsMayor, persona3EsMayor, persona4EsMayor};
        int personasMayores = PersonaServicio.contarPersonasEnCategoria(edades, true);
        int personasMenores = PersonaServicio.contarPersonasEnCategoria(edades, false);

        double porcentajePorDebajoPeso = PersonaServicio.calcularPorcentaje(personasPorDebajoPeso, 4);
        double porcentajeEnPesoIdeal = PersonaServicio.calcularPorcentaje(personasEnPesoIdeal, 4);
        double porcentajeConSobrepeso = PersonaServicio.calcularPorcentaje(personasConSobrepeso, 4);
        double porcentajeMayores = PersonaServicio.calcularPorcentaje(personasMayores, 4);
        double porcentajeMenores = PersonaServicio.calcularPorcentaje(personasMenores, 4);

        // Mostrar los resultados de los porcentajes
        System.out.println("Porcentaje de personas por debajo de su peso: " + porcentajePorDebajoPeso + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajeEnPesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeConSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenores + "%");
    }
}