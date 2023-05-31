/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ej_10_guia_asteriscos;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_10_Guia_Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);// inicializamos la clase scanner 
        
        for (int i = 0; i < 4; i++) {//usamos un for para iniciar el bucle que vaya de 1 a 4 
            
            System.out.println("Ingrese el numero" +i+ "entre 1 y 20"); // usamos sout para pedir el numero segun el numero de i
            
            int num = leer.nextInt();//inicializamos variable num al mimso tiempo que leemos y asignamos el valor 
            
            
            if ( num <0 || num >20) {// utilizamos el condicional "if" para descartar los numeros no validos
                
                System.out.println(" El numero esta fuera de rango, ingrese un numero valido");
                
                i--; //restamos un numero al contador de iteraciones para que vuela a pedir el numero valido
                
                continue; //utilizamos la sentencia continue para salir y empezar la iteracion nuevamente
                        
                
            }
             
            System.out.print(num + " ");//imprimimos el numero con un espacio sin salto de linea
            
            for (int j = 0; j < num; j++) { // utilizamos la estr. repetitiva for ya que sabemos la cantidad de veces que debemos iterar el bucle
                
                System.out.print("*"); // imprimimos sin salto de linea
            }
            System.out.println();
                
            }
            
        }
    }
    

