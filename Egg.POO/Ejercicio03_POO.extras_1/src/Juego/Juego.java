package Juego;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author Temporal
 */
public class Juego {

    private int numeroAdivinar;
    private int ganaEl_1;
    private int ganaEl_2;
    private int intentos;
    private int cantJugadas;
    private int totalIntentos;

    public Juego() {
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public int getGanaEl_1() {
        return ganaEl_1;
    }

    public void setGanaEl_1(int ganaEl_1) {
        this.ganaEl_1 = ganaEl_1;
    }

    public int getGanaEl_2() {
        return ganaEl_2;
    }

    public void setGanaEl_2(int ganaEl_2) {
        this.ganaEl_2 = ganaEl_2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public int getTotalIntentos() {
        return totalIntentos;
    }

    public void setTotalIntentos(int totalIntentos) {
        this.totalIntentos = totalIntentos;
    }
 Scanner read = new Scanner(System.in).useDelimiter("\n");
    Random rand = new Random();
    

    public void jugador1() {

         setNumeroAdivinar(rand.nextInt(100));
        System.out.println("\nNúmero aleatorio generado... \n");
    }

    public void cantIntentos() {
        String cambia;
        if ( getIntentos() < 1) {
            System.out.print("\nIngrese cantidad de intentos para adivinar: ");
             setIntentos(read.nextInt());
        } else {
            do {
                System.out.print("\nla cantidad de intentos es " +  getIntentos() + " desea cambiar? S/N: ");
                cambia = read.next();
            } while (!cambia.equalsIgnoreCase("S") && !cambia.equalsIgnoreCase("N"));
            if (cambia.equalsIgnoreCase("s")) {
                System.out.print("\nIngrese cantidad de intentos para adivinar: ");
                 setIntentos(read.nextInt());

            }
        }

    }

    public void adivinarNro() {

        int nroJugador2, contador = 0 , cantjug = 0;
        boolean acerto = false, seguir = true ;

        String sigue;
        do {
            cantjug++;
             setCantJugadas(cantjug);
            jugador1();
            cantIntentos();
            contador = 0;
            do {
                contador++;
                System.out.print("Ingrese número a adivinar (intento " + contador + " de " +  getIntentos() + "): ");
                nroJugador2 = read.nextInt();

                if (nroJugador2 ==  getNumeroAdivinar()) {
                    acerto = true;
                } else if (nroJugador2 <  getNumeroAdivinar()) {
                    System.out.println("El número ingresado es menor al que tiene que adivinar");
                } else {
                    System.out.println("El número ingresado es Mayor al que tiene que adivinar");
                }
            } while (!acerto && contador < getIntentos());

            if (acerto) {
                System.out.println("\nFELICITACIONES!! Acertó el número (" +  getNumeroAdivinar() + ")");
                 setGanaEl_2( getGanaEl_2() + 1);
            } else {
                System.out.println("\nLo lamento, perdió. El número a adivinar era " +  getNumeroAdivinar());
                 setGanaEl_1( getGanaEl_1() + 1);
            }

            do {
                System.out.print("Desea jugar de nuevo S/N? ");
                sigue = read.next();
            } while (!sigue.equalsIgnoreCase("S") && !sigue.equalsIgnoreCase("N"));
            if (sigue.equalsIgnoreCase("N")) {
                seguir = false;
            }
             setTotalIntentos( getTotalIntentos() + contador);
        } while (seguir);
    }

    public void resultados() {
        
        System.out.println("""
                           RESULTADOS FINALES
                           ------------------
        """);
        System.out.println("Cantidad de partidas jugadas...................: " +  getCantJugadas() );
        System.out.println("Cantidad de jugadas realizadas.................: " +  getTotalIntentos());
        System.out.println("Juegos ganados por el Jugador 1 (genera número): " +  getGanaEl_1());
        System.out.println("Juegos ganados por el Jugador 2 (quien adivina): " +  getGanaEl_2());
        System.out.println("\nMUCHAS GRACIAS!, VUELVAS PRONTOSSSS!");
        
        
    }
}
