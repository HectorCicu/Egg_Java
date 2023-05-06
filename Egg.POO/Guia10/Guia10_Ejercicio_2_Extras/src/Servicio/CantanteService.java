package Servicio;

import Entidad.Cantante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class CantanteService {

    private static Cantante cantor = new Cantante();
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static HashMap<String, Integer> album = new HashMap();

    public static void menu(HashMap<Integer, Cantante> singer) {
        cargoCantantes(singer);
        cargoAlbumes(singer);
        int opc;
        do {
            System.out.println("""
                              MENU PRINCIPAL
                              -----------------------
                              1) Alta Cantante
                              2) Carga discografía
                              3) Eliminar Cantante
                              4) Listar Cantante y Canciones
                              5) Salir
                              Opcion ---->    """);
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cargaCantante(singer);
                    break;
                case 2:
                    cargarDiscos(singer);
                    break;
                case 3:
                    break;
                case 4:
                    //listoAlgo(singer);
                    listarDiscografia(singer);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta - Intente nuevamente");
                    break;
            }
        } while (opc != 5);

    }

    public static void cargaCantante(HashMap<Integer, Cantante> singer) {

        Integer codCantante = 0;
        String nombre, nacion;
        char opcion;
        do {
            System.out.print("Código del Cantante:  ");
            codCantante = read.nextInt();
            if (singer.containsKey(codCantante)) {
                System.out.println("El código ya existe, intente con otro");
            } else {
                System.out.print("Nombre cantante: ");
                nombre = read.next();
                System.out.print("Nacionalidad: ");
                nacion = read.next();
                singer.put(codCantante, new Cantante(nombre, nacion));
            }
            System.out.print("Termina carga s/n: ");
            opcion = read.next().charAt(0);
        } while (opcion != 's' && opcion != 'S');

    }

    public static void cargarDiscos(HashMap<Integer, Cantante> singer) {

        Integer codCantante, anio;
        String disco;
        char opcion;
        album.clear();
        System.out.print("Código del Cantante:  ");
        codCantante = read.nextInt();
        if (!singer.containsKey(codCantante)) {
            System.out.println("El código No existe, intente con otro");
        } else {
            cantor = singer.get(codCantante);
            do {
                System.out.print("Ingrese disco: ");
                disco = read.next();
                System.out.print("Año de Lanzamiento: ");
                anio = read.nextInt();
                album.put(disco, anio);

                System.out.print("Termina carga s/n: ");
                opcion = read.next().charAt(0);
            } while (opcion != 's' && opcion != 'S');
            cantor.setDiscos(album);
            singer.put(codCantante, cantor);
        }

    }

    public static void listarDiscografia(HashMap<Integer, Cantante> singer) {
        for (Map.Entry<Integer, Cantante> cantante : singer.entrySet()) {
            cantor = cantante.getValue();

            HashMap<String, Integer> cantaAlbums = new HashMap<>();
            cantaAlbums = cantor.getDiscos();
            for (Map.Entry<String, Integer> albumes : cantaAlbums.entrySet()) {
                System.out.println(cantor.getNombre() + " " + cantor.getNacionalidad() + " " + albumes.getKey() + " " + albumes.getValue());
            }
        }
    }

    public static void listoAlgo(HashMap<Integer, Cantante> singer) {
        for (Map.Entry<Integer, Cantante> cantante : singer.entrySet()) {
            System.out.println(cantante);
        }
    }

    public static void cargoCantantes(HashMap<Integer, Cantante> singer) {
        singer.put(9999, new Cantante("Led Zeppelin", "Inglaterra"));
        singer.put(9998, new Cantante("Queen", "Inglaterra"));
        singer.put(9997, new Cantante("The Who", "EEUU"));
        singer.put(9996, new Cantante("Metallica", "EEUU"));
        singer.put(9995, new Cantante("Tame Impala", "Australia"));
        singer.put(9994, new Cantante("RHCP", "EEUU"));
        singer.put(9993, new Cantante("INXS", "Australia"));
        singer.put(9992, new Cantante("Eric Clapton", "Inglaterra"));
        singer.put(9991, new Cantante("Joe Bonamassa", "EEUU"));
        singer.put(9990, new Cantante("U2", "Irlanda"));
        singer.put(9989, new Cantante("Pink Floyd", "Inglaterra"));
        singer.put(9988, new Cantante("Willy Nelson", "EEUU"));
        singer.put(9987, new Cantante("Serú Girán", "Argentina"));
        singer.put(9987, new Cantante("Divididos", "Argentina"));

    }

    public static void eliminaCantante(HashMap<Integer, Cantante> singer) {
        Integer codCantante;
        char opcion;
        album.clear();
        System.out.print("Código del Cantante:  ");
        codCantante = read.nextInt();
        if (!singer.containsKey(codCantante)) {
            System.out.println("El código No existe, intente con otro");
        } else {
            singer.remove(codCantante);
            System.out.println("\nEl Cantante fue eliminado - Pulse una tecla");
            read.next();
        }
    }

    public static void cargoAlbumes(HashMap<Integer, Cantante> singer) {

        album.clear();
        Cantante canta = singer.get(9999);
        HashMap<String, Integer> cantaAlbums = new HashMap<>();
        cantaAlbums.put("Led Zeppelin", 1969);
        cantaAlbums.put("Led Zeppelin II", 1969);
        cantaAlbums.put("Led Zeppelin III", 1970);
        cantaAlbums.put("Led Zeppelin IV", 1971);
        cantaAlbums.put("Houses of the Holy", 1973);
        cantaAlbums.put("Physical Graffiti", 1975);
        cantaAlbums.put("Presence", 1976);
        cantaAlbums.put("In Through the Out Door", 1979);
        cantaAlbums.put("Coda", 1982);

        canta.setDiscos(cantaAlbums);
        singer.put(9999, canta);

        Cantante queen = singer.get(9998);
        HashMap<String, Integer> queenAlbums = new HashMap<>();
        queenAlbums.put("Queen ", 1973);
        queenAlbums.put("Queen II ", 1974);
        queenAlbums.put("Sheer Heart Attack ", 1974);
        queenAlbums.put("A Night at the Opera ", 1975);
        queenAlbums.put("A Day at the Races ", 1976);
        queenAlbums.put("News of the World ", 1977);
        queenAlbums.put("Jazz ", 1978);
        queenAlbums.put("The Game ", 1980);
        queenAlbums.put("Flash Gordon ", 1980);
        queenAlbums.put("Hot Space ", 1982);
        queenAlbums.put("The Works ", 1984);
        queenAlbums.put("A Kind of Magic ", 1986);
        queenAlbums.put("The Miracle ", 1989);
        queenAlbums.put("Innuendo ", 1991);
        queenAlbums.put("Made in Heaven ", 1995);

        queen.setDiscos(queenAlbums);
        singer.put(9998, queen);
    }

}
