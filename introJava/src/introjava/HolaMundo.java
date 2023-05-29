/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //se crea una variable Scanner que se utiliza para leer los datos del usuario
        
        Scanner leer = new Scanner(system.in); 
        
        // se crea una variable cadena (string) que se utilkiza para leer los datos del usuario
        string nombre;
        
          //mostramos el mensaje por pantalla con un sout+tab
          
        System.out.println("Ingresa tu nombre:");
         
        
        //leemos el nombre  de la persona e la variable nombre
        nombre = leer.next();
        
        //mostramos en la consola un saludo personalizado
        
        System.out.println("Hola mundo! soy " + nombre + " y estoy progrmanado en java!");
    }
    
}
