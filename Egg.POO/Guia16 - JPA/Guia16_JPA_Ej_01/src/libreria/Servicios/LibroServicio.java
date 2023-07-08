package libreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
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
    private static List<Libro> libros = null;
    private static List<Autor> autores = null;
    private static List<Editorial> editoriales = null;
    private static AutorDAO ad = new AutorDAO();
    private static EditorialDAO ed = new EditorialDAO();
    private static Integer id1;
    private static Autor autor1 = null;
    private static Random rand = new Random();

    public void buscarLibroxAutor() {
        try {
            System.out.println("\nBUSCAR LIBRO POR AUTOR");
            System.out.print("Ingrese nombre (puede ser parcial): ");
            nombre = read.next();
//            autores = new ArrayList();
//            autores = ad.buscarAutorPorNombre(nombre);
//            if (!autores.isEmpty()) {
//                System.out.println("AUTORES ENCONTRADOS");
//                for (Autor autore : autores) {
//                    System.out.println("ID: " + autore.getId() + "  - Nombre: " + autore.getNombre());
//                }
//                System.out.println("");
//                System.out.print("Seleccione el ID del autor: ");
//                id1 = read.nextInt();
//                autor1 = new Autor();
//                autor1 = ad.buscarAutorPorId(id1);
                libros = new ArrayList();
                libros = ld.buscarLibroPorAutor(nombre);
                System.out.println("LIBROS ENCONTRADOS");
                for (Libro libro : libros) {
                    System.out.println(libro.toString());

                }

            
        } catch (Exception e) {
            throw e;
        }
    }

    public void altaLibrosMasivos() throws Exception {
        try {
            autores = new ArrayList();
            autores = ad.listarAutores();
            editoriales = new ArrayList();
            editoriales = ed.listaEditoriales();

            Long isbn = rand.nextLong();
            ld.registrarLibro(new Libro(3980L, "1984", 1960, 20, 0, 0, true, autores.get(0), editoriales.get(0)));
            ld.registrarLibro(new Libro(4568L, "To Kill a Mockingbird", 1960, 22, 0, 0, true, autores.get(1), editoriales.get(1)));
            ld.registrarLibro(new Libro(4592L, "The Great Gatsby", 1964, 24, 0, 0, true, autores.get(2), editoriales.get(2)));
            ld.registrarLibro(new Libro(4616L, "Animal Farm", 1962, 26, 0, 0, true, autores.get(0), editoriales.get(3)));
            ld.registrarLibro(new Libro(4640L, "The Catcher in the Rye", 1963, 28, 0, 0, true, autores.get(3), editoriales.get(4)));
            ld.registrarLibro(new Libro(4664L, "Lord of the Flies", 1970, 30, 0, 0, true, autores.get(4), editoriales.get(5)));
            ld.registrarLibro(new Libro(4688L, "Brave New World", 1965, 32, 0, 0, true, autores.get(5), editoriales.get(6)));
            ld.registrarLibro(new Libro(4712L, "The Hobbit", 1974, 34, 0, 0, true, autores.get(6), editoriales.get(7)));
            ld.registrarLibro(new Libro(4736L, "The Lord of the Rings", 1967, 36, 0, 0, true, autores.get(6), editoriales.get(7)));
            ld.registrarLibro(new Libro(4760L, "Slaughterhouse-Five", 1968, 38, 0, 0, true, autores.get(7), editoriales.get(8)));
            ld.registrarLibro(new Libro(4784L, "Catch-22", 1980, 40, 0, 0, true, autores.get(8), editoriales.get(9)));
            ld.registrarLibro(new Libro(4808L, "One Hundred Years of Solitude", 1970, 42, 0, 0, true, autores.get(9), editoriales.get(10)));
            ld.registrarLibro(new Libro(4832L, "The Picture of Dorian Gray", 1984, 44, 0, 0, true, autores.get(10), editoriales.get(11)));
            ld.registrarLibro(new Libro(4856L, "2001: A Space Odyssey", 1972, 46, 0, 0, true, autores.get(11), editoriales.get(12)));
            ld.registrarLibro(new Libro(4880L, "The Hitchhiker's Guide to the Galaxy", 1973, 48, 0, 0, true, autores.get(12), editoriales.get(13)));
            ld.registrarLibro(new Libro(4904L, "The Shining", 1990, 50, 0, 0, true, autores.get(13), editoriales.get(14)));
            ld.registrarLibro(new Libro(4928L, "It", 1975, 52, 0, 0, true, autores.get(13), editoriales.get(15)));
            ld.registrarLibro(new Libro(4952L, "The Stand", 1994, 54, 0, 0, true, autores.get(13), editoriales.get(14)));
            ld.registrarLibro(new Libro(4976L, "The Da Vinci Code", 1977, 56, 0, 0, true, autores.get(14), editoriales.get(14)));
            ld.registrarLibro(new Libro(5000L, "The Girl with the Dragon Tattoo", 1978, 58, 0, 0, true, autores.get(15), editoriales.get(16)));
            ld.registrarLibro(new Libro(5024L, "The Hunger Games", 2000, 60, 0, 0, true, autores.get(16), editoriales.get(17)));
            ld.registrarLibro(new Libro(5048L, "The Girl on the Train", 1980, 62, 0, 0, true, autores.get(17), editoriales.get(14)));
            ld.registrarLibro(new Libro(5072L, "The Help", 2004, 64, 0, 0, true, autores.get(18), editoriales.get(18)));
            ld.registrarLibro(new Libro(5096L, "The Road", 1982, 66, 0, 0, true, autores.get(19), editoriales.get(19)));
            ld.registrarLibro(new Libro(5120L, "The Lovely Bones", 1983, 68, 0, 0, true, autores.get(20), editoriales.get(4)));
            ld.registrarLibro(new Libro(5144L, "Life of Pi", 2010, 70, 0, 0, true, autores.get(21), editoriales.get(20)));
            ld.registrarLibro(new Libro(5168L, "The Kite Runner", 1985, 72, 0, 0, true, autores.get(22), editoriales.get(21)));
            ld.registrarLibro(new Libro(5192L, "A Thousand Splendid Suns", 2014, 74, 0, 0, true, autores.get(22), editoriales.get(21)));
            ld.registrarLibro(new Libro(5216L, "The Help", 1987, 76, 0, 0, true, autores.get(18), editoriales.get(18)));
            ld.registrarLibro(new Libro(5240L, "The Secret Life of Bees", 1988, 78, 0, 0, true, autores.get(23), editoriales.get(15)));
            ld.registrarLibro(new Libro(5264L, "The Poisonwood Bible", 2020, 80, 0, 0, true, autores.get(24), editoriales.get(22)));
            ld.registrarLibro(new Libro(5288L, "The Immortal Life of Henrietta Lacks", 1990, 82, 0, 0, true, autores.get(25), editoriales.get(23)));
            ld.registrarLibro(new Libro(5312L, "The Color Purple", 1991, 84, 0, 0, true, autores.get(26), editoriales.get(24)));
            ld.registrarLibro(new Libro(5336L, "The Joy Luck Club", 1992, 86, 0, 0, true, autores.get(27), editoriales.get(25)));
            ld.registrarLibro(new Libro(5360L, "Wuthering Heights", 1993, 88, 0, 0, true, autores.get(28), editoriales.get(26)));
            ld.registrarLibro(new Libro(5384L, "Pride and Prejudice", 1994, 90, 0, 0, true, autores.get(29), editoriales.get(27)));
            ld.registrarLibro(new Libro(5408L, "Jane Eyre", 1995, 92, 0, 0, true, autores.get(30), editoriales.get(28)));
            ld.registrarLibro(new Libro(5432L, "Sense and Sensibility", 1996, 94, 0, 0, true, autores.get(29), editoriales.get(27)));
            ld.registrarLibro(new Libro(5456L, "Emma", 1997, 96, 0, 0, true, autores.get(29), editoriales.get(29)));
            ld.registrarLibro(new Libro(5480L, "Persuasion", 1998, 98, 0, 0, true, autores.get(29), editoriales.get(29)));
            ld.registrarLibro(new Libro(5504L, "Great Expectations", 1999, 100, 0, 0, true, autores.get(31), editoriales.get(30)));
            ld.registrarLibro(new Libro(5528L, "Oliver Twist", 2000, 102, 0, 0, true, autores.get(31), editoriales.get(31)));
            ld.registrarLibro(new Libro(5552L, "David Copperfield", 2001, 104, 0, 0, true, autores.get(31), editoriales.get(32)));
            ld.registrarLibro(new Libro(5576L, "A Tale of Two Cities", 2002, 106, 0, 0, true, autores.get(31), editoriales.get(30)));
            ld.registrarLibro(new Libro(5600L, "Little Women", 2003, 108, 0, 0, true, autores.get(32), editoriales.get(33)));
            ld.registrarLibro(new Libro(5624L, "Gone with the Wind", 2004, 110, 0, 0, true, autores.get(33), editoriales.get(34)));
            ld.registrarLibro(new Libro(5648L, "The Adventures of Tom Sawyer", 2005, 112, 0, 0, true, autores.get(34), editoriales.get(6)));
            ld.registrarLibro(new Libro(5672L, "The Adventures of Huckleberry Finn", 2006, 114, 0, 0, true, autores.get(34), editoriales.get(35)));
            ld.registrarLibro(new Libro(5696L, "The Grapes of Wrath", 2007, 116, 0, 0, true, autores.get(35), editoriales.get(15)));
            ld.registrarLibro(new Libro(5720L, "Of Mice and Men", 2008, 118, 0, 0, true, autores.get(35), editoriales.get(39)));
            ld.registrarLibro(new Libro(5744L, "East of Eden", 2009, 120, 0, 0, true, autores.get(35), editoriales.get(15)));
            ld.registrarLibro(new Libro(5768L, "The Old Man and the Sea", 2010, 122, 0, 0, true, autores.get(36), editoriales.get(2)));
            ld.registrarLibro(new Libro(5792L, "For Whom the Bell Tolls", 2011, 124, 0, 0, true, autores.get(36), editoriales.get(2)));
            ld.registrarLibro(new Libro(5816L, "The Sun Also Rises", 2012, 126, 0, 0, true, autores.get(36), editoriales.get(38)));
            ld.registrarLibro(new Libro(5840L, "The Bell Jar", 2013, 128, 0, 0, true, autores.get(37), editoriales.get(39)));
            ld.registrarLibro(new Libro(5864L, "The Picture of Dorian Gray", 2014, 130, 0, 0, true, autores.get(10), editoriales.get(0)));
            ld.registrarLibro(new Libro(5888L, "The Scarlet Letter", 2015, 132, 0, 0, true, autores.get(38), editoriales.get(40)));
            ld.registrarLibro(new Libro(5912L, "Moby-Dick", 2016, 134, 0, 0, true, autores.get(39), editoriales.get(41)));
            ld.registrarLibro(new Libro(5936L, "Dracula", 1894, 136, 0, 0, true, autores.get(40), editoriales.get(42)));
            ld.registrarLibro(new Libro(5960L, "Frankenstein", 1893, 138, 0, 0, true, autores.get(41), editoriales.get(43)));
            ld.registrarLibro(new Libro(5984L, "The Strange Case of Dr. Jekyll and Mr. Hyde", 1892, 140, 0, 0, true, autores.get(42), editoriales.get(44)));
            ld.registrarLibro(new Libro(6008L, "Heart of Darkness", 1891, 142, 0, 0, true, autores.get(43), editoriales.get(45)));
            ld.registrarLibro(new Libro(6032L, "The Picture of Dorian Gray", 1890, 144, 0, 0, true, autores.get(10), editoriales.get(46)));
            ld.registrarLibro(new Libro(6056L, "The Canterbury Tales", 1889, 146, 0, 0, true, autores.get(44), editoriales.get(47)));
            ld.registrarLibro(new Libro(6080L, "Don Quixote", 1888, 148, 0, 0, true, autores.get(45), editoriales.get(48)));
            ld.registrarLibro(new Libro(6104L, "The Divine Comedy", 1887, 150, 0, 0, true, autores.get(46), editoriales.get(49)));
            ld.registrarLibro(new Libro(6128L, "Les Misérables", 1886, 152, 0, 0, true, autores.get(47), editoriales.get(50)));
            ld.registrarLibro(new Libro(6152L, "The Three Musketeers", 1885, 154, 0, 0, true, autores.get(48), editoriales.get(51)));
            ld.registrarLibro(new Libro(6176L, "Madame Bovary", 1884, 156, 0, 0, true, autores.get(49), editoriales.get(52)));
            ld.registrarLibro(new Libro(6200L, "Anna Karenina", 1883, 158, 0, 0, true, autores.get(50), editoriales.get(53)));
            ld.registrarLibro(new Libro(6224L, "War and Peace", 1882, 160, 0, 0, true, autores.get(50), editoriales.get(53)));
            ld.registrarLibro(new Libro(6248L, "Crime and Punishment", 1881, 162, 0, 0, true, autores.get(51), editoriales.get(53)));
            ld.registrarLibro(new Libro(6272L, "The Brothers Karamazov", 1880, 164, 0, 0, true, autores.get(51), editoriales.get(53)));
            ld.registrarLibro(new Libro(6296L, "One Day in the Life of Ivan Denisovich", 1879, 166, 0, 0, true, autores.get(52), editoriales.get(54)));
            ld.registrarLibro(new Libro(6320L, "Lolita", 1999, 168, 0, 0, true, autores.get(53), editoriales.get(55)));
        } catch (Exception e) {
            throw e;
        }
    }

}
