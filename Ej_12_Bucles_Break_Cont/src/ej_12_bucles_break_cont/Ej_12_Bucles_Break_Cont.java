/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals()..
 */
package ej_12_bucles_break_cont;

import java.util.Scanner;

/**
 *
 * @author Diego T.
 */
public class Ej_12_Bucles_Break_Cont {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        // Bucle principal que se ejecutará hasta que se ingrese la secuencia especial "&&&&&"
        while (true) {
            System.out.println("Ingrese una secuencia: ");
            String secuencia = leer.nextLine();
            String secMayus = secuencia.toUpperCase();

            // Verificamos si es la secuencia especial de finalización
            if (secMayus.equals("&&&&&")) {
                break; // Salimos del bucle
            }

            // Verificamos el formato de la secuencia
            if (secMayus.length() == 5 && secMayus.charAt(0) == 'X' && secMayus.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        }

        // Mostramos el informe final
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
}