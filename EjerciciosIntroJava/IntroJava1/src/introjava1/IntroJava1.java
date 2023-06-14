/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntroJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //creamos una variable cadena (string ) que utilizamos para guardar el nombre del usuario
        String nombre;
        
        //mostramos mensaje por pantalla 
        System.out.println("Ingrese su nombre:");
        
        //leemos el nombre de la persona en la variable nombre
        
        nombre = leer.next();
        
        // mostramos por consola un saludo personalizado
        System.out.println(" Hola mundo! Soy " + nombre + " y estoy programando en java");
      }
    
}
