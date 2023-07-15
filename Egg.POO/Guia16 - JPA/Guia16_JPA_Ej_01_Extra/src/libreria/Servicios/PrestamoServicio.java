package libreria.Servicios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.Persistencia.ClienteDAO;
import libreria.Persistencia.LibroDAO;
import libreria.Persistencia.PrestamoDAO;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author Hector Cicutti
 */
public class PrestamoServicio {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static LibroServicio ls = new LibroServicio();
    private static PrestamoDAO pd = new PrestamoDAO();
    private static ClienteDAO cd = new ClienteDAO();
    private static LibroDAO ld = new LibroDAO();
    private static Cliente cli = null;
    private static Libro book = null;
    private static List<Libro> books = null;
    private static String fechaPrestamo;
    private static String fechaDevolucion;
    private static SimpleDateFormat fechaPrest = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat fechaDev = new SimpleDateFormat("dd/MM/yyyy");

    public void prestarLibros() {
        boolean salir;
        Long dni, isbn;
        do {
            dni = 0L;
            isbn = 0L;
            salir = false;
            int prestamo = 0;

            System.out.println("""
                       \nPRÉSTAMO DE LIBROS 
                       -----------------------------
                       """);
            System.out.print("Ingrese DNI: ");
            dni = read.nextLong();
            cli = new Cliente();
            cli = cd.buscarClientePorDocumento(dni);
            if (cli != null) {
                System.out.println("Cliente: " + cli.getApellido() + "  " + cli.getNombre() + " - Teléfono:  " + cli.getTelefono());
                System.out.print("Ingrese Fecha Préstamo (dd/mm/aaaa):  ");
                fechaPrestamo = read.next();
                
                System.out.print("Ingrese nombre de libro: ");
                try {
                    String titulo = read.next();
                    books = new ArrayList();
                    books = ld.buscarLibroPorTitulo(titulo);
                    if (!books.isEmpty()) {
                        ls.imprimirLibros(books);
                        if (books.size() > 1) {
                            System.out.print("\nIngrese ISBN: ");
                            isbn = read.nextLong();
                            books = new ArrayList();
                            book = ld.buscarLibroPorISBN(isbn);
                            books.add(book);
                            ls.imprimirLibros(books);
                        } else {
                            book = ld.buscarLibroPorISBN(books.get(0).getIsbn());
                        }
                        do {
                            System.out.printf("Ingrese cantidad a prestar (máximo %4s): ", book.getEjemplaresRestantes());

                            prestamo = read.nextInt();
                            if (prestamo >= book.getEjemplaresRestantes()) {

                                System.out.println("La cantidad a prestar es mayor a los que hay en Stock");
                            }
                        } while (prestamo >= book.getEjemplaresRestantes());
                        book.setEjemplaresPrestados(book.getEjemplaresPrestados() + prestamo);
                        book.setEjemplaresRestantes(book.getEjemplares() - book.getEjemplaresPrestados());
                        System.out.println("Restan " + book.getEjemplaresRestantes() + " ejemplares para prestar");
                        ld.modificarLibro(isbn, book);
                        Date fechaP = fechaPrest.parse(fechaPrestamo);
                        pd.actualizarPrestamo(new Prestamo(fechaP,book,cli));
                        
                        
                    } else {
                        System.out.println("No hay Libros con ese nombre");
                    }
                } catch (Exception e) {
                    System.out.println("Problemas-- > " + e.getMessage());
                }
            } else {
                System.out.println("No existe cliente con ese DNI");
            }
            System.out.println("Carga otro préstamo (SN)?: ");
            char sn = read.next().toUpperCase().charAt(0);
            if (sn == 'N') {
                salir = true;
            }
        } while (!salir);
    }
}
