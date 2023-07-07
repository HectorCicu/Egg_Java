package libreria.Servicios;

import java.util.ArrayList;
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

    }

    public void ListaAutores() {
        autores = new ArrayList();
        autores = ad.listarAutorDAO();
        for (Autor autore : autores) {
            System.out.println("ID: " + autore.getId() + " --- Nombre: " + autore.getNombre());

        }
    }

    public void cargarMasivoAutor() throws Exception {
        ad.registrarAutor(new Autor(" George Orwell", true));
        ad.registrarAutor(new Autor(" Truman Capote", true));
        ad.registrarAutor(new Autor(" Gabriel García Márquez", true));
        ad.registrarAutor(new Autor(" Fiodor Dostoievski", true));
        ad.registrarAutor(new Autor(" Charles Dickens", true));
        ad.registrarAutor(new Autor(" Miguel  Cervantes", true));
        ad.registrarAutor(new Autor(" Bram Stoker", true));
        ad.registrarAutor(new Autor(" Alejandro Dumas", true));
        ad.registrarAutor(new Autor(" F. Scott Fitzgerald", true));
        ad.registrarAutor(new Autor(" J.D. Salinger", true));
        ad.registrarAutor(new Autor(" H.G. Wells", true));
        ad.registrarAutor(new Autor(" Noah Gordon", true));
        ad.registrarAutor(new Autor(" Umberto Eco", true));
        ad.registrarAutor(new Autor(" Patrick Süskind", true));
        ad.registrarAutor(new Autor(" Oscar Wil", true));
        ad.registrarAutor(new Autor(" William Faulkner", true));
        ad.registrarAutor(new Autor(" J.R.R. Tolkien", true));
        ad.registrarAutor(new Autor(" Ernesto Sábato", true));
        ad.registrarAutor(new Autor(" Marcel Proust", true));
        ad.registrarAutor(new Autor(" Ray Bradbury", true));
        ad.registrarAutor(new Autor(" Mary Shelley", true));
        ad.registrarAutor(new Autor(" Isabel Allen", true));
        ad.registrarAutor(new Autor(" Mario Vargas Llosa", true));
        ad.registrarAutor(new Autor(" John Kennedy Toole", true));
        ad.registrarAutor(new Autor(" Dante Alighieri", true));
        ad.registrarAutor(new Autor(" Robert Louis Stevenson", true));
        ad.registrarAutor(new Autor(" Franz Kafka", true));
        ad.registrarAutor(new Autor(" Anthony Burgess", true));
        ad.registrarAutor(new Autor(" Homero", true));
        ad.registrarAutor(new Autor(" Leopoldo Alas Clarín", true));
        ad.registrarAutor(new Autor(" Carlos Ruiz Zafón", true));
        ad.registrarAutor(new Autor(" Julio Verne", true));
        ad.registrarAutor(new Autor(" Lewis Carroll", true));
        ad.registrarAutor(new Autor(" Arthur Conan Doyle", true));
        ad.registrarAutor(new Autor(" John Steinbeck", true));
        ad.registrarAutor(new Autor(" Victor Hugo", true));
        ad.registrarAutor(new Autor(" Ken Follett", true));
        ad.registrarAutor(new Autor(" Gustave Flaubert", true));
        ad.registrarAutor(new Autor(" Harper Lee", true));
        ad.registrarAutor(new Autor(" Arthur Goln", true));
        ad.registrarAutor(new Autor(" Herman Melville", true));
        ad.registrarAutor(new Autor(" Louisa May Alcott", true));
        ad.registrarAutor(new Autor(" Carmen Laforet", true));
        ad.registrarAutor(new Autor(" Jane Austen", true));
        ad.registrarAutor(new Autor(" Julio Cortázar", true));
        ad.registrarAutor(new Autor(" Stendhal", true));
        ad.registrarAutor(new Autor(" William Shakespeare", true));
        ad.registrarAutor(new Autor(" Hermann Hesse", true));
        ad.registrarAutor(new Autor(" Antonio Tabucchi", true));
        ad.registrarAutor(new Autor(" Irène Némirovsky", true));
        ad.registrarAutor(new Autor(" Mark Twain", true));
        ad.registrarAutor(new Autor(" Henry Miller", true));
        ad.registrarAutor(new Autor(" James Joyce", true));
        ad.registrarAutor(new Autor(" Aldous Huxley", true));
        ad.registrarAutor(new Autor(" Pablo Neruda", true));
        ad.registrarAutor(new Autor(" Laurence Sterne", true));
        ad.registrarAutor(new Autor("Robert Graves", true));
        ad.registrarAutor(new Autor("Roberto Bolaño", true));
    }
}
