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
package servicio;

import entidad.Cafetera;

/**
 *
 * @author Diego T.
 */
public class CafeteraService {
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidad) {
        int capacidadMaxima = cafetera.getCapacidadMaxima();
        int cantidadActual = cafetera.getCantidadActual();
        int nuevaCantidad = cantidadActual + cantidad;

        if (nuevaCantidad <= capacidadMaxima) {
            cafetera.setCantidadActual(nuevaCantidad);
        } else {
            cafetera.setCantidadActual(capacidadMaxima);
        }
    }

  public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        int cantidadActual = cafetera.getCantidadActual();

        if (cantidadActual >= tamanoTaza) {
            cafetera.setCantidadActual(cantidadActual - tamanoTaza);
            System.out.println("Se ha servido una taza de café de " + tamanoTaza + " ml.");
        } else {
            System.out.println("No se pudo servir una taza completa. Quedó lleno hasta " + cantidadActual + " ml.");
            cafetera.setCantidadActual(0);
        }
    }
}