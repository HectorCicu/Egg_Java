package Utilidades;

import Entidades.Cine;
import Entidades.CineUbicaciones;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Hector Cicutti
 */
public class Utilidades {

    private static Random rand = new Random();

    public static LinkedList<CineUbicaciones> definirUbicaciones(CineUbicaciones cu) {

        LinkedList<CineUbicaciones> cineUbic = new LinkedList<>();

        Character co = ' ';

        for (Integer fil = 1; fil <= 8; fil++) {
            for (int fi = 1; fi <= 6; fi++) {
                switch (fi) {
                    case 1 ->
                        co = 'A';
                    case 2 ->
                        co = 'B';
                    case 3 ->
                        co = 'C';
                    case 4 ->
                        co = 'D';
                    case 5 ->
                        co = 'E';
                    case 6 ->
                        co = 'F';
                }
                cineUbic.add(new CineUbicaciones(fil, co));
            }
        }
        return cineUbic;
    }

    public static ArrayList<Espectador> crearPersonas(int cant) {
        ArrayList<Espectador> esp = new ArrayList<>();
        Integer cash;
        String nomb;
        Integer edad;
        for (int i = 1; i <= cant; i++) {
            nomb = "Juan Carlos " + 1;
            edad = rand.nextInt(12, 30);
            cash = rand.nextInt(1000, 2000);

            esp.add(new Espectador(nomb, edad, cash));
        }
        return esp;
    }

    public static HashMap<String, Cine> creaPeliculas() {
        HashMap<String, Cine> pelis = new HashMap<>();
        LinkedList<CineUbicaciones> cc = new LinkedList<>();
        CineUbicaciones cu = new CineUbicaciones();

        pelis.put("Die Hard", new Cine(new Pelicula("Die Hard", "Tom Jones", 123, 1300, 12), definirUbicaciones(cu)));
        pelis.put("Harry Potter", new Cine(new Pelicula("Harry Potter", "Samuel Craight", 130, 1200, 14), definirUbicaciones(cu)));
        pelis.put("John Wick", new Cine(new Pelicula("John Wick", "James Cameron", 145, 1400, 18), definirUbicaciones(cu)));
        //System.out.println("LE" + pelis.toString());
        System.out.println("Películas Generadas...");
        return pelis;
    }
}
