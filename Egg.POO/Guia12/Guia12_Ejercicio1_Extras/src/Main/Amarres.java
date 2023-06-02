package Main;

import Entities.Barco;
import Entities.BarcoAMotor;
import Entities.Velero;
import Entities.YateDeLujo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author Hector Cicutti
 */
public class Amarres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2023, 5, 1);
        LocalDate fecha2 = LocalDate.of(2023, 5, 10);
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
        Barco ve1 = new Velero(1, 25, 1978, "JLV136");
        ve1.calculoAlquiler(1, dias);

        fecha1 = LocalDate.of(2023, 5, 1);
        fecha2 = LocalDate.of(2023, 5, 22);
        dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);

        Barco ya1 = new YateDeLujo(7, 300, 45, 2001, "GULF333");
        ya1.calculoAlquiler(1, dias);

        fecha1 = LocalDate.of(2023, 4, 1);
        fecha2 = LocalDate.of(2023, 5, 22);
        dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);

        Barco bm1 = new BarcoAMotor(90, 22, 1990, "MI007D");
        bm1.calculoAlquiler(1, dias);

    }

}
