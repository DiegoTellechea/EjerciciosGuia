/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuadrado;

/**
 *
 * @author Diego T.
 */


public class CuadradoServicio {
    public double calcularArea(Cuadrado cuadrado) {
        double lado = cuadrado.getLado();
        return lado * lado;
    }

    public double calcularPerimetro(Cuadrado cuadrado) {
        double lado = cuadrado.getLado();
        return 4 * lado;
    }
}