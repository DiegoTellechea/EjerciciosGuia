/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package poo_ej_09_math;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_09_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Matematica mate = new Matematica();
        MatematicaServicio.construirObjeto(mate);

        System.out.println("Número 1: " + mate.getNumero1());
        System.out.println("Número 2: " + mate.getNumero2());

        System.out.println("El mayor número es: " + MatematicaServicio.devolverMayor(mate));
        System.out.println("La potencia del mayor elevado al menor es: " + MatematicaServicio.calcularPotencia(mate));
        System.out.println("La raíz cuadrada del menor valor es: " + MatematicaServicio.calculaRaiz(mate));
    }
}