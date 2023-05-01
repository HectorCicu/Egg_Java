package Main;

import PeliculasService.PeliculaServicio;

/**
 *
 * @author Hector Cicutti
 */
public class PeliculasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PeliculaServicio ps = new PeliculaServicio();
        ps.menuPrincipal();
    }

}
