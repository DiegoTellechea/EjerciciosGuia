/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author Diego T.
 */

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.time.LocalDate;
import java.util.Date;


public class AlquilerServicio {
    private Alquiler[] alquileres;
    private int cantidadAlquileres;

    public AlquilerServicio(int capacidad) {
        this.alquileres = new Alquiler[capacidad];
        this.cantidadAlquileres = 0;
    }

 

   public void crearAlquiler(Pelicula pelicula, LocalDate fechaInicio, LocalDate fechaFin, Double precio) {
    //double precio = calcularPrecioAlquiler(fechaInicio, fechaFin);
    Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precio);
    alquileres[cantidadAlquileres] = alquiler;
    cantidadAlquileres++;
}

    public void listarAlquileres() {
        System.out.println("Alquileres realizados:");
        for (int i = 0; i < cantidadAlquileres; i++) {
            Alquiler alquiler = alquileres[i];
            System.out.println("Película: " + alquiler.getPelicula().getTitulo());
            System.out.println("Fecha de inicio: " + alquiler.getFechaInicio());
            System.out.println("Fecha de fin: " + alquiler.getFechaFin());
            System.out.println("Precio: $" + alquiler.getPrecio());
            System.out.println("-------------");
        }
    }

    public Alquiler buscarAlquilerPorFecha(LocalDate fecha) {
    for (int i = 0; i < cantidadAlquileres; i++) {
        Alquiler alquiler = alquileres[i];
        if (alquiler.getFechaInicio().equals(fecha) || alquiler.getFechaFin().equals(fecha)) {
            return alquiler;
        }
    }
    return null;
    }

    public double calcularIngresoTotal() {
        double ingresoTotal = 0;
        for (int i = 0; i < cantidadAlquileres; i++) {
            Alquiler alquiler = alquileres[i];
            ingresoTotal += alquiler.getPrecio();
        }
        return ingresoTotal;
    }

    
    public double calcularPrecioAlquiler(LocalDate fechaInicio, LocalDate fechaFin) {
        long diferenciaDias = fechaFin.toEpochDay() - fechaInicio.toEpochDay();

        int diasBase = 3;
        double precioBase = 10;
        double interesPorDia = 0.1;

        if (diferenciaDias <= diasBase) {
            return precioBase; // No se aplica interés por días adicionales
        } else {
            double diasAdicionales = diferenciaDias - diasBase;
            double interesAdicional = diasAdicionales * interesPorDia * precioBase;
            return precioBase + interesAdicional;
        }
    }
}
