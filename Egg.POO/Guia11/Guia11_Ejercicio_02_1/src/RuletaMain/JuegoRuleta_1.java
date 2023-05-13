package RuletaMain;

import Entidades.Jugador_1;
import JuegoServicios.RuletaServicios_1;
import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class JuegoRuleta_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RuletaServicios_1 rs = new RuletaServicios_1();
        ArrayList<Jugador_1> player = new ArrayList<>();
        rs.llenarJugadores(player);

    }

}
