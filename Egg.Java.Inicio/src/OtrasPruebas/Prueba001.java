package OtrasPruebas;

import java.util.Scanner;

/**
 * *Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25
 *
 * @author hhc
 */
public class Prueba001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean num1_25 = false, num2_25 = false;
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        if (num1 > 25) {
             num1_25 = true;
        }
        if (num2 > 25 ){
            num2_25 = true;
        }
        
        
        
        
        
        
        if ((num1 > 25) && (num2 > 25)) {
            System.out.println("\nAmbos números son mayores a 25\n");
        } else if ((num1 > 25) && (num2 <= 25)) {
            System.out.println("\nEl primer número ingresado es mayor a 25\n");
        } else if (num1 <= 25 && num2 > 25) {
            System.out.println("\nEl segundo número es mayor a 25\n");
        } else {
            System.out.println("\nNinguno de los números es mayor que 25\n");
        }
    }

}
