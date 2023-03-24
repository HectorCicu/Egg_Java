package Opera;

import Entidades.Operacion;

/**
 *
 * @author hhc
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion o1 = new Operacion();
        o1.cargaNros();

        System.out.println("\n La suma de los números es: " + o1.sumar());
        System.out.println("\n La resta de los números es: " + o1.restar());
        System.out.println("\n La multiplicación de los números es: " + o1.multiplicar());
        System.out.println("\n La división de los números es: " + o1.dividir());
    }

}
