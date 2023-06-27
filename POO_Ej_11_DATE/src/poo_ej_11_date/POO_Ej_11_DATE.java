/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo_ej_11_date;
import entidad.MiFecha;
import java.util.Scanner;
import servicio.FechaServicio;
/**
 *
 * @author Diego T.
 */
public class POO_Ej_11_DATE {

            
    
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();
        
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt() - 1;
        
        System.out.println("Ingrese el año:");
        int anio = scanner.nextInt()-1900;
        
        MiFecha fecha = new MiFecha(dia, mes, anio);
        
        FechaServicio.mostrarFechaYDiferencia(fecha);
    }
}