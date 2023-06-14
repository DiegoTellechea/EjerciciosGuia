/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Diego T.
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
       
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString()); 
        
         m1 = null;

    }

}
