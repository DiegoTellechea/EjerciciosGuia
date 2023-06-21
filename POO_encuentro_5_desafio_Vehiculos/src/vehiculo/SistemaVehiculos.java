/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import vehiculos.entidad.Vehiculo;



/**
 *
 * @author Diego T.
 */



public class SistemaVehiculos {

       public Vehiculo crearAuto(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "auto");
    }

    public Vehiculo crearMoto(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "moto");
    }

    public Vehiculo crearBicicleta(String marca, String modelo, int año) {
        return new Vehiculo(marca, modelo, año, "bicicleta");
    }

    public double calcularDistanciaRecorrida(Vehiculo vehiculo, int segundos) {
        double velocidad;
        switch (vehiculo.getTipo()) {
            case "auto":
                velocidad = 3.0; // metros por segundo
                break;
            case "moto":
                velocidad = 2.0; // metros por segundo
                break;
            case "bicicleta":
                velocidad = 1.0; // metros por segundo
                break;
            default:
                velocidad = 0.0;
                break;
        }
        return velocidad * segundos;
    }

    public Vehiculo calcularVehiculoMasLejos(Vehiculo auto, Vehiculo moto, Vehiculo bicicleta, int segundos) {
        double distanciaAuto = calcularDistanciaRecorrida(auto, segundos);
        double distanciaMoto = calcularDistanciaRecorrida(moto, segundos);
        double distanciaBicicleta = calcularDistanciaRecorrida(bicicleta, segundos);

        if (distanciaAuto > distanciaMoto && distanciaAuto > distanciaBicicleta) {
            return auto;
        } else if (distanciaMoto > distanciaAuto && distanciaMoto > distanciaBicicleta) {
            return moto;
        } else {
            return bicicleta;
        }
    }

    public double calcularDistanciaDespuesDeFrenar(Vehiculo vehiculo) {
        double distanciaRecorrida = calcularDistanciaRecorrida(vehiculo, 300); // 5 minutos
        if (vehiculo.getTipo().equals("bicicleta")) {
            return distanciaRecorrida;
        } else {
            return distanciaRecorrida + 2.0; // Se agrega 2 metros adicionales para autos y motos
        }
    }
}