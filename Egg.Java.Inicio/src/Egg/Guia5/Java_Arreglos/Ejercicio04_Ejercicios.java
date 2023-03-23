package Egg.Guia5.Java_Arreglos;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author hhc
 */
public class Ejercicio04_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matrizTr = new int[4][4];

        for (int i = 0; i < matriz[0].length; ++i) {
            for (int j = 0; j < matriz[0].length; ++j) {
              matriz[i][j] = (int) (Math.random() * 10);
 
            }
        }
        for (int i = 0; i < matrizTr[0].length; ++i) {
            for (int j = 0; j < matrizTr[0].length; ++j) {
              matrizTr[i][j] = matriz[j][i];
            }
        }
String aux, auxtr;
        for (int i = 0; i < matriz[0].length; ++i) {
            aux = "";
            for (int j = 0; j < matriz[0].length; ++j) {
             aux += "  " + matriz[i][j] ;
            }
            System.out.println(aux);
        }
        System.out.println("");
        for (int i = 0; i < matrizTr[0].length; ++i) {
            auxtr = "";
            for (int j = 0; j < matrizTr[0].length; ++j) {
             auxtr += "  " + matrizTr[i][j] ;
            }
            System.out.println(auxtr);
        }

    }
}
