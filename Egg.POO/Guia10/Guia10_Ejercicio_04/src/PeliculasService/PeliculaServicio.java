package PeliculasService;

import Peliculas.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 *
 * @author Hector Cicutti
 */
public class PeliculaServicio {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static ArrayList<Pelicula> p1 = new ArrayList<>();
    private static Random rand = new Random();

    public static void menuPrincipal() {
        int opcion, pelis;
        boolean continua = true;
        do {
            System.out.print("""
                         \nMENU PRINCIPAL
                         --------------
                         1) Cargar Peliculas
                         2) Listar todas las películas
                         3) Listar Peliculas con duración de más de 1 hora
                         4) Listar peliculas por duración (Ascendente)
                         5) Listar peliculas ordenadas alfabéticamente por título
                         6) Listar películas ordenadas alfabéticamente por Director
                         7) Carga masiva de películas
                         8) Salir
                         Opcion: """);
            do {
                opcion = read.nextInt();
            } while (opcion < 1 || opcion > 8);

            switch (opcion) {
                case 1 -> {
                    altaPeliculas();

                }
                case 2 -> {
                    listarPeliculas(0);
                }
                case 3 -> {
                    listarPeliculas(1);
                }
                case 4 -> {
                    p1.sort(Pelicula.ordenarMenorDuracion);
                    listarPeliculas(0);
                }
                case 5 -> {
                    p1.sort(Pelicula.ordenarTitulo);
                    listarPeliculas(0);
                }
                case 6 -> {
                    p1.sort(Pelicula.ordenarDirector);
                    listarPeliculas(0);
                }
                case 7 -> {
                    System.out.print("Cantidad de películas a cargar: ");
                    cargarVariasPeliculas(read.nextInt());
                }
                case 8 -> {
                    continua = false;
                }
            }
        } while (continua);
    }

    public static void altaPeliculas() {

        char opcion;
        boolean continua = false;
        String titul, direc;
        Double durac;
        System.out.println("\nCARGA DE PELICULAS");
        do {
            System.out.print("Título de la película: ");
            titul = read.next();
            System.out.print("Director: ");
            direc = read.next();
            System.out.print("Duración (en Horas):");
            durac = read.nextDouble();

            p1.add(new Pelicula(titul, direc, durac));
            System.out.print("\n Continua? (S/N)> ");
            opcion = read.next().charAt(0);

            if (Character.toUpperCase(opcion) == 'N') {
                continua = true;
            }
        } while (!continua);

    }

    public static void listarPeliculas(int t) {
        for (Pelicula pelicula : p1) {
            Pelicula a = pelicula;
            if (t == 1 && a.getDuracion() < 1) { // t= 1 >> lista las de duración mayor a 1 hora

                continue;
            } else {
                System.out.println(a.toString());
            }
        }
    }

    public static void cargarVariasPeliculas(int cant) {
        Double durac = 0.00;

        for (int i = 1; i <= cant; ++i) {

            p1.add(new Pelicula("Peli " + rand.nextInt(1000, 9000), "Carlos Chiquito" + rand.nextInt(10000, 999999), rand.nextDouble(0.01, 3.00)));
        }
    }

}
