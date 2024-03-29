package libreria.Servicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

import java.util.Scanner;
import javax.swing.JOptionPane;
import libreria.Persistencia.AutorDAO;
import libreria.Persistencia.EditorialDAO;
import libreria.Persistencia.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Hector Cicutti
 */
public class LibroServicio {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static String nombre;
    private static LibroDAO ld = new LibroDAO();
    private static Libro book = null;
    private static List<Libro> libros = null;
    private static List<Autor> autores = null;
    private static List<Editorial> editoriales = null;
    private static AutorDAO ad = new AutorDAO();
    private static EditorialDAO ed = new EditorialDAO();
    private static Integer id1;
    private static Autor autor1 = null;
    private static Editorial editorial = null;
    private static Long isbn;
    private static String titulo;
    private static Integer anio;
    private static Integer ejemplares;
    private static Integer ejemplaresPrestados;
    private static Integer ejemplaresRestantes;
    private static Boolean alta;
    private static char sn;
    private static boolean salir;

    public void altaLibro() throws Exception {
        do {
            salir = false;
            try {
                System.out.println("""
                               ALTA DE LIBROS
                               ---------------------""");
                try {                                                                               //ESTE TRY-CATCH ES SOLO PARA VALIDAR EL ISBN
                    System.out.print("Ingrese ISBN: ");
                    isbn = read.nextLong();
                } catch (InputMismatchException ime) {                     //ESTE TRY-CATCH ES SOLO PARA VALIDAR EL ISBN
                    JOptionPane.showMessageDialog(null, "Error - Debe ingresar un Número Entero válido" + ime.getMessage() + "\n" + ime.fillInStackTrace());
                    //System.out.println("Dato no Válido " + ime.getMessage());
                    read.next();
                }
                book = new Libro();
                book = ld.buscarLibroPorID(isbn);
                if (book != null) {
                    System.out.println("Ese libro ya existe. Verifique ISBN Cargado");
                    System.out.println("ISBN = " + book.getIsbn() + " - Nombre: " + book.getTitulo());
                } else {

                    System.out.print("Titulo del Libro................: ");
                    titulo = read.next();
                    System.out.print("Año de Publicación..........: ");
                    anio = read.nextInt();
                    System.out.print("Cantidad de Ejemplares..: ");
                    ejemplares = read.nextInt();
                    System.out.print("Ejemplares prestados .....: ");
                    ejemplaresPrestados = read.nextInt();
                    ejemplaresRestantes = ejemplares - ejemplaresPrestados;
                    alta = true;
                    autor1 = new Autor();
                    do {
                        System.out.print("ID Autor.............................: ");
                        id1 = read.nextInt();
                        autor1 = ad.buscarAutorPorId(id1);
                        if (autor1 == null) {
                            System.out.println("El ID del autor no existe");
                        } else {
                            System.out.println("Autor...............................: " + autor1.getNombre());
                            do {
                                id1 = 0;
                                editorial = new Editorial();
                                System.out.print("ID Editorial.....................: ");
                                id1 = read.nextInt();
                                editorial = ed.buscarEditorial(id1);
                                if (editorial == null) {
                                    System.out.println("No existe Editorial con ese ID");
                                } else {
                                    System.out.println("Editorial .....................: " + editorial.getNombre());
                                }

                            } while (editorial == null);
                        }
                    } while (autor1 == null);
                    ld.registrarLibro(new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor1, editorial));
                    System.out.println("Libro Ingresado!!");
                    System.out.print("Continúa carga de libros S/N ");
                    sn = read.next().toUpperCase().charAt(0);
                    if (sn == 'S') {
                        salir = true;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Error! " + e.getMessage() + e.fillInStackTrace());
            }
        } while (salir);

    }

    public void modificarLibros() throws Exception {
        do {
            salir = false;
            try {
                System.out.println("""
                               MODIFICACIÓN DE LIBROS
                               -----------------------------------""");
//              try {                                                                               //ESTE TRY-CATCH ES SOLO PARA VALIDAR EL ISBN
                System.out.print("Ingrese ISBN: ");
                isbn = read.nextLong();
//                } catch (InputMismatchException ime) {                     //ESTE TRY-CATCH ES SOLO PARA VALIDAR EL ISBN
//                    JOptionPane.showMessageDialog(null, "Error - Debe ingresar un Número Entero válido" + ime.getMessage() + "\n" + ime.fillInStackTrace());
//                    //System.out.println("Dato no Válido " + ime.getMessage());
//                    read.next();
                //               }
                book = new Libro();
                book = ld.buscarLibroPorID(isbn);
                if (!Objects.equals(book.getIsbn(), isbn)) {
                    System.out.println("Ese libro NO existe. Verifique ISBN Cargado");

                } else {
                    System.out.println("ISBN = " + book.getIsbn() + " - Nombre: " + book.getTitulo() + " - Autor :" + book.getAutor().getNombre()
                            + "\n Editorial: " + book.getEditorial().getNombre() + " -  Año: " + book.getAnio());

                    System.out.print("Titulo del Libro................: ");
                    titulo = read.next();
                    System.out.print("Año de Publicación..........: ");
                    anio = read.nextInt();
                    System.out.print("Cantidad de Ejemplares..: ");
                    ejemplares = read.nextInt();
                    System.out.print("Ejemplares prestados .....: ");
                    ejemplaresPrestados = read.nextInt();
                    ejemplaresRestantes = ejemplares - ejemplaresPrestados;
                    alta = true;
                    autor1 = new Autor();
                    do {
                        System.out.print("ID Autor.............................: ");
                        id1 = read.nextInt();
                        autor1 = ad.buscarAutorPorId(id1);
                        if (autor1 == null) {
                            System.out.println("El ID del autor no existe");
                        } else {
                            System.out.println("Autor...............................: " + autor1.getNombre());
                            do {
                                id1 = 0;
                                editorial = new Editorial();
                                System.out.print("ID Editorial.....................: ");
                                id1 = read.nextInt();
                                editorial = ed.buscarEditorial(id1);
                                if (editorial == null) {
                                    System.out.println("No existe Editorial con ese ID");
                                } else {
                                    System.out.println("Editorial .....................: " + editorial.getNombre());
                                }

                            } while (editorial == null);
                        }
                    } while (autor1 == null);
                    ld.modificarLibro(isbn, new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, autor1, editorial));
                    System.out.println("Libro Modificado!!");
                    System.out.print("Quiere modificar otro libro? S/N ");
                    sn = read.next().toUpperCase().charAt(0);
                    if (sn == 'S') {
                        salir = true;
                    }
                }
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, " Error! " + e.getMessage() + e.fillInStackTrace());
                System.out.println("ERROR !! " + e.getMessage() + "   --   " + e.fillInStackTrace());
            }
        } while (salir);
    }

    public void eliminarLibro() {
        do {
            salir = false;

            System.out.println("""
                               BAJA DE LIBROS
                               ---------------------""");
            try {
                System.out.print("Ingrese ISBN: ");
                isbn = read.nextLong();
                book = new Libro();
                book = ld.buscarLibroPorID(isbn);
                if (Objects.equals(book.getIsbn(), isbn)) {

                    System.out.println("ISBN = " + book.getIsbn() + " - Nombre: " + book.getTitulo() + " - Autor :" + book.getAutor().getNombre() + " -  Editorial: " + book.getEditorial().getNombre());
                    System.out.print("Desea darlo de baja (S/N): ");
                    sn = read.next().toUpperCase().charAt(0);
                    if (sn == 'S') {
                        ld.eliminarLibro(isbn);
                        System.out.println("Libro Eliminado!! pulse una tecla");
                        read.next();
                    }
                } else {
                    System.out.println("No existe ISBN en la base de datos");
                }
                System.out.println("Desean eliminar otro libro (S/N): ");
                sn = read.next().toUpperCase().charAt(0);
                if (sn != 'S') {
                    salir = true;
                }

            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "Error - Debe ingresar un Número Entero válido" + ime.getMessage() + "\n" + ime.fillInStackTrace());

                read.next();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error - Verifique mensaje" + e.getMessage() + "\n" + e.fillInStackTrace());
            }

        } while (salir);
    }

    public void listaLibros() {
        try {
            libros = new ArrayList();
            libros = ld.listarLibros();
            imprimirLibros(libros);
        } catch (Exception e) {
            throw e;
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void imprimirLibros(List<Libro> libros) {
        System.out.println("LISTADO DE LIBROS");
        System.out.println("--------------------------");
        System.out.println(" ISBN                                  Título                                     Año     Ejemp.   Prest.    Resto                          Autor                Editorial");
        for (Libro libro : libros) {
            System.out.printf("%-6s | %-50s | %-6d | %-6d | %-6d | %-6d | %-30s | %-30s\n", libro.getIsbn(), libro.getTitulo(), libro.getAnio(), libro.getEjemplares(),
                    libro.getEjemplaresPrestados(), libro.getEjemplaresRestantes(), libro.getAutor().getNombre(), libro.getEditorial().getNombre());
        }

    }

    public void buscarLibroxAutor() {
        try {
            System.out.println("\nBUSCAR LIBRO POR AUTOR");
            System.out.print("Ingrese nombre (puede ser parcial): ");
            nombre = read.next();
            libros = new ArrayList();
            libros = ld.buscarLibroPorAutor(nombre);
            if (!libros.isEmpty()) {
                System.out.println("LIBROS ENCONTRADOS");
                for (Libro libro : libros) {
                    System.out.println("ISBN = " + libro.getIsbn() + " - Nombre: " + libro.getTitulo() + " - Autor :" + libro.getAutor().getNombre()
                            + "\n Editorial: " + libro.getEditorial().getNombre() + " -  Año: " + libro.getAnio());
                }
            } else {
                System.out.println("NO SE HAN ENCONTRADO LIBROS CON ESE AUTOR");
            }
        } catch (Exception e) {
            throw e;
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void buscarLibroxEditorial() {
        try {
            System.out.println("\nBUSCAR LIBRO POR EDITORIAL");
            System.out.print("Ingrese nombre (puede ser parcial): ");
            nombre = read.next();
            libros = new ArrayList();
            libros = ld.buscarLibroPorEditorial(nombre);
            System.out.println("LIBROS ENCONTRADOS");
            for (Libro libro : libros) {
                System.out.println("ISBN = " + libro.getIsbn() + " - Nombre: " + libro.getTitulo() + " - Autor :" + libro.getAutor().getNombre() + " -  Editorial: " + libro.getEditorial().getNombre());
            }
        } catch (Exception e) {
            throw e;
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void bucaLibroPorISBN() {

        try {
            System.out.println("\nBUSCAR LIBRO POR ISBN");
            System.out.print("-------------------------------------------- ");
            System.out.print("Ingrese ISBN: ");
            isbn = read.nextLong();
            book = new Libro();
            book = ld.buscarLibroPorID(isbn);
            if (Objects.equals(book.getIsbn(), isbn)) {
                System.out.println("ISBN = " + book.getIsbn() + " - Nombre: " + book.getTitulo() + " - Autor :" + book.getAutor().getNombre() + " -  Editorial: " + book.getEditorial().getNombre());
            } else {
                System.out.println("No existe ISBN en la base de datos");
            }
        } catch (InputMismatchException ime) {
            JOptionPane.showMessageDialog(null, "Error - Debe ingresar un Número Entero válido" + ime.getMessage() + "\n" + ime.fillInStackTrace());

            read.next();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error - Verifique mensaje" + e.getMessage() + "\n" + e.fillInStackTrace());
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void altaLibrosMasivos() throws Exception {
        try {
            autores = new ArrayList();
            autores = ad.listarAutores();
            editoriales = new ArrayList();
            editoriales = ed.listaEditoriales();
            ld.registrarLibro(new Libro(3980L, "1984", 1960, 20, 0, 20, true, autores.get(0), editoriales.get(0)));
            ld.registrarLibro(new Libro(4568L, "To Kill a Mockingbird", 1960, 22, 0, 22, true, autores.get(1), editoriales.get(1)));
            ld.registrarLibro(new Libro(4592L, "The Great Gatsby", 1964, 24, 0, 24, true, autores.get(2), editoriales.get(2)));
            ld.registrarLibro(new Libro(4616L, "Animal Farm", 1962, 26, 0, 26, true, autores.get(0), editoriales.get(3)));
            ld.registrarLibro(new Libro(4640L, "The Catcher in the Rye", 1963, 28, 0, 28, true, autores.get(3), editoriales.get(4)));
            ld.registrarLibro(new Libro(4664L, "Lord of the Flies", 1970, 30, 0, 30, true, autores.get(4), editoriales.get(5)));
            ld.registrarLibro(new Libro(4688L, "Brave New World", 1965, 32, 0, 32, true, autores.get(5), editoriales.get(6)));
            ld.registrarLibro(new Libro(4712L, "The Hobbit", 1974, 34, 0, 34, true, autores.get(6), editoriales.get(7)));
            ld.registrarLibro(new Libro(4736L, "The Lord of the Rings", 1967, 36, 0, 36, true, autores.get(6), editoriales.get(7)));
            ld.registrarLibro(new Libro(4760L, "Slaughterhouse-Five", 1968, 38, 0, 38, true, autores.get(7), editoriales.get(8)));
            ld.registrarLibro(new Libro(4784L, "Catch-22", 1980, 37, 0, 37, true, autores.get(8), editoriales.get(9)));
            ld.registrarLibro(new Libro(4808L, "One Hundred Years of Solitude", 1970, 36, 0, 36, true, autores.get(9), editoriales.get(10)));
            ld.registrarLibro(new Libro(4832L, "The Picture of Dorian Gray", 1984, 35, 0, 35, true, autores.get(10), editoriales.get(11)));
            ld.registrarLibro(new Libro(4856L, "2001: A Space Odyssey", 1972, 34, 0, 34, true, autores.get(11), editoriales.get(12)));
            ld.registrarLibro(new Libro(4880L, "The Hitchhiker's Guide to the Galaxy", 1973, 33, 0, 33, true, autores.get(12), editoriales.get(13)));
            ld.registrarLibro(new Libro(4904L, "The Shining", 1990, 32, 0, 32, true, autores.get(13), editoriales.get(14)));
            ld.registrarLibro(new Libro(4928L, "It", 1975, 31, 0, 31, true, autores.get(13), editoriales.get(15)));
            ld.registrarLibro(new Libro(4952L, "The Stand", 1994, 30, 0, 30, true, autores.get(13), editoriales.get(14)));
            ld.registrarLibro(new Libro(4976L, "The Da Vinci Code", 1977, 29, 0, 29, true, autores.get(14), editoriales.get(14)));
            ld.registrarLibro(new Libro(5000L, "The Girl with the Dragon Tattoo", 1978, 28, 0, 28, true, autores.get(15), editoriales.get(16)));
            ld.registrarLibro(new Libro(5024L, "The Hunger Games", 2000, 27, 0, 27, true, autores.get(16), editoriales.get(17)));
            ld.registrarLibro(new Libro(5048L, "The Girl on the Train", 1980, 26, 0, 26, true, autores.get(17), editoriales.get(14)));
            ld.registrarLibro(new Libro(5072L, "The Help", 2004, 25, 0, 25, true, autores.get(18), editoriales.get(18)));
            ld.registrarLibro(new Libro(5096L, "The Road", 1982, 24, 0, 24, true, autores.get(19), editoriales.get(19)));
            ld.registrarLibro(new Libro(5120L, "The Lovely Bones", 1983, 23, 0, 23, true, autores.get(20), editoriales.get(4)));
            ld.registrarLibro(new Libro(5144L, "Life of Pi", 2010, 22, 0, 22, true, autores.get(21), editoriales.get(20)));
            ld.registrarLibro(new Libro(5168L, "The Kite Runner", 1985, 21, 0, 21, true, autores.get(22), editoriales.get(21)));
            ld.registrarLibro(new Libro(5192L, "A Thousand Splendid Suns", 2014, 20, 0, 20, true, autores.get(22), editoriales.get(21)));
            ld.registrarLibro(new Libro(5216L, "The Help", 1987, 19, 0, 19, true, autores.get(18), editoriales.get(18)));
            ld.registrarLibro(new Libro(5240L, "The Secret Life of Bees", 1988, 21, 0, 21, true, autores.get(23), editoriales.get(15)));
            ld.registrarLibro(new Libro(5264L, "The Poisonwood Bible", 2020, 23, 0, 23, true, autores.get(24), editoriales.get(22)));
            ld.registrarLibro(new Libro(5288L, "The Immortal Life of Henrietta Lacks", 1990, 25, 0, 25, true, autores.get(25), editoriales.get(23)));
            ld.registrarLibro(new Libro(5312L, "The Color Purple", 1991, 27, 0, 27, true, autores.get(26), editoriales.get(24)));
            ld.registrarLibro(new Libro(5336L, "The Joy Luck Club", 1992, 29, 0, 29, true, autores.get(27), editoriales.get(25)));
            ld.registrarLibro(new Libro(5360L, "Wuthering Heights", 1993, 31, 0, 31, true, autores.get(28), editoriales.get(26)));
            ld.registrarLibro(new Libro(5384L, "Pride and Prejudice", 1994, 33, 0, 33, true, autores.get(29), editoriales.get(27)));
            ld.registrarLibro(new Libro(5408L, "Jane Eyre", 1995, 35, 0, 35, true, autores.get(30), editoriales.get(28)));
            ld.registrarLibro(new Libro(5432L, "Sense and Sensibility", 1996, 37, 0, 37, true, autores.get(29), editoriales.get(27)));
            ld.registrarLibro(new Libro(5456L, "Emma", 1997, 39, 0, 39, true, autores.get(29), editoriales.get(29)));
            ld.registrarLibro(new Libro(5480L, "Persuasion", 1998, 41, 0, 41, true, autores.get(29), editoriales.get(29)));
            ld.registrarLibro(new Libro(5504L, "Great Expectations", 1999, 43, 0, 43, true, autores.get(31), editoriales.get(30)));
            ld.registrarLibro(new Libro(5528L, "Oliver Twist", 2000, 45, 0, 45, true, autores.get(31), editoriales.get(31)));
            ld.registrarLibro(new Libro(5552L, "David Copperfield", 2001, 47, 0, 47, true, autores.get(31), editoriales.get(32)));
            ld.registrarLibro(new Libro(5576L, "A Tale of Two Cities", 2002, 49, 0, 49, true, autores.get(31), editoriales.get(30)));
            ld.registrarLibro(new Libro(5600L, "Little Women", 2003, 51, 0, 51, true, autores.get(32), editoriales.get(33)));
            ld.registrarLibro(new Libro(5624L, "Gone with the Wind", 2004, 50, 0, 50, true, autores.get(33), editoriales.get(34)));
            ld.registrarLibro(new Libro(5648L, "The Adventures of Tom Sawyer", 2005, 49, 0, 49, true, autores.get(34), editoriales.get(6)));
            ld.registrarLibro(new Libro(5672L, "The Adventures of Huckleberry Finn", 2006, 48, 0, 48, true, autores.get(34), editoriales.get(35)));
            ld.registrarLibro(new Libro(5696L, "The Grapes of Wrath", 2007, 47, 0, 47, true, autores.get(35), editoriales.get(15)));
            ld.registrarLibro(new Libro(5720L, "Of Mice and Men", 2008, 46, 0, 46, true, autores.get(35), editoriales.get(39)));
            ld.registrarLibro(new Libro(5744L, "East of Eden", 2009, 45, 0, 45, true, autores.get(35), editoriales.get(15)));
            ld.registrarLibro(new Libro(5768L, "The Old Man and the Sea", 2010, 44, 0, 44, true, autores.get(36), editoriales.get(2)));
            ld.registrarLibro(new Libro(5792L, "For Whom the Bell Tolls", 2011, 43, 0, 43, true, autores.get(36), editoriales.get(2)));
            ld.registrarLibro(new Libro(5816L, "The Sun Also Rises", 2012, 42, 0, 42, true, autores.get(36), editoriales.get(38)));
            ld.registrarLibro(new Libro(5840L, "The Bell Jar", 2013, 41, 0, 41, true, autores.get(37), editoriales.get(39)));
            ld.registrarLibro(new Libro(5864L, "The Picture of Dorian Gray", 2014, 40, 0, 40, true, autores.get(10), editoriales.get(0)));
            ld.registrarLibro(new Libro(5888L, "The Scarlet Letter", 2015, 39, 0, 39, true, autores.get(38), editoriales.get(40)));
            ld.registrarLibro(new Libro(5912L, "Moby-Dick", 2016, 38, 0, 38, true, autores.get(39), editoriales.get(41)));
            ld.registrarLibro(new Libro(5936L, "Dracula", 1894, 37, 0, 37, true, autores.get(40), editoriales.get(42)));
            ld.registrarLibro(new Libro(5960L, "Frankenstein", 1893, 36, 0, 36, true, autores.get(41), editoriales.get(43)));
            ld.registrarLibro(new Libro(5984L, "The Strange Case of Dr. Jekyll and Mr. Hyde", 1892, 35, 0, 35, true, autores.get(42), editoriales.get(44)));
            ld.registrarLibro(new Libro(6008L, "Heart of Darkness", 1891, 34, 0, 34, true, autores.get(43), editoriales.get(45)));
            ld.registrarLibro(new Libro(6032L, "The Picture of Dorian Gray", 1890, 33, 0, 33, true, autores.get(10), editoriales.get(46)));
            ld.registrarLibro(new Libro(6056L, "The Canterbury Tales", 1889, 32, 0, 32, true, autores.get(44), editoriales.get(47)));
            ld.registrarLibro(new Libro(6080L, "Don Quixote", 1888, 31, 0, 31, true, autores.get(45), editoriales.get(48)));
            ld.registrarLibro(new Libro(6104L, "The Divine Comedy", 1887, 33, 0, 33, true, autores.get(46), editoriales.get(49)));
            ld.registrarLibro(new Libro(6128L, "Les Misérables", 1886, 35, 0, 35, true, autores.get(47), editoriales.get(50)));
            ld.registrarLibro(new Libro(6152L, "The Three Musketeers", 1885, 37, 0, 37, true, autores.get(48), editoriales.get(51)));
            ld.registrarLibro(new Libro(6176L, "Madame Bovary", 1884, 39, 0, 39, true, autores.get(49), editoriales.get(52)));
            ld.registrarLibro(new Libro(6200L, "Anna Karenina", 1883, 41, 0, 41, true, autores.get(50), editoriales.get(53)));
            ld.registrarLibro(new Libro(6224L, "War and Peace", 1882, 43, 0, 43, true, autores.get(50), editoriales.get(53)));
            ld.registrarLibro(new Libro(6248L, "Crime and Punishment", 1881, 45, 0, 45, true, autores.get(51), editoriales.get(53)));
            ld.registrarLibro(new Libro(6272L, "The Brothers Karamazov", 1880, 47, 0, 47, true, autores.get(51), editoriales.get(53)));
            ld.registrarLibro(new Libro(6296L, "One Day in the Life of Ivan Denisovich", 1879, 49, 0, 49, true, autores.get(52), editoriales.get(54)));
            ld.registrarLibro(new Libro(6320L, "Lolita", 1999, 51, 0, 51, true, autores.get(53), editoriales.get(55)));
        } catch (Exception e) {
            throw e;
        }
    }

}
