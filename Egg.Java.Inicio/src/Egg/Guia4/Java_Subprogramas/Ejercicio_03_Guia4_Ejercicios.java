package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;



/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 * @author hhc
 */
public class Ejercicio_03_Guia4_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String moneda, mone;
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a cambiar: ");
        double eur = read.nextDouble();
        do {
            System.out.print("Ingrese la moneda a cambiar (L) Libras, (Y) Yenes, ($) Dólares: ");
            moneda = read.next();

            mone = moneda.toUpperCase();

        } while (!mone.equals("L") && !mone.equals("Y") && !moneda.equals("$"));

        cambio(eur, mone);
    }

    public  static void cambio(double euros, String mon) {

        switch (mon) {
            case "L":
                System.out.println("\nEl  cambio para " + euros + " euros  a Libras es " + (euros * 0.86));
                break;

            case "Y":
                System.out.println("\nEl  cambio para " + euros + "  euros a yenes es " + (euros * 129.852));
                break;

            case "$":
                System.out.println("\nEl  cambio para " + euros + " euros a dólares es " + (euros * 1.28611));
                break;

        }

    }

}
