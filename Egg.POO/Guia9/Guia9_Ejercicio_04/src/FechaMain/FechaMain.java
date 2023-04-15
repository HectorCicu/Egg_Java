package FechaMain;

import FechaService.FechaService;
import java.util.Date;

/**
 *
 * @author hhc
 */
public class FechaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();

        Date d1 = fs.fechaActual();
        Date d2 = fs.fechaNacimiento();
        System.out.println("Fecha Actual: " + d1.toString());
        System.out.println("Fecha Nacimiento: " + d2.toString());
        
        System.out.println("La edad es de: " + fs.anios(d1, d2));

    }

}
