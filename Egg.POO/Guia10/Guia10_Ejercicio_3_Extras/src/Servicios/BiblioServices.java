package Servicios;

import Libro.Libro;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class BiblioServices {

    private static Libro book = new Libro();
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static HashSet<Libro> bibl = new HashSet();

    public static void menu(HashSet<Libro> book1) {

        int opc;
        do {
            System.out.print("""
                              MENU PRINCIPAL
                              -----------------------
                              1) Alta Libros
                              2) Préstamo
                              3) Devolución
                              4) Listar Libros y Stock
                              5) Salir
                              Opcion ---->    """);
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cargaLibros(bibl);
                    break;
                case 2:
                    prestamos(bibl);
                    break;
                case 3:
                    //     eliminaCantante(singer);
                    break;
                case 4:
                    listaLibros(bibl);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta - Intente nuevamente");
                    break;
            }
        } while (opc != 5);

    }

    public static void cargaLibros(HashSet<Libro> book1) {
        char opc;
        String nomLibro;
        String autorLibro;
        Integer totalEjemplares;
        do {
            System.out.print("Nombre del Libro: ");
            nomLibro = read.next();
            System.out.print("Autor: ");
            autorLibro = read.next();
            System.out.print("Cantidad de Ejemplares: ");
            totalEjemplares = read.nextInt();
            book1.add(new Libro(nomLibro, autorLibro, totalEjemplares));
            do {

                System.out.print("Carga otro libro? S/N  ");
                opc = read.next().charAt(0);
            } while (Character.toLowerCase(opc) != 's' && Character.toLowerCase(opc) != 'n');
        } while (Character.toLowerCase(opc) == 's');
    }

    public static void prestamos(HashSet<Libro> book1) {
        Integer prestamo;
        String libroAPrestar;
        char opc;
        System.out.println("PRÉSTAMOS");
        System.out.print("Libro a Prestar: ");
        libroAPrestar = read.next();
        for (Libro libro : book1) {
            if (libro.getNombreLibro().contains(libroAPrestar)) {
                System.out.println("Libro: " + libro.getNombreLibro());
                System.out.println("Autor: " + libro.getAutorLibro());
                System.out.println("Ejemplares restantes " + (libro.getNroEjemplares() - libro.getEjemplaresPrestados()));
                do {
                    System.out.print("Ingrese cantidad a prestar ");

                    prestamo = read.nextInt();
                    if (prestamo > (libro.getNroEjemplares() - libro.getEjemplaresPrestados())) {
                        System.out.println("La cantidad ingresada es mayor a los ejemplares disponibles disponibles: ");
                    }
                } while (prestamo > (libro.getNroEjemplares() - libro.getEjemplaresPrestados()));
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + prestamo);
                System.out.println("Quedan en stock " + (libro.getNroEjemplares() - libro.getEjemplaresPrestados()) + "\n");
            }

        }

    }

    public static void listaLibros(HashSet<Libro> book1) {
        for (Libro libro : book1) {
            System.out.println(libro.toString());

        }
    }
}
