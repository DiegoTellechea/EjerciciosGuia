/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circulo;

/**
 *
 * @author Diego T.
 */

public class CirculoServicio {
    public double calcularArea(Circulo circulo) {
        double radio = circulo.getRadio();
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(Circulo circulo) {
        double radio = circulo.getRadio();
        return 2 * Math.PI * radio;
    }
}
