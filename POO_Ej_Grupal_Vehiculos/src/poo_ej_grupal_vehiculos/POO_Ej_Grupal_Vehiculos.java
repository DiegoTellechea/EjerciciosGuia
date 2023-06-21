/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej_grupal_vehiculos;

import Servicio.Servicio;
import entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_Grupal_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
               // Crear los vehículos
        Vehiculo auto = null;
        Vehiculo moto = null;
        Vehiculo bicicleta = null;

        // Interacción con el usuario
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Elegir auto");
            System.out.println("2. Elegir moto");
            System.out.println("3. Elegir bicicleta");
            System.out.println("4. Comparar metros recorridos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la marca del auto: ");
                    String marcaAuto = leer.next();

                    System.out.println("Ingrese el modelo del auto: ");
                    String modeloAuto = leer.next();

                    System.out.println("Ingrese el año del auto: ");
                    int añoAuto = leer.nextInt();

                    Servicio servicioAuto = new Servicio();
                    auto = servicioAuto.crearAuto(marcaAuto, modeloAuto, añoAuto);
                    System.out.println("Se ha creado un auto.");
                     // Mostrar distancia recorrida por el auto en diferentes intervalos de tiempo
                    System.out.println("Distancia recorrida por el auto en 5 segundos: " + servicioAuto.moverse(auto, 5) + " metros.");
                    System.out.println("Distancia recorrida por el auto en 10 segundos: " + servicioAuto.moverse(auto, 10) + " metros.");
                    System.out.println("Distancia recorrida por el auto en 60 segundos: " + servicioAuto.moverse(auto, 60) + " metros.");
                    break;
                case 2:
                    System.out.println("Ingrese la marca de la moto: ");
                    String marcaMoto = leer.next();

                    System.out.println("Ingrese el modelo de la moto: ");
                    String modeloMoto = leer.next();

                    System.out.println("Ingrese el año de la moto: ");
                    int añoMoto = leer.nextInt();

                    Servicio servicioMoto = new Servicio();
                    moto = servicioMoto.crearMoto(marcaMoto, modeloMoto, añoMoto);
                    System.out.println("Se ha creado una moto.");
                    // Mostrar distancia recorrida por la moto en diferentes intervalos de tiempo
                    System.out.println("Distancia recorrida por la moto en 5 segundos: " + servicioMoto.moverse(moto, 5) + " metros.");
                    System.out.println("Distancia recorrida por la moto en 10 segundos: " + servicioMoto.moverse(moto, 10) + " metros.");
                    System.out.println("Distancia recorrida por la moto en 60 segundos: " + servicioMoto.moverse(moto, 60) + " metros.");
                    break;
                case 3:
                    System.out.println("Ingrese la marca de la bicicleta: ");
                    String marcaBicicleta = leer.next();

                    System.out.println("Ingrese el modelo de la bicicleta: ");
                    String modeloBicicleta = leer.next();

                    System.out.println("Ingrese el año de la bicicleta: ");
                    int añoBicicleta = leer.nextInt();

                    Servicio servicioBicicleta = new Servicio();
                    bicicleta = servicioBicicleta.crearBicicleta(marcaBicicleta, modeloBicicleta, añoBicicleta);
                    System.out.println("Se ha creado una bicicleta.");
                      // Mostrar distancia recorrida por la bicicleta en diferentes intervalos de tiempo
                    System.out.println("Distancia recorrida por la bicicleta en 5 segundos: " + servicioBicicleta.moverse(bicicleta, 5) + " metros.");
                    System.out.println("Distancia recorrida por la bicicleta en 10 segundos: " + servicioBicicleta.moverse(bicicleta, 10) + " metros.");
                    System.out.println("Distancia recorrida por la bicicleta en 60 segundos: " + servicioBicicleta.moverse(bicicleta, 60) + " metros.");
                    break;
                case 4:
                    if (auto != null && moto != null && bicicleta != null) {
                        Servicio servicio = new Servicio();

                        int distanciaAuto = servicio.moverse(auto, 300);
                        int distanciaMoto = servicio.moverse(moto, 300);
                        int distanciaBicicleta = servicio.moverse(bicicleta, 300);

                        // Aplicar frenado
                        distanciaAuto += 2;
                        distanciaMoto += 2;

                        System.out.println("Distancia recorrida por el auto después de frenar en 5 minutos: " + distanciaAuto + " metros.");
                        System.out.println("Distancia recorrida por la moto después de frenar en 5 minutos: " + distanciaMoto + " metros.");
                        System.out.println("La bicicleta no avanza después de frenar.");

                        if (distanciaAuto > distanciaMoto && distanciaAuto > distanciaBicicleta) {
                            System.out.println("El auto fue el vehículo que recorrió más distancia después de frenar en 5 minutos.");
                        } else if (distanciaMoto > distanciaAuto && distanciaMoto > distanciaBicicleta) {
                            System.out.println("La moto fue el vehículo que recorrió más distancia después de frenar en 5 minutos.");
                        } else if (distanciaBicicleta > distanciaAuto && distanciaBicicleta > distanciaMoto) {
                            System.out.println("La bicicleta fue el vehículo que recorrió más distancia después de frenar en 5 minutos.");
                        } else {
                            System.out.println("Varios vehículos empataron en la distancia recorrida después de frenar en 5 minutos.");
                        }
                    } else {
                        System.out.println("No se han creado todos los vehículos.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

            System.out.println();

        } while (opcion != 5);

        
    }
}