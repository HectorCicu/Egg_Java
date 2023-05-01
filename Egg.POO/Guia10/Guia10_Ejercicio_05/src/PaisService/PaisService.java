package PaisService;

import Paises.Pais;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Hector Cicutti
 */
public class PaisService {

    public static Comparator<Pais> ordenarPaises = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getPais().compareTo(p2.getPais());
        }

    };
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static TreeSet<Pais> pai = new TreeSet(ordenarPaises);

    public static void menuPrincipal() {
        int opcion, pais;
        boolean continua = true;
        do {
            System.out.print("""
                         \nMENU PRINCIPAL
                         --------------
                         1) Cargar Paises
                         2) Listar ordenados
                         3) Eliminar pais
                         4) Salir
                         Opcion: """);
            do {
                opcion = read.nextInt();
            } while (opcion < 1 || opcion > 8);

            switch (opcion) {
                case 1 -> {
                    altaPaises();

                }
                case 2 -> {
                    listarPaises();
                }
                case 3 -> {
                    borrarPais();
                }
                case 4 -> {
                    continua = false;
                }
            }
        } while (continua);
    }

    public static void altaPaises() {

        char opcion;
        boolean continua = true;
        String paises;
        Double durac;
        System.out.println("\nCARGA DE PAISES");
        do {
            System.out.print("Nombre ('fin') para terminar: ");
            paises = read.next();

            if (!paises.equalsIgnoreCase("fin")) {

                pai.add(new Pais(paises));

            } else {
                continua = false;
            }
        } while (continua);
    }

    public static void listarPaises() {
        System.out.println("\nPaises Cargados:");
        for (Pais pais : pai) {
            System.out.println(pais.toString());
        }
    }

    public static void borrarPais() {
        String paises;
        boolean encontro = false;
        Iterator<Pais> it = pai.iterator();
        System.out.print("Ingrese Pais a borrar:");
        paises = read.next();
        while (it.hasNext()) {
            Pais paisAux = it.next();
            if (paisAux.getPais().equalsIgnoreCase(paises)) {
                it.remove();
                System.out.println("\nPais: " + paises + " borrado de la lista");
            encontro = true;
            }
       

        }
        if (!encontro) {
            System.out.println("\nPais no encontrado\n\n");
        }
    }
}
