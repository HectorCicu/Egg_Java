package Guia10_Ejercicio01;

import Servicios_01.PerroServicios;

/**
 *
 * @author Hector Cicutti
 */
public class PerroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicios ps = new PerroServicios();
        //ps.Cargarperro();
        ps.crearMuchasRazas(15);
        ps.eliminarPerro();
    }

}
