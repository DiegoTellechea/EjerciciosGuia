/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ej_extra_02;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Declarar y asignar valores iniciales a las variables
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        
        // Mostrar los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        // Realizar el intercambio utilizando una variable auxiliar
        int auxiliar = B; // Guardar el valor de B en la variable auxiliar
        B = C; // Asignar el valor de C a B
        C = A; // Asignar el valor de A a C
        A = D; // Asignar el valor de D a A
        D = auxiliar; // Asignar el valor de la variable auxiliar a D
        
        // Mostrar los valores finales
        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}