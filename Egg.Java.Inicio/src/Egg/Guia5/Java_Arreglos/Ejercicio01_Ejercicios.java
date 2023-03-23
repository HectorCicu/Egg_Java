package Egg.Guia5.Java_Arreglos;

/**
 * 1. Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 * @author hhc
 */
public class Ejercicio01_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < num.length; ++i) {
            num[i] = i + 1;
        }
        for (int j = num.length - 1; j >= 0; --j) {
            System.out.println(num[j]);
        }
        
    }

}
