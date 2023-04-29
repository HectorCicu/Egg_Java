package AlumnoMain;

import AlumnoService.AlumnoService;

/**
 *
 * @author Hector Cicutti
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        as.menuPrincipal();
    }

}
