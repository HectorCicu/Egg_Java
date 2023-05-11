package Main_Jugador;

import Entidades.Equipo;
import Servicios.JugadorService;

/**
 *
 * @author Hector Cicutti
 */
public class Jugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JugadorService js = new JugadorService();

        js.cargaJugadores();

    }

}
