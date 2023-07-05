/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;

/**
 *
 * @author Diego T.
 */
public class PeliculaServicio {
    private Pelicula[] peliculas;
   private int cantidadPeliculas;

    public PeliculaServicio(int capacidad) {
        this.peliculas = new Pelicula[capacidad];
        this.cantidadPeliculas = 0;
    }

    

    public void crearPelicula(String titulo, String genero, int anio, int duracion) {
        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
        peliculas[cantidadPeliculas] = pelicula;
        cantidadPeliculas++;
    }

    public void listarPeliculas() {
        System.out.println("Películas disponibles:");
        for (int i = 0; i < cantidadPeliculas; i++) {
            Pelicula pelicula = peliculas[i];
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Año: " + pelicula.getAnio());
            System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
            System.out.println("-------------");
        }
    }

    public Pelicula buscarPeliculaPorTitulo(String titulo) {
        for (int i = 0; i < cantidadPeliculas; i++) {
            Pelicula pelicula = peliculas[i];
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

    public void buscarPeliculaPorGenero(String genero) {
        boolean peliculaEncontrada = false;
        for (int i = 0; i < cantidadPeliculas; i++) {
            Pelicula pelicula = peliculas[i];
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Género: " + pelicula.getGenero());
                System.out.println("Año: " + pelicula.getAnio());
                System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
                System.out.println("-------------");
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se encontraron películas con el género especificado.");
        }
    }
}