package Main;

import Servicios.PerroServicio;


/**
 *
 * @author Hector Cicutti
 */
public class Perro_Main_Ej_01_Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
PerroServicio ps = new PerroServicio();
//ps.crearPerro();
ps.cargarMuchosPerros(20);
    }

}
