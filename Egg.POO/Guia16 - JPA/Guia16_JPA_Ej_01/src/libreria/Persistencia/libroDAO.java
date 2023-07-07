package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Libro;

/**
 *
 * @author Hector Cicutti
 */
public class LibroDAO extends DAO<Libro> {

    private static Libro book = null;
    private static List<Libro> books = null;

    public void registrarLibro(Libro libro) throws Exception {
        super.grabar(libro);
    }

    public void eliminarLibro(Integer id) throws Exception {
        book = new Libro();
        book = buscarLibroPorID(id);
        super.eliminar(book);
    }

    public void modificarLibro(Integer id) {
        book = new Libro();
        book = buscarLibroPorID(id);
        super.modificar(book);
    }

    public Libro buscarLibroPorID(Integer Id) {
        super.conectar();
        book = em.find(Libro.class, Id);
        super.desconectar();
        return book;
    }

    public List<Libro> listarLibros() {
        try {
            super.conectar();
            books = new ArrayList();
            books = em.createQuery("libro.buscarTodos").getResultList();
            super.desconectar();
            return books;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorISBN(Long isbn) {
        try {
            super.conectar();
            books = new ArrayList();
            books = em.createQuery("libro.buscarPorISBN").setParameter("isbn", isbn).getResultList();
            super.desconectar();
            return books;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        try {
            super.conectar();
            books = new ArrayList();
            books = em.createQuery("libro.buscarPorTitulo")
                    .setParameter("titulo", titulo).getResultList();
            super.desconectar();
            return books;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorAutor(String nombreAutor) {
        try {
            conectar();

            TypedQuery<Libro> consulta = em.createQuery(
                    "libro.buscarPorAutor", Libro.class);
            consulta.setParameter("nombreAutor", nombreAutor);
            desconectar();
            return consulta.getResultList();

        } catch (Exception e) {
            desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorEditorial(String nombreEditorial) {
        try {
            conectar();
            TypedQuery<Libro> consulta = em.createQuery(
                    "SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre = :nombreAutor", Libro.class);
            consulta.setParameter("nombreAutor", nombreEditorial);
            desconectar();
            return consulta.getResultList();

        } catch (Exception e) {
            desconectar();
            throw e;
        }
    }

    public List<Libro> listarLibroDAO() {
        return super.listar("Libro");

    }
}
