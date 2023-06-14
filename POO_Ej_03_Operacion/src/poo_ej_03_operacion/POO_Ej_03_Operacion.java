/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package poo_ej_03_operacion;

import Entidad.Operacion;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_03_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Crear una instancia de Operacion utilizando el constructor sin parámetros
        Operacion operacion = new Operacion();

        // Llamar al método crearOperacion para ingresar los números desde el usuario
        operacion.crearOperacion();

        // Obtener los números ingresados
        int numero1 = operacion.getNumero1();
        int numero2 = operacion.getNumero2();
        
        //Creamos las variabes y les asignamos los metodos
        int suma = operacion.sumar();
        int resta = operacion.restar();
        int multiplicacion = operacion.multiplicar();
        double division = operacion.dividir();
        
        
        //mostramos los resultados por pantalla
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);
    }
}
