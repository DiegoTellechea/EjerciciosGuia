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
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Diego T.
 */
public class MatematicaServicio {
   public static void construirObjeto(Matematica mate) {
        double numero1 = (int) (Math.random()*10);
        double numero2 = (int) (Math.random()*10);
        mate.setNumero1(numero1);
        mate.setNumero2(numero2);
    }

    public static double devolverMayor(Matematica mate) {
        double numero1 = mate.getNumero1();
        double numero2 = mate.getNumero2();

        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static double calcularPotencia(Matematica mate) {
        double numero1 = mate.getNumero1();
        double numero2 = mate.getNumero2();
        double mayor = devolverMayor(mate);

        return Math.pow(mayor, Math.round(numero2));
    }

    public static double calculaRaiz(Matematica mate) {
        double numero1 = mate.getNumero1();
        double numero2 = mate.getNumero2();
        double menor = Math.min(numero1, numero2);
        double absoluto = Math.abs(menor);

        return Math.sqrt(absoluto);
    }
}