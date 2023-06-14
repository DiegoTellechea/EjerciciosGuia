/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package poo_ej_02_circunferencia;

import Entidad.Circunferencia;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_02_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear una instancia de Circunferencia
        Circunferencia circunferencia = new Circunferencia(5.0);

        // Obtener y mostrar el radio inicial
        double radioInicial = circunferencia.getRadio();
        System.out.println("Radio inicial: " + radioInicial);

        // Cambiar el radio utilizando el método setRadio
        circunferencia.setRadio(7.5);

        // Obtener y mostrar el nuevo radio
        double nuevoRadio = circunferencia.getRadio();
        System.out.println("Nuevo radio: " + nuevoRadio);

        // Calcular y mostrar el área de la circunferencia
        double area = circunferencia.area();
        System.out.println("Área: " + area);

        // Calcular y mostrar el perímetro de la circunferencia
        double perimetro = circunferencia.perimetro();
        System.out.println("Perímetro: " + perimetro);
    }
}