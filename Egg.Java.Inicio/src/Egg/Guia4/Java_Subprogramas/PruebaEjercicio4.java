
package Egg.Guia4.Java_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class PruebaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        
     Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = input.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
    
