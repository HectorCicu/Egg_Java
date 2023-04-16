package MesesMain;

import Entidad.Meses;
import Servicio.MesesServicio;

/**
 *
 * @author Hector Cicutti
 */
public class MesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesesServicio ms = new MesesServicio();

        Meses mess = new Meses();
        ms.adivinarMes(mess);

    }

}
