/*

Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
Cuadrado
Rectángulo
Triangulo
Circulo
Hexágono
Pentágono
Rombo
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla
 */
package poo_ej_grupal_calculadora;



import Entidad.Circulo;
import Entidad.Cuadrado;
import Entidad.Hexagono;
import Entidad.Pentagono;
import Entidad.Rectangulo;
import Entidad.Rombo;
import Entidad.Triangulo;
import Servicio.CirculoServicio;
import Servicio.CuadradoServicio;
import Servicio.HexagonoServicio;
import Servicio.PentagonoServicio;
import Servicio.RectanguloServicio;
import Servicio.RomboServicio;
import Servicio.TrianguloServicio;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */

public class POO_Ej_grupal_Calculadora {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("----- Calculadora Geométrica -----");
            System.out.println("1. Calcular área y perímetro de un cuadrado");
            System.out.println("2. Calcular área y perímetro de un rectángulo");
            System.out.println("3. Calcular área y perímetro de un triángulo");
            System.out.println("4. Calcular área y perímetro de un círculo");
            System.out.println("5. Calcular área y perímetro de un hexágono");
            System.out.println("6. Calcular área y perímetro de un pentágono");
            System.out.println("7. Calcular área de un rombo");
            System.out.println("8. Salir");

            System.out.println("Ingrese la opción deseada: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = leer.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    CuadradoServicio cuadradoServicio = new CuadradoServicio();
                    double areaCuadrado = cuadradoServicio.calcularArea(cuadrado);
                    double perimetroCuadrado = cuadradoServicio.calcularPerimetro(cuadrado);
                    System.out.println("Área: " + areaCuadrado);
                    System.out.println("Perímetro: " + perimetroCuadrado);
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectángulo: ");
                    double baseRectangulo = leer.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = leer.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    RectanguloServicio rectanguloServicio = new RectanguloServicio();
                    double areaRectangulo = rectanguloServicio.calcularArea(rectangulo);
                    double perimetroRectangulo = rectanguloServicio.calcularPerimetro(rectangulo);
                    System.out.println("Área: " + areaRectangulo);
                    System.out.println("Perímetro: " + perimetroRectangulo);
                    break;
                case 3:
                    System.out.println("Ingrese la base del triángulo: ");
                    double baseTriangulo = leer.nextDouble();
                    System.out.println("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = leer.nextDouble();
                    System.out.println("Ingrese el lado 1 del triángulo: ");
                    double lado1Triangulo = leer.nextDouble();
                    System.out.println("Ingrese el lado 2 del triángulo: ");
                    double lado2Triangulo = leer.nextDouble();
                    System.out.println("Ingrese el lado 3 del triángulo: ");
                    double lado3Triangulo = leer.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo,
                            lado2Triangulo, lado3Triangulo);
                    TrianguloServicio trianguloServicio = new TrianguloServicio();
                    double areaTriangulo = trianguloServicio.calcularArea(triangulo);
                    double perimetroTriangulo = trianguloServicio.calcularPerimetro(triangulo);
                    System.out.println("Área: " + areaTriangulo);
                    System.out.println("Perímetro: " + perimetroTriangulo);
                    break;
                case 4:
                    System.out.println("Ingrese el radio del círculo: ");
                    double radioCirculo = leer.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    CirculoServicio circuloServicio = new CirculoServicio();
                    double areaCirculo = circuloServicio.calcularArea(circulo);
                    double perimetroCirculo = circuloServicio.calcularPerimetro(circulo);
                    System.out.println("Área: " + areaCirculo);
                    System.out.println("Perímetro: " + perimetroCirculo);
                    break;
                case 5:
                    System.out.println("Ingrese el lado del hexágono: ");
                    double ladoHexagono = leer.nextDouble();
                    Hexagono hexagono = new Hexagono(ladoHexagono);
                    HexagonoServicio hexagonoServicio = new HexagonoServicio();
                    double areaHexagono = hexagonoServicio.calcularArea(hexagono);
                    double perimetroHexagono = hexagonoServicio.calcularPerimetro(hexagono);
                    System.out.println("Área: " + areaHexagono);
                    System.out.println("Perímetro: " + perimetroHexagono);
                    break;
                case 6:
                    System.out.println("Ingrese el lado del pentágono: ");
                    double ladoPentagono = leer.nextDouble();
                    Pentagono pentagono = new Pentagono(ladoPentagono);
                    PentagonoServicio pentagonoServicio = new PentagonoServicio();
                    double areaPentagono = pentagonoServicio.calcularArea(pentagono);
                    double perimetroPentagono = pentagonoServicio.calcularPerimetro(pentagono);
                    System.out.println("Área: " + areaPentagono);
                    System.out.println("Perímetro: " + perimetroPentagono);
                    break;
                case 7:
                    System.out.println("Ingrese la diagonal mayor del rombo: ");
                    double diagonalMayorRombo = leer.nextDouble();
                    System.out.println("Ingrese la diagonal menor del rombo: ");
                    double diagonalMenorRombo = leer.nextDouble();
                    Rombo rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo);
                    RomboServicio romboServicio = new RomboServicio();
                    double areaRombo = romboServicio.calcularArea(rombo);
                    System.out.println("Área: " + areaRombo);
                    break;
                case 8:
                    System.out.println("Gracias por usar la Calculadora Geométrica. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            System.out.println();
        }

      
    }
}