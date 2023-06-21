/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;

/**
 *
 * @author Diego T.
 */


public class RectanguloServicio {
    public double calcularArea(Rectangulo rectangulo) {
        double base = rectangulo.getBase();
        double altura = rectangulo.getAltura();
        return base * altura;
    }

    public double calcularPerimetro(Rectangulo rectangulo) {
        double base = rectangulo.getBase();
        double altura = rectangulo.getAltura();
        return 2 * (base + altura);
    }
}