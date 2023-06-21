/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_encuentro_5_desafio_vehiculos;

import java.util.Scanner;
import vehiculo.SistemaVehiculos;
import vehiculos.entidad.Vehiculo;



/**
 *
 * @author Diego T.
 */
public class POO_encuentro_5_desafio_Vehiculos {

    /**
     * @param args the command line arguments
     */
   
 
     public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        SistemaVehiculos sistema = new SistemaVehiculos();

        System.out.println("Bienvenido al programa de creación de vehículos");
        System.out.println("==============================================");
        
        // Crear los tres vehículos
        Vehiculo auto = crearAuto(scanner, sistema);
        Vehiculo moto = crearMoto(scanner, sistema);
        Vehiculo bicicleta = crearBicicleta(scanner, sistema);
        
        // Mostrar información de los vehículos creados
        System.out.println("\nInformación de los vehículos creados:");
        System.out.println("====================================");
        mostrarInformacionVehiculo(auto);
        mostrarInformacionVehiculo(moto);
        mostrarInformacionVehiculo(bicicleta);
        
        // Calcular distancias recorridas por cada vehículo
        System.out.println("\nDistancias recorridas en 5 segundos:");
        System.out.println("===================================");
        mostrarDistanciaRecorrida(auto, 5, sistema);
        mostrarDistanciaRecorrida(moto, 5, sistema);
        mostrarDistanciaRecorrida(bicicleta, 5, sistema);
        
        System.out.println("\nDistancias recorridas en 10 segundos:");
        System.out.println("====================================");
        mostrarDistanciaRecorrida(auto, 10, sistema);
        mostrarDistanciaRecorrida(moto, 10, sistema);
        mostrarDistanciaRecorrida(bicicleta, 10, sistema);
        
        System.out.println("\nDistancias recorridas en 60 segundos:");
        System.out.println("====================================");
        mostrarDistanciaRecorrida(auto, 60, sistema);
        mostrarDistanciaRecorrida(moto, 60, sistema);
        mostrarDistanciaRecorrida(bicicleta, 60, sistema);
        
        // Comparar vehículos después de 5 minutos y frenar
        System.out.println("\nComparación de vehículos después de 5 minutos y frenar:");
        System.out.println("=====================================================");
        mostrarDistanciaDespuesDeFrenar(auto, 5, sistema);
        mostrarDistanciaDespuesDeFrenar(moto, 5, sistema);
        mostrarDistanciaDespuesDeFrenar(bicicleta, 5, sistema);
    }
    
    private static Vehiculo crearAuto(Scanner scanner, SistemaVehiculos sistema) {
        System.out.println("\nCreación de Auto");
        System.out.println("================");
        System.out.println("Ingrese la marca del auto:");
        String marcaAuto = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto:");
        String modeloAuto = scanner.nextLine();
        System.out.println("Ingrese el año del auto:");
        int añoAuto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        return sistema.crearAuto(marcaAuto, modeloAuto, añoAuto);
    }
    
    private static Vehiculo crearMoto(Scanner scanner, SistemaVehiculos sistema) {
        System.out.println("\nCreación de Moto");
        System.out.println("================");
        System.out.println("Ingrese la marca de la moto:");
        String marcaMoto = scanner.nextLine();
        System.out.println("Ingrese el modelo de la moto:");
        String modeloMoto = scanner.nextLine();
        System.out.println("Ingrese el año de la moto:");
        int añoMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        return sistema.crearMoto(marcaMoto, modeloMoto, añoMoto);
    }
    
    private static Vehiculo crearBicicleta(Scanner scanner, SistemaVehiculos sistema) {
        System.out.println("\nCreación de Bicicleta");
        System.out.println("=====================");
        System.out.println("Ingrese la marca de la bicicleta:");
        String marcaBicicleta = scanner.nextLine();
        System.out.println("Ingrese el modelo de la bicicleta:");
        String modeloBicicleta = scanner.nextLine();
        System.out.println("Ingrese el año de la bicicleta:");
        int añoBicicleta = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        return sistema.crearBicicleta(marcaBicicleta, modeloBicicleta, añoBicicleta);
    }
    
    private static void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Año: " + vehiculo.getAño());
        System.out.println("Tipo: " + vehiculo.getTipo());
    }
    
    private static void mostrarDistanciaRecorrida(Vehiculo vehiculo, int segundos, SistemaVehiculos sistema) {
        double distancia = sistema.calcularDistanciaRecorrida(vehiculo, segundos);
        System.out.println(vehiculo.getTipo() + ": " + distancia + " metros");
    }
    
    private static void mostrarDistanciaDespuesDeFrenar(Vehiculo vehiculo, int minutos, SistemaVehiculos sistema) {
        double distancia = sistema.calcularDistanciaRecorridaDespuesDeFrenar(vehiculo, minutos);
        System.out.println(vehiculo.getTipo() + ": " + distancia + " metros");
    }
}