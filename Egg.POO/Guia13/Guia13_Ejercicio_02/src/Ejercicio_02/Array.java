package Ejercicio_02;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 *
 * @author Hector Cicutti
 */
public class Array {

    public int[] array = {1, 2, 3, 4, 5};

    public void leoArray() throws Exception {

        for (int i = 0; i < 10; i++) {
            if (i + 1 > array.length) {
                throw new Exception("Uy, que kilombo...");
            }
            System.out.println("el número es " + array[i]);
        }
    }

    public void leoArray2() {
        for (int i = 0; i < 10; i++) {

            System.out.println("el número es " + array[i]);

        }
    }
}
