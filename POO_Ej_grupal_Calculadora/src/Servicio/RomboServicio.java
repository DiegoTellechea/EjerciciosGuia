/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rombo;

/**
 *
 * @author Diego T.
 */
public class RomboServicio {
    public double calcularArea(Rombo rombo) {
        double diagonalMayor = rombo.getDiagonalMayor();
        double diagonalMenor = rombo.getDiagonalMenor();
        return (diagonalMayor * diagonalMenor) / 2;
    }
}