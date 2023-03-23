package Egg.Guia5.Java_Arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author hhc-
 */
public class Ejercicio_06_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        String palabra;
        inicializarMatriz(sopa);
        //mostrarMatriz(sopa);
        for (int i = 1; i <= 5; ++i) {
            do {
                System.out.print("Ingrese una palabra entre 3 y 5 letras ( " + i + " de 5):  ");
                palabra = read.next();
            } while (palabra.length() < 1 || palabra.length() > 5);

            cargarMatriz(sopa, palabra);

        }
        completarMatriz(sopa);
        mostrarMatriz(sopa);

    }

    public static void inicializarMatriz(String[][] so) {
        for (int i = 0; i < so.length; ++i) {
            for (int j = 0; j < so[0].length; ++j) {
                so[i][j] = "";
            }
        }
    }

    public static void cargarMatriz(String[][] so, String pa) {
        Random rand = new Random();
        int i;
        do {
            i = rand.nextInt(0, (so.length - 1));
        } while (!so[i][0].equals(""));

        for (int j = 0; j < (pa.length()); ++j) {
            so[i][j] = pa.substring(j, (j + 1));
        }
        for (int j = pa.length(); j < (so[0].length); ++j) {
            so[i][j] = Integer.toString(((int) (Math.random() * 10)));
        }

    }

    public static void completarMatriz(String[][] so) {
        for (int i = 0; i < so.length; ++i) {
            if (so[i][0].equals("")) {
                for (int j = 0; j < so[0].length; ++j) {
                    so[i][j] = Integer.toString(((int) (Math.random() * 10)));
                }
            }
        }
    }

    public static void mostrarMatriz(String[][] so) {
        String aux = "";
        for (int i = 0; i < so.length; ++i) {
            aux = "[ ";
            for (int j = 0; j < so[0].length; ++j) {
                aux += "  " + so[i][j];
            }
            System.out.println(aux + " ]");
        }
    }

}
