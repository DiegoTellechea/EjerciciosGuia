/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_4_nombreedad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4_NombreEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        
        String nombre = leer.nextLine();
                
        System.out.println("Ingrese su edad");
        
        int numEntero = leer.nextInt();
        
        System.out.println("Su nombre es " + nombre );
        System.out.println("Y tiene " + numEntero );
        
        
    }
    
}
