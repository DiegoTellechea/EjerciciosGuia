/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej_grupal_alqpeli;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicio.AlquilerServicio;
import Servicio.PeliculaServicio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



/**
 *
 * @author Diego T.
 */
public class POO_Ej_Grupal_AlqPeli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadPeliculas = 5;
       PeliculaServicio peliculaServicio = new PeliculaServicio(cantidadPeliculas);
       int cantidadAlquileres = 3;
       AlquilerServicio alquilerServicio = new AlquilerServicio(cantidadAlquileres);

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        do {
            System.out.println("--------- MENÚ ---------");
            System.out.println("1. Cargar una película");
            System.out.println("2. Listar todas las películas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Realizar una lista de todos los alquileres");
            System.out.println("5. Buscar películas por título");
            System.out.println("6. Buscar películas por género");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Calcular el ingreso total del servicio");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("--- CARGAR PELÍCULA ---");
                    System.out.print("Ingrese el título de la película: ");
                    String titulo = leer.nextLine();
                    System.out.print("Ingrese el género de la película: ");
                    String genero = leer.nextLine();
                    System.out.print("Ingrese el año de la película: ");
                    int anio = leer.nextInt();
                    System.out.print("Ingrese la duración de la película en minutos: ");
                    int duracion = leer.nextInt();
                    peliculaServicio.crearPelicula(titulo, genero, anio, duracion);
                    System.out.println("La película se ha cargado exitosamente.");
                    break;
                case 2:
                    System.out.println("--- LISTA DE PELÍCULAS ---");
                    peliculaServicio.listarPeliculas();
                    break;
                case 3:
                    System.out.println("--- CREAR ALQUILER ---");
                    System.out.print("Ingrese el título de la película a alquilar: ");
                    String tituloPelicula = leer.nextLine();
                    Pelicula pelicula = peliculaServicio.buscarPeliculaPorTitulo(tituloPelicula);
                    if (pelicula != null) {
                        System.out.print("Ingrese la fecha de inicio del alquiler (dd/MM/yyyy): ");
                    String fechaInicioStr = leer.nextLine();
                    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.print("Ingrese la fecha de fin del alquiler (dd/MM/yyyy): ");
                    String fechaFinStr = leer.nextLine();
                    LocalDate fechaFin = LocalDate.parse(fechaFinStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));                        

                    double precio = alquilerServicio.calcularPrecioAlquiler(fechaInicio, fechaFin);
                    alquilerServicio.crearAlquiler(pelicula, fechaInicio, fechaFin, precio);

                    System.out.println("El alquiler se ha creado exitosamente.");
                    } else {
                        System.out.println("No se encontró la película especificada.");
                    }
                    break;
                case 4:
                    System.out.println("--- LISTA DE ALQUILERES ---");
                    alquilerServicio.listarAlquileres();
                    break;
                case 5:
                    System.out.println("--- BUSCAR PELÍCULA POR TÍTULO ---");
                    System.out.print("Ingrese el título de la película a buscar: ");
                    String tituloBuscar = leer.nextLine();
                    Pelicula peliculaEncontrada = peliculaServicio.buscarPeliculaPorTitulo(tituloBuscar);
                    if (peliculaEncontrada != null) {
                        System.out.println("Película encontrada:");
                        System.out.println("Título: " + peliculaEncontrada.getTitulo());
                        System.out.println("Género: " + peliculaEncontrada.getGenero());
                        System.out.println("Año: " + peliculaEncontrada.getAnio());
                        System.out.println("Duración: " + peliculaEncontrada.getDuracion() + " minutos");
                    } else {
                        System.out.println("No se encontró la película especificada.");
                    }
                    break;
                case 6:
                    System.out.println("--- BUSCAR PELÍCULAS POR GÉNERO ---");
                    System.out.print("Ingrese el género de las películas a buscar: ");
                    String generoBuscar = leer.nextLine();
                    System.out.println("Películas encontradas:");
                    peliculaServicio.buscarPeliculaPorGenero(generoBuscar);
                    break;
                case 7:
                    System.out.println("--- BUSCAR ALQUILERES POR FECHA ---");
                    System.out.print("Ingrese la fecha a buscar (dd/MM/yyyy): ");
                    String fechaStr = leer.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Alquiler alquilerEncontrado = alquilerServicio.buscarAlquilerPorFecha(fecha);

                    if (alquilerEncontrado != null) {
                    System.out.println("Alquiler encontrado:");
                    Pelicula peliculaAlquiler = alquilerEncontrado.getPelicula();
                    System.out.println("Título: " + peliculaAlquiler.getTitulo());
                    System.out.println("Género: " + peliculaAlquiler.getGenero());
                    System.out.println("Año: " + peliculaAlquiler.getAnio());
                    System.out.println("Duración: " + peliculaAlquiler.getDuracion() + " minutos");
                    System.out.println("Fecha de inicio: " + alquilerEncontrado.getFechaInicio());
                    System.out.println("Fecha de fin: " + alquilerEncontrado.getFechaFin());
                    System.out.println("Precio: $" + alquilerEncontrado.getPrecio());
    
                    } else {
                        System.out.println("No se encontró ningún alquiler en la fecha especificada.");
                    }
                    break;
                case 8:
                    System.out.println("--- INGRESO TOTAL DEL SERVICIO ---");
                    double ingresoTotal = alquilerServicio.calcularIngresoTotal();
                    System.out.println("El ingreso total del servicio es de $" + ingresoTotal);
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del menú.");
            }

            System.out.println();
        } while (opcion != 9);

        
    }

    
}
 
