package ArregloService;

import java.util.Arrays;

/**
 * 1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
 * números aleatorios. 2) Método mostrar recibe un arreglo por parámetro y lo
 * muestra por pantalla. 3) Método ordenar recibe un arreglo por parámetro y lo
 * ordena de mayor a menor. 4) Método inicializarB copia los primeros 10 números
 * del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del
 * arreglo B con 0.5.
 *
 * @author Temporal
 */
public class ArregloService {

    public void inicializarA(double[] arregloA) {

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random() *100);

        }
    }

    public void mostrar(double[] arregloA) {
        System.out.println("El arreglo es: " + Arrays.toString(arregloA));
    }

    public void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);
        double[] arregloB = new double[arregloA.length];
        for (int i = arregloA.length - 1; i >= 0; i--) {
            arregloB[i] = arregloA[(arregloA.length - 1) - i];
        }

        System.out.println("El arreglo ordenado es : " + Arrays.toString(arregloB));

    }

    /*
    4) Método inicializarB copia los primeros 10 números
 * del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del
 * arreglo B con 0.5.
     */

    public void inicializarB(double[] arregloA, double[] arregloB) {

        double[] arregloc = new double[20];

        for (int i = 0; i < 10; i++) {
            arregloc[i] = arregloA[i];
            Arrays.fill(arregloB, i, i+1, arregloA[i]);
        }

        Arrays.fill(arregloB, 10, 20, (0.5));
        Arrays.fill(arregloc, 10, 20, (1.5));
        mostrar(arregloB);

        mostrar(arregloc);
    }

}
