package Main;

import Servicios.PerroServicio;

/**
 *
 * @author Hector Cicutti
 */
public class Perro_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PerroServicio ps = new PerroServicio();
       ps.crearPerro();
        ps.cargarMuchosPerros(20);
        ps.eliminarPerro();
        
    }

}
