/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author Diego T.
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in)
        
        Mascota m1 = new Mascota();
        m1.apodo = "michi";
        m1.nombre = leer.next();
        m1.tipo = "Gato" ;       
        m1.edad = 9;
        m1.raza = "Serrano";
        m1.cola = true;
        m1.color= "Bicolor";
        
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);
        


    }

}
