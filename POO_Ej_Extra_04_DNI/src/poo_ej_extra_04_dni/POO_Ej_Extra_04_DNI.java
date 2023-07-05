/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej_extra_04_dni;

import entidad.Nif;
import servicio.NifServicio;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_Extra_04_DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio nifServicio = new NifServicio();
        Nif nif = new Nif();
        nifServicio.crearNif(nif);
        nifServicio.mostrar(nif);
        
    }
    
}
