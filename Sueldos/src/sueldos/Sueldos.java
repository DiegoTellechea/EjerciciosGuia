/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

/**
 *
 * @author Diego T.
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.vacaciones (v1);
    }
    
}
