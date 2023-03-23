package Egg.Guia5.Java_Arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar un programa que complete un vector con los N primeros números de la
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión
 * de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno
 * de los números se calcula sumando los dos anteriores a él. Por ejemplo: La
 * sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del
 * número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente… La sucesión de
 * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: Fibonaccin =
 * Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1 para todo n<=1 Por
 * lo tanto, si queremos calcular el término “n” debemos escribir una función
 * que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
 * a ese valor. Para conocer más acerca de la serie de Fibonacci consultar el
 * siguiente link: https://quantdare.com/numeros-de-fibonacci/
 *
 *
 * @author hhc . 
 */
public class Ejercicio_07_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la Sucesión Fibonacci: ");
        int fibo = read.nextInt();
        int[] sucFibo = new int[fibo];
        llenarVector(sucFibo);
        imprimirVector(sucFibo);

    }

    public static void llenarVector(int[] sf) {
        sf[0] = 1;
        sf[1] = 1;
        for (int i = 2; i < sf.length; ++i) {
            sf[i] = sf[i - 1] + sf[i - 2];
        }

    }

    public static void imprimirVector(int[] vector) {
        System.out.println("\nSuc. Fibonacci: " + Arrays.toString(vector));
    }
}
