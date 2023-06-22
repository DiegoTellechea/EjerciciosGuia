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
package servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class PersonaServicio {
 public static void crearPersona(Persona persona) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        persona.setNombre(leer.nextLine());

        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());

        System.out.println("Ingrese el sexo (H: hombre, M: mujer, O: otro): ");
        persona.setSexo(leer.next().charAt(0));

        // Validar que el sexo introducido sea correcto
        while (Character.toUpperCase(persona.getSexo()) != 'H' && Character.toUpperCase(persona.getSexo()) != 'M'
        && Character.toUpperCase(persona.getSexo()) != 'O') {
        System.out.println("Sexo incorrecto. Ingrese nuevamente (H: hombre, M: mujer, O: otro): ");
        persona.setSexo(leer.next().charAt(0));
        }

        System.out.println("Ingrese el peso (kg): ");
        persona.setPeso(leer.nextDouble());

        System.out.println("Ingrese la altura (m): ");
        persona.setAltura(leer.nextDouble());
    }
 
 
 

    public static int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }

    public static boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
    
    public static String obtenerEstadoPeso(int imc) {
    switch (imc) {
        case -1:
            return "Por debajo del peso";
        case 0:
            return "En su peso ideal";
        default:
            return "Con sobrepeso";
    }
}
/**
 * public static String obtenerEstadoPeso(int imc) {
    if (imc == -1) {
        return "Por debajo del peso";
    } else if (imc == 0) {
        return "En su peso ideal";
    } else {
        return "Con sobrepeso";
    }
}
*/
public static String obtenerEstadoEdad(boolean esMayorDeEdad) {
    if (esMayorDeEdad) {
        return "Mayor de edad";
    } else {
        return "Menor de edad";
    }
}

public static int contarPersonasEnCategoria(int[] categorias, int categoria) {
    int contador = 0;
    for (int valor : categorias) {
        if (valor == categoria) {
            contador++;
        }
    }
    return contador;
}

public static int contarPersonasEnCategoria(boolean[] categorias, boolean categoria) {
    int contador = 0;
    for (boolean valor : categorias) {
        if (valor == categoria) {
            contador++;
        }
    }
    return contador;
}
public static double calcularPorcentaje(int cantidad, int total) {
    return (cantidad * 100.0) / total;
}
}