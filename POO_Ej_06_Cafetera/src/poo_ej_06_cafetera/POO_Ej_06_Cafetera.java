/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo_ej_06_cafetera;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraService;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_06_Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cafetera miCafetera = new Cafetera(1000, 500);
        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual());

        CafeteraService cafeteraService = new CafeteraService();

        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- Opciones -----");
            System.out.println("1. Vaciar la cafetera");
            System.out.println("2. Agregar café");
            System.out.println("3. Servir una taza");
            System.out.println("4. Ver cantidad de café actual");
            System.out.println("0. Salir");
            System.out.println("Ingrese su opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafeteraService.vaciarCafetera(miCafetera);
                    System.out.println("La cafetera ha sido vaciada. Cantidad actual de café: " + miCafetera.getCantidadActual());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de café a agregar: ");
                    int cantidadAgregar = leer.nextInt();
                    cafeteraService.agregarCafe(miCafetera, cantidadAgregar);
                    System.out.println("Se ha agregado café. Cantidad actual de café: " + miCafetera.getCantidadActual());
                    break;
                case 3:
                    System.out.print("Ingrese el tamaño de la taza: ");
                    int tamanoTaza = leer.nextInt();
                    cafeteraService.servirTaza(miCafetera, tamanoTaza);
                    System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual());
                    break;
                case 4:
                    System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual());
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);
    }
}