/*
 /*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
 
package servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class CursoServicio {
    private Scanner leer;

    public CursoServicio() {
        leer = new Scanner(System.in);
    }

    public Curso crearCurso() {
        Curso curso = new Curso();

        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(leer.nextLine());

        System.out.println("Ingrese la cantidad de horas por día:");
        curso.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese la cantidad de días por semana:");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        
        String turno;
        do {
            System.out.println("Ingrese el turno (mañana o tarde):");
            turno = leer.nextLine().toLowerCase();
        } while (!turno.equals("mañana") && !turno.equals("tarde"));
        curso.setTurno(turno);

        System.out.println("Ingrese el precio por hora:");
        curso.setPrecioPorHora(leer.nextDouble());
        

        String[] alumnos = cargarAlumnos();
        curso.setAlumnos(alumnos);

        return curso;
    }

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        System.out.println("Ingrese los nombres de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = leer.nextLine();
        }

        return alumnos;
    }

    public double calcularGananciaSemanal(Curso curso) {
        int cantidadHorasSemanales = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana();
        int cantidadAlumnos = curso.getAlumnos().length;
        double gananciaSemanal = cantidadHorasSemanales * curso.getPrecioPorHora() * cantidadAlumnos;

        return gananciaSemanal;
    }

    public void mostrarCurso(Curso curso) {
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: " + curso.getPrecioPorHora());
        System.out.println("Alumnos:");
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + curso.getAlumnos()[i]);
        }
    }
}