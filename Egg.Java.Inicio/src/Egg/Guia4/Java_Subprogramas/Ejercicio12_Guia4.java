package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.
 *
 * @author Temporal
 */
public class Ejercicio12_Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = read.nextInt();

        System.out.print("Ingrese el segundo número para determinar si es múltiplo del primero: ");
        num2 = read.nextInt();
        esMultiplo(num1, num2);

    }

    public static void esMultiplo(int n1, int n2) {
        int modulo;
        modulo = n1 % n2;
        if (modulo == 0) {
            System.out.println("El número " + n2 + " es múltiplo de " + n1 + "\n");
        } else {
            System.out.println("El número " + n2 + "\033[31m NO es múltiplo \033[30m de " + n1 + ". Su módulo es: " + modulo + "\n");  // con los caracteares "\033[31m y \033[30m cambio de color rojo y vuelvo a negro

        }
    }
}
