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
package entidad;

/**
 *
 * @author Diego T.
 */
public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

   
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
  public double calcularSuperficie() {
        return base * altura;  // Calcula y retorna la superficie del rectángulo
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);  // Calcula y retorna el perímetro del rectángulo
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");  // Imprime asteriscos para dibujar el rectángulo
            }
            System.out.println();  // Imprime una nueva línea después de cada fila
        }
    }
}

