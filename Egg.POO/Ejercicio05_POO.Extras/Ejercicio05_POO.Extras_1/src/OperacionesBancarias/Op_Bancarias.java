package OperacionesBancarias;

import Servicios.CuentaServicios;

/**
 * Los métodos de una clase pueden tener parámetros, los cuales son datos que se
 * requieren para la ejecución del método. Un método puede no contener ningún
 * parámetro, un solo parámetro o muchos parámetros. Se recomienda que la
 * cantidad de parámetros sea la adecuada para el correcto funcionamiento del
 * método, es decir, que no tenga demasiados parámetros.
 *
 * @author hhc
 */
public class Op_Bancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
CuentaServicios m1 = new CuentaServicios();
m1.menu();

       
    }

}
