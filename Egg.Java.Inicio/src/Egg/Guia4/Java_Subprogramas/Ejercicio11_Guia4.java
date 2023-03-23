package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios. a e i o u
 *
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 *
 * @author Temporal
 */
public class Ejercicio11_Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char letra;
        String fraseo = "", frasec = ""; //fraseo para ver la frase original y frasec para ver la frase convertida
        do {
            System.out.print("Ingrese cada caracter de la frase a convertir: ");
            letra = read.nextLine().charAt(0);
            fraseo += letra;   //concateno para mostrar la frase original
            frasec +=convierte(letra); //concateno para mostrar la frase convertida

        
        } while (letra != '.');
            System.out.println("\nFrase original......: " + fraseo);
            System.out.println("\nFrase convertida: " + frasec);
    }

    public static char convierte(char letra1) {
        switch(letra1) {
            case 'a':
                letra1 = '@';
                break;
                        
            case 'e':
                letra1 = '#';
                break;
                
            case 'i':
                letra1 = '$';
                break;
                
            case 'o':
                letra1 = '%';
                break;
                
            case 'u':
                letra1 = '*';
                break;
        }
        return letra1;
    }
}
