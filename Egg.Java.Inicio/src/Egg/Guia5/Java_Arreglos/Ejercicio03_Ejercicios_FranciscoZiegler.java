
package Egg.Guia5.Java_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class Ejercicio03_Ejercicios_FranciscoZiegler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = sc.nextInt();
        int[] arreglo = new int[n];
        int[] digitos = new int[5];
        llenar(arreglo);
        mostrar(arreglo,1);
        digitosArreglo(arreglo, digitos);
        mostrar(digitos,1);
    }
    
    public static void digitosArreglo(int[] arreglo, int[] digitos){
    
        for (int i = 0; i < arreglo.length; i++) {
            digitos[digitos(arreglo[i])-1]+=1;
        }
    }
    
    public static int digitos(int n){
        int contador;
        contador = 0;
        do {
            n=n/10;
            contador++;
        } while (n>0);
        return contador;
    }
    
    public static void llenar(int[] arreglo){
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(13000);
        }
    }
    
    public  static void mostrar(int[] arreglo, int orden) {
        //orden = 1 ascendente / -1 descendente
        System.out.println("");
        System.out.print("[ ");
        for (int i = (orden==1?0:-(arreglo.length)); i < (orden==1?arreglo.length:0); i++) {
            System.out.print(arreglo[(orden==1?i:-(i+1))]+" ");
        }
        System.out.print("]");
        System.out.println("");
    }

    }


