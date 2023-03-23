
package OtrasPruebas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class otro_ejercicio_06_guia5_extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
        String palabras;
        String[][] mat = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j] = "*";
            }
        }
        for (int i = 0; i < 5; i++) {

            System.out.println("ingrese una palabra entre 3 a 5 caracteres");
            do {
                palabras = read.next();
                if (palabras.length() > 5 || palabras.length() < 3) {
                    System.out.println("ingrese la cantidad de caracteres correspondientes  ");
                }
            } while (palabras.length() > 5 || palabras.length() < 3);
            llenarmatriz(mat, palabras);
         }
        completarmatriz( mat);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+mat[i][j]+"] " );
            }
            System.out.println(" ");
        }
    }

    public static void llenarmatriz(String[][] mat, String palabras) {
        Random rand = new Random();
        int i;
        do {
            i = rand.nextInt(mat.length - 1);
        } while (!mat[i][0].equals("*"));
        for (int j = 0; j < palabras.length(); j++) {
            mat[i][j] = palabras.substring(j, j + 1);
        }
    }

    public static void completarmatriz(String[][] mat) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (mat[i][j].equals("*") ) {
                    mat[i][j]= Integer.toString(((int) (Math.random() * 10)));
                }
            }
            
        }
    }
}

    


