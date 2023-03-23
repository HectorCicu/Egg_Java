package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author hhc
 */
public class Ejercicio_04_Guia4_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean primo = false;
        System.out.print("Ingrese un número para determinar si es primo: ");
        int num = read.nextInt();

        primo = esPrimo(num);  

        if (primo == false) {
            System.out.println("El número " + num + " NO es primo");
        } else {
            System.out.println("El número " + num + " ES  primo");

        }

    }

    public static boolean esPrimo(int numero) {
        boolean es = true;

        for (int i = 2; i < numero; ++i) {
            if (numero % i == 0) {
                es = false;
            }
        }

        return es;
    }

}
