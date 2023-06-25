/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.

e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.

g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Servicio;

import Entidad.Cadena;

/**
 *
 * @author Diego T.
 */
public class CadenaServicio {
    
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada.
    
    public static void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char c = Character.toLowerCase(cadena.getFrase().charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales.");
    }

    
        //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public static void invertirFrase(Cadena cadena) {
        StringBuilder fraseInvertida = new StringBuilder(cadena.getFrase());
        fraseInvertida.reverse();
        System.out.println("Frase invertida: " + fraseInvertida);
    }
        // c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public static void vecesRepetido(Cadena cadena, String letra) {
        char caracter = letra.charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (Character.toLowerCase(cadena.getFrase().charAt(i)) == Character.toLowerCase(caracter)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + caracter + "' se repite " + contador + " veces.");
    }

        //d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        //compone la clase con otra nueva frase ingresada por el usuario.
    
    public static void compararLongitud(Cadena cadena, String otraFrase) {
        int longitudOtraFrase = otraFrase.length();
        if (cadena.getLongitud() > longitudOtraFrase) {
            System.out.println("La frase '" + cadena.getFrase() + "' es más larga que '" + otraFrase + "'.");
        } else if (cadena.getLongitud() < longitudOtraFrase) {
            System.out.println("La frase '" + cadena.getFrase() + "' es más corta que '" + otraFrase + "'.");
        } else {
            System.out.println("La frase '" + cadena.getFrase() + "' tiene la misma longitud que '" + otraFrase + "'.");
        }
    }

    
        //e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public static void unirFrases(Cadena cadena, String otraFrase) {
        String fraseUnida = cadena.getFrase() + " " + otraFrase;
        System.out.println("Frase resultante: " + fraseUnida);
    }

    
         //f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
         //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
         //la frase resultante.
    
    public static void reemplazar(Cadena cadena, String letra, String reemplazo) {
        String fraseReemplazada = cadena.getFrase().replace(letra, reemplazo);
        System.out.println("Frase resultante: " + fraseReemplazada);
    }

        //g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public static boolean contiene(Cadena cadena, String letra) {
        char caracter = letra.charAt(0);
        return cadena.getFrase().toLowerCase().contains(Character.toString(caracter).toLowerCase());
    }
}