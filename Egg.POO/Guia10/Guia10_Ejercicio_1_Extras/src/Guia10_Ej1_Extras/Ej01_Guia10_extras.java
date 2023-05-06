package Guia10_Ej1_Extras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el
 * teclado y los guarde en un ArrayList de tipo Integer. La lectura de números
 * termina cuando se introduzca el valor -99. Este valor no se guarda en el
 * ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 *
 * @author Hector Cicutti
 */
public class Ej01_Guia10_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");


        ArrayList<Double> array = new ArrayList();
        Double aux;
        do {
            System.out.print("Ingrese un número (-99 para salir): ");
            aux = read.nextDouble();
            if (aux != -99) {
                array.add(aux);
            }
        } while (aux != -99);
        
        aux = 0.00;
        for (Double inte : array) {
            aux += inte;
        }
        System.out.println("\nLa suma de los números ingresados es: " + aux);
        System.out.println("\nEl promedio de los número ingresados es: " + (aux / array.size()));

    }

}
