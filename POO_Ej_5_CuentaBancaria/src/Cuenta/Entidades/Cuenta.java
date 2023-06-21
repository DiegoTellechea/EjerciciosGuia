/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Cuenta.Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;

    public Cuenta() {
        // Constructor por defecto
    }

    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Getters y setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }


    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    public void extraccionRapida() {
        double limiteExtraccion = saldoActual * 0.2;
        Scanner leer = new Scanner(System.in);

        System.out.println("Desea realizar una extracción rápida? (S/N):");
        String opcion = leer.nextLine();

        if (opcion.equalsIgnoreCase("S")) {
            if (limiteExtraccion <= saldoActual) {
                saldoActual -= limiteExtraccion;
                System.out.println("Se ha realizado una extracción rápida de $" + limiteExtraccion);
            } else {
                System.out.println("No se puede realizar la extracción rápida. Saldo insuficiente.");
            }
        } else {
            System.out.print("Ingrese la cantidad de dinero a retirar: ");
            double retiroManual = leer.nextDouble();
            retirar(retiroManual);
            System.out.println("Se ha retirado $" + retiroManual + " de la cuenta.");
        }
    }

    public int consultarSaldo() {
        return saldoActual;
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
    }
}