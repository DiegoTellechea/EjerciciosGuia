package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApplication1 {
    public static void main(String[] args) {
        int num_1 = ingresoNum();
        int num_2 = ingresoNum();

        sumar(num_1, num_2);
    }

    public static int ingresoNum() {
        int num = 0;

        try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un número entero: ");
        num = Integer.valueOf(entrada.readLine());
        } catch (IOException | NumberFormatException exc) {
            System.out.println(exc);
        }

        return num;
    }

    public static void sumar(int num_1, int num_2) {
        int suma = num_1 + num_2;
        System.out.println(num_1 + " + " + num_2 + " = " + suma);
    }
}