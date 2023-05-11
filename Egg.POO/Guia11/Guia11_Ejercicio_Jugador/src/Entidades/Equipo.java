

package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector Cicutti
 */
public class Equipo {
private String nombreEquipo;
private List<Jugador> jugador = new ArrayList<Jugador>();

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Equipo() {
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo= " + nombreEquipo + ", jugador= " + jugador + '}';
    }

}
