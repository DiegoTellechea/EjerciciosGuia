/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Hexagono;

/**
 *
 * @author Diego T.
 */

public class HexagonoServicio {
    public double calcularArea(Hexagono hexagono) {
        double lado = hexagono.getLado();
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    public double calcularPerimetro(Hexagono hexagono) {
        double lado = hexagono.getLado();
        return 6 * lado;
    }
}
