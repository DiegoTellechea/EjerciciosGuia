/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class MovilServicio {
   public Movil cargarCelular() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la memoria RAM: ");
        int memRam = scanner.nextInt();

        System.out.print("Ingrese el almacenamiento: ");
        int almacenamiento = scanner.nextInt();

        // Crea el arreglo para almacenar el código
        int[] codigo = new int[7];
        System.out.println("Ingrese el código de 7 números:");
        for (int i = 0; i < codigo.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }

        return new Movil(marca, precio, modelo, memRam, almacenamiento, codigo);
    }
}