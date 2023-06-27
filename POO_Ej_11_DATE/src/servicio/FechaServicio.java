/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.MiFecha;
import java.util.Date;

/**
 *
 * @author Diego T.
 */
public class FechaServicio {
 public static void mostrarFechaYDiferencia(MiFecha fecha) {
        Date fechaActual = new Date();
        int anios = fechaActual.getYear() - fecha.getAnio();
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Años entre la fecha ingresada y la fecha actual: " + anios);
    }
}