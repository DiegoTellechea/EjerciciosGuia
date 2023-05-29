package Guia1_Ej_01;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/



import java.util.Scanner;



public class Guia1_Ej_01 {

    
    public static void main(String[] args) {
    //creamos el objeto scanner para leer los num del usuario    
   Scanner leer = new Scanner(System.in);
   
   //pedimos los numeros
   System.out.println("Ingrese el primer numero entero");
        int numEntero1 = leer.nextInt();
        
   System.out.println("Ingrese el segundo numero entero");
        int numEntero2 = leer.nextInt();
    
    int suma = numEntero1 + numEntero2;
    
    System.out.println("La suma de los dos números es: " +suma);
    }
    
}
