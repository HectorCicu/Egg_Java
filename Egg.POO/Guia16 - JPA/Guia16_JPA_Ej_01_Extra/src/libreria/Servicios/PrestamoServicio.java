package libreria.Servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
    private static List<Prestamo> prest = null;
    private static String fechaPrestamo;
    private static String fechaDevolucion;
    private static SimpleDateFormat fechaPrest = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat fechaDev = new SimpleDateFormat("dd/MM/yyyy");
    private static Integer idP;

    public void prestarLibros() throws ParseException, Exception {
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
            try {
                System.out.print("Ingrese DNI: ");
                dni = read.nextLong();
                cli = new Cliente();
                cli = cd.buscarClientePorDocumento(dni);
                if (cli != null) {
                    System.out.println("Cliente: " + cli.getApellido() + "  " + cli.getNombre() + " - Teléfono:  " + cli.getTelefono());
                    System.out.print("Ingrese Fecha Préstamo (dd/mm/aaaa):  ");
                    fechaPrestamo = read.next();

                    System.out.print("Ingrese nombre de libro: ");
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
                        pd.actualizarPrestamo(new Prestamo(fechaP, book, cli));

                    } else {
                        System.out.println("No hay Libros con ese nombre");
                    }
                } else {
                    System.out.println("No existe cliente con ese DNI");
                }
            } catch (Exception e) {
                System.out.println("Problemas-- > " + e.getMessage());
            }
            System.out.println("Carga otro préstamo (SN)?: ");
            char sn = read.next().toUpperCase().charAt(0);
            if (sn == 'N') {
                salir = true;
            }
        } while (!salir);
    }

    public void listaPrestamoxCliente() {
        boolean salir;
        Long dni;

        dni = 0L;
        salir = false;
        int prestamo = 0;
        try {
            System.out.println("""
                       \n PRÉSTAMOS POR CLIENTE 
                       ----------------------------------
                       """);
            System.out.print("Ingrese DNI: ");
            dni = read.nextLong();
            cli = new Cliente();
            cli = cd.buscarClientePorDocumento(dni);
            if (cli != null) {
                prest = new ArrayList();
                prest = pd.buscarPorCliente(dni);
                if (!prest.isEmpty()) {
                    imprimePrestamos(prest);
                } else {
                    System.out.println("No se encontraron operaciones para ese Cliente");
                }
            } else {
                System.out.println("No Existe cliente con ese DNI");
            }

        } catch (Exception e) {
            System.out.println("ERROR -> " + e.getMessage());
        }

    }

    public void imprimePrestamos(List<Prestamo> prestamo) {
        System.out.println("ID  |   Fecha Ret.        |Fecha Dev.|     Nombre                   | Apellido                     | Título\n");
        try {
            for (Prestamo p : prestamo) {

                System.out.printf("%-4s | %-16s | %-16s | %-30s | %-30s | %-40s\n", p.getId(),
                        p.getFechaPrestamo() != null ? new SimpleDateFormat("dd/MM/yyyy").format(p.getFechaPrestamo()) : "",
                        p.getFechaDevolucion() != null ? new SimpleDateFormat("dd/MM/yyyy").format(p.getFechaDevolucion()) : "",
                        p.getCliente().getNombre(),
                        p.getCliente().getApellido(), p.getLibro().getTitulo());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR - Verifique >  " + e.getMessage());
        }
    }

    public void devolverLibros() throws ParseException, Exception {
        boolean salir;
        Long dni;
        do {
            idP = 0;
            salir = false;
            int prestamo = 0;

            System.out.println("""
                       \nDEVOLUCIÓN DE LIBROS 
                       -----------------------------
                       """);
            try {
                Prestamo prs = new Prestamo();
                prest = new ArrayList();
                System.out.print("Ingrese DNI: ");
                dni = read.nextLong();
                cli = new Cliente();
                cli = cd.buscarClientePorDocumento(dni);
                if (cli != null) {
                    System.out.println("Cliente: " + cli.getApellido() + "  " + cli.getNombre() + " - Teléfono:  " + cli.getTelefono());
                    prest = new ArrayList();
                    prest = pd.buscarPorCliente(dni);
                    if (!prest.isEmpty()) {
                        idP = 0;
                        imprimePrestamos(prest);
                        System.out.println("\nIngrese ID de Préstamo");
                        idP = read.nextInt();
                        prs = pd.buscarPrestamoPorID(idP);
                        prest = new ArrayList();
                        prest.add(prs);
                        imprimePrestamos(prest);

                        System.out.print("\nIngrese Fecha Devolución (dd/mm/aaaa):  ");
                        fechaDevolucion = read.next();
                        Date fechaD = fechaPrest.parse(fechaDevolucion);
                        prs.setFechaDevolucion(fechaD);
                        pd.actualizarPrestamo(prs);
                        prs.getLibro().setEjemplaresPrestados(prs.getLibro().getEjemplaresPrestados() - 1);
                        prs.getLibro().setEjemplaresRestantes(prs.getLibro().getEjemplaresRestantes() + 1);

                    } else {
                        System.out.println("No se encontraron operaciones para ese Cliente");
                    }

                } else {
                    System.out.println("No existe cliente con ese DNI");
                }
            } catch (Exception e) {
                System.out.println("Problemas-- > " + e.getMessage());
            }
            System.out.println("Carga otro préstamo (SN)?: ");
            char sn = read.next().toUpperCase().charAt(0);
            if (sn == 'N') {
                salir = true;
            }
        } while (!salir);
    }
}
