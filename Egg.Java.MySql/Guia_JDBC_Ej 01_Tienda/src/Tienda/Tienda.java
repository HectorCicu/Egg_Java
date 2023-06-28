package Tienda;

import Tienda.Servicios.TiendaServices;

/**
 *
 * @author Hector Cicutti
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TiendaServices ts = new TiendaServices();
        ts.menu();

    }
}
