/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta.Servicios;

import Cuenta.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class ServicioCuenta {
    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = leer.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        int saldoActual = leer.nextInt();

        Cuenta cuenta = new Cuenta(numeroCuenta, dniCliente, saldoActual);

        return cuenta;
    }

    public void ingresarDinero(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a ingresar: ");
        double ingreso = leer.nextDouble();
        cuenta.ingresar(ingreso);
        System.out.println("Se ha ingresado $" + ingreso + " a la cuenta.");
    }
}