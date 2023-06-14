/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej_01;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        Persona P1 = new Persona();
        Persona P2 = new Persona("Diego", 1.78, 85.5);
        
        
        System.out.println("Ingrese su nombre");
        P1.setNombre( leer.next());
        System.out.println("Ingrese su altura");
        P1.setAltura(leer.nextDouble());
        System.out.println("Ingrese su peso");
        P1.setPeso(leer.nextDouble());
        
          P1.setNombre("Lucio");
          P2.getNombre();
          
          System.out.println(P1);
          System.out.println(P2);
          //pag18 del pdf
    }
    
  
}
