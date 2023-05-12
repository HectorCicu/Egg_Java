package RuletaMain;

import Entidades.Jugador;
import JuegoServicios.RuletaServicios;
import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class JuegoRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RuletaServicios rs = new RuletaServicios();
        ArrayList<Jugador> player = new ArrayList<>();
        rs.llenarJugadores(player);

    }

}
