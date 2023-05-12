package JuegoServicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hector Cicutti
 */
public class RuletaServicios {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public static Revolver rev = new Revolver();

    public static Random rand = new Random();

    public static void llenarRevolver(Integer max) {  //seteo tamaño del tambor = 6 u 8
        rev.setPosicionTambor(rand.nextInt(1, max));
        rev.setPosicionAgua(rand.nextInt(1, max));

    }

    public static Boolean mojar(Revolver rev) {
        return (Objects.equals(rev.getPosicionAgua(), rev.getPosicionTambor()));
    }

    public static void siguienteChorro(Revolver revo, Integer max) {
        revo.setPosicionTambor(rand.nextInt(1, max));

    }

    public static void llenarJugadores(ArrayList<Jugador> juga) {
        System.out.println("BIENVENIDOS A LA RULETA RUSA DE AGUA");
        System.out.println("---------------------------------------------------------\n");
        Integer tambor, jugadores = 0;
        do {
            System.out.print("Ingrese Cantidad de Jugadores (máximo 8): ");

            jugadores = read.nextInt();
            if (jugadores == 0) {
                jugadores = 8;
            }
        } while (jugadores < 1 || jugadores > 8);

        do {
            System.out.print("Ingrese tamaño del tambor (6 u 8): ");
            tambor = read.nextInt();

        } while (tambor < 6 || tambor > 8);
        for (Integer i = 1; i <= jugadores; i++) {
            juga.add(new Jugador(i, "Jugador " + i));
        }

        System.out.println("Jugadores cargados - Pulse ENTER para cargar el revólver de agua");
        read.next();
        llenarRevolver((tambor + 1));
        System.out.println("\nRevólver cargado...");
        System.out.println("Pulse ENTER para comenzar el juego");
        read.next();
        ronda(juga, rev, (tambor + 1));
    }

    public static void ronda(ArrayList<Jugador> jug, Revolver rev, Integer tambor) {
        Integer posic = 1;
        Boolean mojado = false;
        while (!mojado) {
            for (Jugador jugador : jug) {
                mojado = mojar(rev);
                jugador.setMojado(mojado);
                System.out.println("Intento Jugador: " + jugador.getId() + " - " + jugador.getNombre());
                System.out.println(rev.getPosicionAgua() + "   tambor: " + rev.getPosicionTambor());
                if (mojado) {
                    System.out.println("El jugador " + jugador.getNombre() + " fue mojado \n");
                    jugador.setMojado(mojado);

                    break;
                } else {
                    System.out.println("Se salvó, pulse ENTER para continuar");
                    read.next();
                    siguienteChorro(rev, tambor);
                }
            }
        }
        System.out.println("\nFinalizó el juego, pulse ENTER para ver los resultados");
        read.next();
        muestraResultados(jug, rev);
    }

    public static void muestraResultados(ArrayList<Jugador> jug, Revolver rev) {
        for (Jugador jugador : jug) {
            System.out.println(jugador.toString());

        }
    }
}
