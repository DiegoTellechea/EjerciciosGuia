/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pentagono;

/**
 *
 * @author Diego T.
 */
public class PentagonoServicio {
    public double calcularArea(Pentagono pentagono) {
        double lado = pentagono.getLado();
        return (1.7204774 * lado * lado) / 4; // el numero 1.72004774 es una aproximacion al resultado de esta formula (4 * Math.tan(Math.PI / 5)
    }

    public double calcularPerimetro(Pentagono pentagono) {
        double lado = pentagono.getLado();
        return 5 * lado;
    }
}
