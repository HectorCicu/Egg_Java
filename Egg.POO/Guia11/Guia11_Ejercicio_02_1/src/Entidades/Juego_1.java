

package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Hector Cicutti
 */
public class Juego_1 {
private ArrayList<Jugador_1> jugadores;
private Revolver_1 revolver;

    public Juego_1() {
    }

    public Juego_1(ArrayList<Jugador_1> jugadores, Revolver_1 revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador_1> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador_1> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver_1 getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver_1 revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + "\n, revolver=" + revolver + '}';
    }

}
