package JuegoMetodo;

import Juego.Juego;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Temporal
 */
public class MetodosJugar {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Random rand = new Random();
    Juego j1 = new Juego();

    public void jugador1() {

        j1.setNumeroAdivinar(rand.nextInt(100));
        System.out.println("\nNúmero aleatorio generado... \n");
    }

    public void cantIntentos() {
        String cambia;
        if (j1.getIntentos() < 1) {
            System.out.print("\nIngrese cantidad de intentos para adivinar: ");
            j1.setIntentos(read.nextInt());
        } else {
            do {
                System.out.print("\nla cantidad de intentos es " + j1.getIntentos() + " desea cambiar? S/N: ");
                cambia = read.next();
            } while (!cambia.equalsIgnoreCase("S") || !cambia.equalsIgnoreCase("N"));
            if (cambia.equalsIgnoreCase("s")) {
                System.out.print("\nIngrese cantidad de intentos para adivinar: ");
                j1.setIntentos(read.nextInt());

            }
        }

    }

    public void adivinarNro() {

        int nroJugador2, contador = 0 , cantjug = 0;
        boolean acerto = false, seguir = true ;

        String sigue;
        do {
            cantjug++;
            j1.setCantJugadas(cantjug);
            jugador1();
            cantIntentos();
            do {
                contador++;
                System.out.print("Ingrese número a adivinar (intento " + contador + " de " + j1.getIntentos() + ")");
                nroJugador2 = read.nextInt();

                if (nroJugador2 == j1.getNumeroAdivinar()) {
                    acerto = true;
                } else if (nroJugador2 < j1.getNumeroAdivinar()) {
                    System.out.println("El número ingresado es menor al que tiene que adivinar");
                } else {
                    System.out.println("El número ingresado es Mayor al que tiene que adivinar");
                }
            } while (acerto || contador == j1.getIntentos());

            if (acerto) {
                System.out.println("\nFELICITACIONES!! Acertó el número (" + j1.getNumeroAdivinar() + ")");
                j1.setGanaEl_2(j1.getGanaEl_2() + 1);
            } else {
                System.out.println("\nLo lamento, perdió. El número a adivinar era " + j1.getNumeroAdivinar());
                j1.setGanaEl_1(j1.getGanaEl_1() + 1);
            }

            do {
                System.out.print("Desea jugar de nuevo S/N? ");
                sigue = read.next();
            } while (!sigue.equalsIgnoreCase("S") || !sigue.equalsIgnoreCase("N"));
            if (sigue.equalsIgnoreCase("N")) {
                seguir = false;
            }
            j1.setTotalIntentos(j1.getTotalIntentos() + contador);
        } while (!seguir);
    }

    public void resultados() {
        
        System.out.println("""
                           RESULTADOS FINALES
                           ------------------
        """);
        System.out.println("Cantidad de partidas jugadas...................: " + j1.getIntentos() );
        System.out.println("Cantidad de jugadas realizadas.................: " + j1.getTotalIntentos());
        System.out.println("Juegos ganados por el Jugador 1 (genera número): " + j1.getGanaEl_1());
        System.out.println("Juegos ganados por el Jugador 2 (quien adivina): " + j1.getGanaEl_2());
        System.out.println("\nMUCHAS GRACIAS!, VUELVAS PRONTOSSSS!");
        
        
    }
}












