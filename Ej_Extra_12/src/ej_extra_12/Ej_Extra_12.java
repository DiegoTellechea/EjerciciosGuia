/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ej_extra_12;

/**
 *
 * @author Diego T.
 */
public class Ej_Extra_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Bucle externo para el primer dígito (centenas)
        for (int i = 0; i <= 9; i++) {
            // Bucle intermedio para el segundo dígito (decenas)
            for (int j = 0; j <= 9; j++) {
                // Bucle interno para el tercer dígito (unidades)
                for (int k = 0; k <= 9; k++) {
                    // Verificar si el dígito es 3 y sustituirlo por una E
                    if (i == 3 || j == 3 || k == 3) {
                        System.out.println(i + "-" + j + "-E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
    }
}