package Servicios;

import Entidades.Cine;
import Entidades.CineUbicaciones;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Salas;
import Utilidades.Utilidades;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.LinkedList;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Servicios {

    // private static Scanner read = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    private static Utilidades ut = new Utilidades();
    private static Salas salas = new Salas();
    private static HashMap<String, Cine> salasTodas = new HashMap();
    private static LinkedList<CineUbicaciones> cuAuxiliar = new LinkedList<>();
    private static ArrayList<Espectador> espectador = new ArrayList<>();

    public static void menu() {
        Integer opc;
        Character opcion;
        boolean salir = false;
        do {
            System.out.println("""
                           \nMENU PRINCIPAL
                           ----------------------
                           1 - Cargar Películas
                           2 - Mostrar Cartelera
                           3 - Ver Ubicaciones
                           4 - Comprar Entradas
                           5 - Generar Peliculas
                           6 - Generar Personas
                           7 - Ubicar Personas en Película
                           8 - Salir
                           """);
            System.out.print("Opcion: ");
            opc = read.nextInt();
            switch (opc) {
                case 1 ->
                    cargaPelicula();
                case 2 ->
                    mostrarPeliculas(salasTodas);
                case 3 ->
                    mostrarUbicaciones();
                case 4 ->
                    comprarEntrada();
                case 5 ->
                    crearPeliculas();
                case 6 ->
                    generaPersonas();
                case 7 ->
                    System.out.println("Opción no disponible...");
                case 8 ->
                    salir = true;
                default ->
                    System.out.println("Opción Incorrecta \n");
            }
        } while (!salir);
    }

    public static void cargaPelicula() {

        // read.next();
        boolean salir = false;
        char sino;
        do {

            Cine cine = new Cine();
            CineUbicaciones cu = new CineUbicaciones();
            Pelicula movie = new Pelicula();

            System.out.println("CARGAR PELICULAS");
            System.out.print("Título: ");
            String titulo = read.next();
            System.out.print("Director: ");
            String director = read.next();
            System.out.print("Duración ");
            Integer duracion = read.nextInt();
            System.out.print("Precio Entrada $: ");
            Integer precio = read.nextInt();
            System.out.print("Edad mínima: ");
            Integer edadMin = read.nextInt();

            do {
                System.out.print("Desea cargar otra película S/N ?");

                sino = read.next().charAt(0);
                if (Character.toLowerCase(sino) == 'n') {
                    salir = true;
                }
            } while (Character.toLowerCase(sino) != 'n' && Character.toLowerCase(sino) != 's');
            movie = new Pelicula(titulo, director, duracion, precio, edadMin);

            cine = new Cine(movie, ut.definirUbicaciones(cu));  // ver
            //muestraUbicaciones(ut.definirUbicaciones(cu));
            //read.next();
//            System.out.println(cine.toString());
            salasTodas.put(titulo, cine);
//            System.out.println("----------------------------");
//            System.out.println(salasTodas.toString());

        } while (!salir);
        salas.setSala(salasTodas);
        // System.out.println("salas " + salas.toString());
    }

    public static void comprarEntrada() {
        Integer edades, costoPeli, filaE;
        int ubicacion = 0;
        Character colE;
        Cine cineAux = new Cine();
        Pelicula peliAux = new Pelicula();
        boolean salir = true;

        if (salasTodas.isEmpty()) {
            System.out.println("NO HAY PELICULAS  EN CARTELERA");
        } else {
            System.out.println(" ***** CARTELERA *****");
            mostrarPeliculas(salasTodas);
            do {

                CineUbicaciones cuAux = new CineUbicaciones();
                System.out.print("Película (con la palabra ' cero '  sale): ");
                String titulo = read.next();
                if (titulo.equalsIgnoreCase("cero")) {
                    return;
                }
                if (salasTodas.containsKey(titulo)) {

                    System.out.print("Nombre: ");
                    String nombre = read.next();
                    System.out.print("Edad: ");
                    Integer edad = read.nextInt();
                    System.out.print("Dinero disponible $: ");
                    Integer money = read.nextInt();
                    cineAux = salasTodas.get(titulo);
                    peliAux = cineAux.getPelicula();
                    if (peliAux.getEdadMinima() > edad || peliAux.getPrecioEntrada() > money) {
                        System.out.println("El dinero disponible o la edad no permiten comprar la entrada");
                    } else {
                        System.out.print("\nFila. Elegida  (1 a 8): ");
                        filaE = read.nextInt();
                        System.out.print("Columna elegida (A ... F): ");
                        colE = read.next().charAt(0);
                        colE = Character.toUpperCase(colE);

                        LinkedList<CineUbicaciones> linkCuAux = new LinkedList<>();
                        linkCuAux = cineAux.getCn();
                        cuAux = new CineUbicaciones(filaE, colE, 'X');

                        for (CineUbicaciones cineUbicaciones : linkCuAux) {
                            if (Objects.equals(cineUbicaciones.getFila(), filaE) && cineUbicaciones.getColumna() == Character.toUpperCase(colE)) {
                                ubicacion = linkCuAux.indexOf(cineUbicaciones);
                                if (cineUbicaciones.getOcupado() == ' ') {
                                    cineUbicaciones.setOcupado('X');
                                } else {
                                    System.out.println("Lo lamento, la butaca está ocupada");
                                }
                            }
                        }

                        System.out.print("Desea comprar otra entrada S/N: ");
                        Character otraEntrada = read.next().charAt(0);
                        if (Character.toUpperCase(otraEntrada) != 'S') {
                            salir = false;
                        }
                        if (!cuAuxiliar.isEmpty()) {
                            cuAuxiliar.clear();
                        }
//                    
//                    System.out.println("ubica " + ubicacion);
//                    for (CineUbicaciones cineUbicaciones : linkCuAux) {
//                        System.out.println(cineUbicaciones.toString());
//                    }
//                    System.out.println("size " + linkCuAux.size());
                        cuAuxiliar.addAll(linkCuAux);
                    }
                }

            } while (salir);
            // mostrarPeliculas(salasTodas);
// muestraUbicaciones(cineAux)
        }
    }

    public static void muestraUbicaciones(Cine sala) {
        int contador = 1;

        System.out.println("\n              Pelicula: " + sala.getPelicula().getTitulo());
        System.out.println("              ********************");
        System.out.println("              *                                     *");
        System.out.println("              *                                     *");
        System.out.println("              ********************");
        System.out.println("");
        for (CineUbicaciones ubic : sala.getCn()) {
            System.out.print("| " + ubic.getFila() + " " + ubic.getColumna() + "  |" + ubic.getOcupado() + "  |");
            if (contador % 6 == 0) {
                System.out.println("");
            }
            contador++;
        }
    }

    public static void mostrarPeliculas(HashMap<String, Cine> salas) {

        for (Map.Entry<String, Cine> entry : salas.entrySet()) {
            Cine cines = new Cine();
            cines = entry.getValue();
            System.out.println("Titulo: " + cines.getPelicula().getTitulo() + "   -  Director: " + cines.getPelicula().getDirector()
                    + "   -  Duración:  " + cines.getPelicula().getDuracion() + " min.  -  Apta para mayores de "
                    + cines.getPelicula().getEdadMinima() + " años   - Valor entrada $ " + cines.getPelicula().getPrecioEntrada());
        }
        System.out.println("\nPulse ENTER para continuar");
        read.next();
    }

    public static void crearPeliculas() {
        salasTodas.putAll(ut.creaPeliculas());
    }

    public static void generaPersonas() {
        int cant;
        System.out.print("Cantidad de espectadores a cargar: ");
        cant = read.nextInt();
        espectador.addAll(Utilidades.crearPersonas(cant));
        System.out.println("Personas creadas. ---  Pulse ENTER para continuar");
        read.next();
    }

    public static void mostrarUbicaciones() {
        String peli;
        System.out.println("PELICULAS DISPONIBLES\n");
        mostrarPeliculas(salasTodas);
        System.out.print("\n Seleccione una Película para ver las ubicaciones: ");
        peli = read.next();
        if (salasTodas.containsKey(peli)) {
            muestraUbicaciones(salasTodas.get(peli));

        } else {
            System.out.println("No existe esa película... Pulse una tecla para salir");
            read.next();
        }

    }
}
