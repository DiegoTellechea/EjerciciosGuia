/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package poo_ej_04_rectangulo;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class POO_Ej_04_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Ingrese la base del rectángulo: ");
        rectangulo.setBase(leer.nextDouble());

        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(leer.nextDouble());

        System.out.println("Superficie del rectángulo: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujarRectangulo();
    }
}