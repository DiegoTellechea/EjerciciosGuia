/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Libro {

    private Double ISBN;
    private String Titulo;
    private String Autor;
    private int NumDePaginas;

    public Libro() {
    }

    public Libro(double ISBN, String Titulo, String Autor, int NumDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumDePaginas = NumDePaginas; 
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumDePaginas() {
        return NumDePaginas;
    }

    public void setNumDePaginas(int NumDePaginas) {
        this.NumDePaginas = NumDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumDePaginas=" + NumDePaginas + '}';
    }


   
    
   public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ISBN: ");
       setISBN(scanner.nextDouble());
       scanner.nextLine();
       System.out.print("Ingrese el título del libro: ");
       setTitulo(scanner.nextLine());
       //scanner.nextLine();
       System.out.print("Ingrese el autor del libro: ");
       setAutor(scanner.nextLine());

       System.out.print("Ingrese el número de páginas: ");
       setNumDePaginas(scanner.nextInt());
    }

    public void mostrarDatos() {
        System.out.println("Número de ISBN: " + ISBN);
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Número de páginas: " + NumDePaginas);
    }
    
}
    