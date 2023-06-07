/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ej_17_funciones_recorrer_vector;

/**
 *
 * @author Diego T.
 */
public class Ej_17_Funciones_Recorrer_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] vector = {1,21,21,1234,54325,153,235};
              int[] contadorDigitos = new int[6]; // Array para contar los números de 1 a 5 dígitos

        // Recorrer el vector
        for (int i = 0; i < vector.length; i++) { //recorremos el vector con un for 
            
            int numero = vector[i]; // aca extraemos cada numero del vector para analizar
            
            int digitos = contarDigitos(numero); //creamos la variable digitos donde vamos a guardar la cantidad de digitos que tenga el numero 
                                                 //llamamos a la funcion y le enviamos la variable numero como parametro
                                                 
                                                 
            if (digitos >= 1 && digitos <= 5) {
                contadorDigitos[digitos]++; //si hay mas de un numero de x digitos se incrementaria en 1 la cantidad en la posicion x
                
            }
        }

        // Mostrar los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Números con " + i + " dígitos: " + contadorDigitos[i]);
        }
    }

    /**
     * Función para contar la cantidad de dígitos de un número.
     *
     * @param numero El número del cual se contarán los dígitos.
     * @return La cantidad de dígitos del número.
     */
    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero; // Tomar el valor absoluto del número si es negativo
        }

        if (numero == 0) {
            return 1; // El número 0 tiene un dígito
        }

        int contador = 0;
        while (numero > 0) { //  mientras el numero que queda despues de la division no sea cero se sigue en el bucle, 
                             // diviendo y sumando digitos
            
            numero /= 10;   // se divide el numero por 10 
            contador++;     // se suma uno al contador de digitos
        }

        return contador;
    }
}
       

