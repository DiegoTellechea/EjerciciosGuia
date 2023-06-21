/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Triangulo;

/**
 *
 * @author Diego T.
 */
public class TrianguloServicio {
    public double calcularArea(Triangulo triangulo) {
        double base = triangulo.getBase();
        double altura = triangulo.getAltura();
        return (base * altura) / 2;
    }

    public double calcularPerimetro(Triangulo triangulo) {
        double lado1 = triangulo.getLado1();
        double lado2 = triangulo.getLado2();
        double lado3 = triangulo.getLado3();
        return lado1 + lado2 + lado3;
    }
}
