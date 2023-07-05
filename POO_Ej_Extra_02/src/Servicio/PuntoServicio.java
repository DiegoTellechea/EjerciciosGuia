/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
Para 
P1(x1,y1) y P2(x2,y2) se tiene que d(P1,P2)=√(x2−x1)2+(y2−y1)2 
 */
package Servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class PuntoServicio {
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos puntos = new Puntos();
        System.out.println("Ingrese coordenadas de x1:");
        puntos.setX1(leer.nextDouble());
        System.out.println("Ingrese coordenadas de y1:");
        puntos.setY1(leer.nextDouble());
        System.out.println("Ingrese coordenadas de x2:");
        puntos.setX2(leer.nextDouble());
        System.out.println("Ingrese coordenadas de y2:");
        puntos.setY2(leer.nextDouble());
        return puntos;
    }
    
    // d(P1,P2)=√(x2−x1)2+(y2−y1)2 

    public double calcularDistancia(Puntos puntos){
        double distancia;
        distancia = Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(),2) +  Math.pow(puntos.getY2() - puntos.getY1(),2)  );
        return distancia;
    }
    
}


