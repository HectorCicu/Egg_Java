
package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 * @author hhc
 */
public class Ejercicio02_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese cantidad de números a llenar en el vector: ");
        int num = read.nextInt();
        
        int[] vector = new int[num];  
        
        for (int i = 0 ; i < vector.length; ++i){
            vector[i] = (int) (Math.random()* 10);
            
        }
        
        System.out.print("Ingrese un número a verificar (del 0 al 10): ");
        int consulta = read.nextInt();
        String aux = "";
        for (int i = 0 ; i < vector.length; ++i) {
            if (vector[i] == consulta) {
                System.out.println("El valor ingresado coincide con el de la posición " + i);
                
            }
            aux += " " + vector[i]; 
        }
        System.out.println(aux);
/*    for (int j : vector) {
         System.out.print(j + " ");
     }*/
    }

}
