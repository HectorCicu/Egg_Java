package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author hhc
 */
public class Ejercicio03_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Cantidad de números a ingresar: ");
        int num, j;

        int cantidad = read.nextInt();
        int[] vector = new int[cantidad];
        int[] digitos = new int[5];
        for (int i = 0; i < vector.length; ++i) {
           do {
            System.out.print("Ingrese un número de 1 a 99999 (" + (i + 1) + " de " + vector.length + ") -> ");
            num = read.nextInt();
           }while (num > 9999);
           
            j = (int) (Math.floor(Math.log10(num)) + 1);  // determino los dígitos del número
           
            switch (j) {
                case 1:
                    digitos[0]++;
                    break;
                case 2:
                    digitos[1]++;
                    break;
                case 3:
                    digitos[2]++;
                    break;
                case 4:
                    digitos[3]++;
                    break;
                case 5:
                    digitos[4]++;
                    break;
            }

        }
        System.out.println("");
        for (int k = 0; k < digitos.length; ++k) {
            System.out.println("La cantidad de números con " + (k + 1) + " dígitos es: " + digitos[k]);
        }

    }
/*
    int valor;    
for(byte a = 0; a < numeros.length; a++) {            
     valor = rand.NextInt(100);     
     numeros[a] = valor;
    */
}
