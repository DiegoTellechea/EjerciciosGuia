/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Vehiculo;

/**
 *
 * @author Diego T.
 */
public class Servicio {
    public Vehiculo crearAuto(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "Auto");
    }

    public Vehiculo crearMoto(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "Moto");
    }

    public Vehiculo crearBicicleta(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "Bicicleta");
    }

    public int moverse(Vehiculo vehiculo, int segundos) {
        int metrosAvanzados = segundos * 0; // Por defecto, los vehículos no avanzan

        switch (vehiculo.getTipo()) {
            case "Auto":
                metrosAvanzados = segundos * 3; 
                break;
            case "Moto":
                metrosAvanzados = segundos * 2; 
                break;
            case "Bicicleta":
                metrosAvanzados = segundos * 1; 
                break;
        }

        return metrosAvanzados;
    }

    public int frenar(Vehiculo vehiculo) {
        int distanciaFrenado = 2; // Distancia de frenado por defecto

        if (vehiculo.getTipo().equals("Bicicleta")) {
            distanciaFrenado = 0; // La bicicleta no avanza 2 metros extras al frenar
        }

        return distanciaFrenado;
    }
}