package Main;

import Entidad.Cantante;
import Servicio.CantanteService;
import java.util.HashMap;

/**
 *
 * @author Hector Cicutti
 */
public class CantantesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CantanteService css = new CantanteService();

        HashMap<Integer, Cantante> singer = new HashMap();
        css.menu(singer);

    }

}
