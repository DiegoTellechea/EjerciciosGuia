/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
 */
package ej_extra_21_calificaciones;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_21_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int numAlumnos = 10;
        int numNotas = 10;
        double ponderacionTP1 = 0.1;
        double ponderacionTP2 = 0.15;
        double ponderacionIntegrador1 = 0.25;
        double ponderacionIntegrador2 = 0.5;

        double[][] notas = new double[numAlumnos][numNotas]; // Matriz para almacenar las notas de los alumnos

        // Leer las notas de los alumnos
        leerNotas(notas);

        // Calcular los promedios de los alumnos y guardarlos en un arreglo
        double[] promedios = calcularPromedios(notas);

        // Contar la cantidad de aprobados y desaprobados
        int aprobados = contarAprobados(promedios);
        int desaprobados = numAlumnos - aprobados;

        // Mostrar la cantidad de aprobados y desaprobados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    // Función para leer las notas de los alumnos
    public static void leerNotas(double[][] notas) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ":");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Ingrese nota " + (j + 1) + ": ");
                notas[i][j] = leer.nextDouble();
            }
        }

        leer.close();
    }

    // Función para calcular los promedios de los alumnos
    public static double[] calcularPromedios(double[][] notas) {
        double[] promedios = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            double sumatoria = 0;

            for (int j = 0; j < notas[i].length; j++) {
                sumatoria += notas[i][j];
            }

            double promedio = sumatoria / notas[i].length;
            promedios[i] = promedio;
        }

        return promedios;
    }

    // Función para contar la cantidad de aprobados
    public static int contarAprobados(double[] promedios) {
        int contador = 0;

        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 6.0) {
                contador++;
            }
        }

        return contador;
    }
}