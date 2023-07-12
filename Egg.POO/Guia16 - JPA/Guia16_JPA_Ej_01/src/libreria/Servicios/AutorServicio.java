package libreria.Servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import libreria.Persistencia.AutorDAO;
import libreria.entidades.Autor;

/**
 *
 * @author Hector Cicutti
 */
public class AutorServicio {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Random rand = new Random();
    private static String nombre;
    private static Autor autor = null;
    private static Integer id = 0;
    private static AutorDAO ad = new AutorDAO();
    private static List<Autor> autores = null;

    public void altaManual() throws Exception {

        System.out.println("ALTA AUTOR");
        try {

            System.out.print("Ingrese nombre: ");
            nombre = read.next();
            autores = new ArrayList();
            autores = ad.buscarAutorPorNombre(nombre);
            if (autores.isEmpty()) {
                autor = new Autor(nombre, true);
                ad.registrarAutor(autor);
                System.out.println("Se dio de alta al autor");
            } else {
                System.out.println("Autor/es con ese nombre ya existe/n ");
                for (Autor autore : autores) {
                    System.out.println("ID: " + autore.getId() + " --- Nombre: " + autore.getNombre());
                }
                System.out.print("Quiere darlo de alta igual? (S/N)");
                char sn = read.next().toUpperCase().charAt(0);
                if (sn == 'S') {
                    autor = new Autor(nombre, true);
                    ad.registrarAutor(autor);
                    System.out.println("Se dio de alta al autor");
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarPorNombre() {
        System.out.println("BUSCAR AUTOR POR NOMBRE");
        try {

            System.out.print("Ingrese nombre (puede ser parcial): ");
            nombre = read.next();
            autores = new ArrayList();
            autores = ad.buscarAutorPorNombre(nombre);
            if (autores.isEmpty()) {
                System.out.println("No existe ningún autor con nombre similar ");
            } else {
                System.out.println("AUTORES ENCONTRADOS");
                for (Autor autore : autores) {
                    System.out.println("ID: " + autore.getId() + " --- Nombre: " + autore.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }
        System.out.println("Pulse ENTER para continuar");
        var a = read.next();
    }

    public void eliminaAutor() throws Exception {

        System.out.println("Eliminar AUTOR");
        try {

            System.out.print("Ingrese ID: ");
            id = read.nextInt();
            autor = new Autor();
            autor = ad.buscarAutorPorId(id);
            if (Objects.equals(autor.getId(), id)) {
                ad.eliminarAutor(autor);
                System.out.println("Se eliminó el autor: " + autor.getNombre());

            } else {
                System.out.println("El Id del autor no existe ");
            }

        } catch (Exception e) {
            throw e;
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void modificarAutor() throws Exception {

        System.out.println("MODIFICAR AUTOR");
        try {

            System.out.print("Ingrese ID: ");
            id = read.nextInt();
            autor = new Autor();
            autor = ad.buscarAutorPorId(id);
            if (Objects.equals(autor.getId(), id)) {
                System.out.println("Autor :" + autor.getNombre());
                System.out.print("Ingrese Nuevo Nombre");
                nombre = read.next();
                autor.setNombre(nombre);

                ad.modificarAutor(autor);
                System.out.println("Autor  " + autor.getId() + "  -  " + autor.getNombre() + "  modificado.");

            } else {
                System.out.println("El Id del autor no existe ");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void ListaAutores() {
        autores = new ArrayList();
        autores = ad.listarAutorDAO();
        for (Autor autore : autores) {
            System.out.println("ID: " + autore.getId() + " --- Nombre: " + autore.getNombre());

        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void ListarAutores() {
        autores = new ArrayList();
        autores = ad.listarAutores();
        for (Autor autore : autores) {
            System.out.println("ID: " + autore.getId() + " --- Nombre: " + autore.getNombre());

        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void cargarMasivoAutor() throws Exception {
        ad.registrarAutor(new Autor("George Orwell", true));
        ad.registrarAutor(new Autor("Harper Lee", true));
        ad.registrarAutor(new Autor("F. Scott Fitzgerald", true));
        ad.registrarAutor(new Autor("J.D. Salinger", true));
        ad.registrarAutor(new Autor("William Golding", true));
        ad.registrarAutor(new Autor("Aldous Huxley", true));
        ad.registrarAutor(new Autor("J.R.R. Tolkien", true));
        ad.registrarAutor(new Autor("Kurt Vonnegut", true));
        ad.registrarAutor(new Autor("Joseph Heller", true));
        ad.registrarAutor(new Autor("Gabriel Garcia Marquez", true));
        ad.registrarAutor(new Autor("Oscar Wilde", true));
        ad.registrarAutor(new Autor("Arthur C. Clarke", true));
        ad.registrarAutor(new Autor("Douglas Adams", true));
        ad.registrarAutor(new Autor("Stephen King", true));
        ad.registrarAutor(new Autor("Dan Brown", true));
        ad.registrarAutor(new Autor("Stieg Larsson", true));
        ad.registrarAutor(new Autor("Suzanne Collins", true));
        ad.registrarAutor(new Autor("Paula Hawkins", true));
        ad.registrarAutor(new Autor("Kathryn Stockett", true));
        ad.registrarAutor(new Autor("Cormac McCarthy", true));
        ad.registrarAutor(new Autor("Alice Sebold", true));
        ad.registrarAutor(new Autor("Yann Martel", true));
        ad.registrarAutor(new Autor("Khaled Hosseini", true));
        ad.registrarAutor(new Autor("Sue Monk Kidd", true));
        ad.registrarAutor(new Autor("Barbara Kingsolver", true));
        ad.registrarAutor(new Autor("Rebecca Skloot", true));
        ad.registrarAutor(new Autor("Alice Walker", true));
        ad.registrarAutor(new Autor("Amy Tan", true));
        ad.registrarAutor(new Autor("Emily Bronte", true));
        ad.registrarAutor(new Autor("Jane Austen", true));
        ad.registrarAutor(new Autor("Charlotte Bronte", true));
        ad.registrarAutor(new Autor("Charles Dickens", true));
        ad.registrarAutor(new Autor("Louisa May Alcott", true));
        ad.registrarAutor(new Autor("Margaret Mitchell", true));
        ad.registrarAutor(new Autor("Mark Twain", true));
        ad.registrarAutor(new Autor("John Steinbeck", true));
        ad.registrarAutor(new Autor("Ernest Hemingway", true));
        ad.registrarAutor(new Autor("Sylvia Plath", true));
        ad.registrarAutor(new Autor("Nathaniel Hawthorne", true));
        ad.registrarAutor(new Autor("Herman Melville", true));
        ad.registrarAutor(new Autor("Bram Stoker", true));
        ad.registrarAutor(new Autor("Mary Shelley", true));
        ad.registrarAutor(new Autor("Robert Louis Stevenson", true));
        ad.registrarAutor(new Autor("Joseph Conrad", true));
        ad.registrarAutor(new Autor("Geoffrey Chaucer", true));
        ad.registrarAutor(new Autor("Miguel de Cervantes", true));
        ad.registrarAutor(new Autor("Dante Alighieri", true));
        ad.registrarAutor(new Autor("Victor Hugo", true));
        ad.registrarAutor(new Autor("Alexandre Dumas", true));
        ad.registrarAutor(new Autor("Gustave Flaubert", true));
        ad.registrarAutor(new Autor("Leo Tolstoy", true));
        ad.registrarAutor(new Autor("Fyodor Dostoevsky", true));
        ad.registrarAutor(new Autor("Aleksandr Solzhenitsyn", true));
        ad.registrarAutor(new Autor("Vladimir Nabokov", true));
    }
}
