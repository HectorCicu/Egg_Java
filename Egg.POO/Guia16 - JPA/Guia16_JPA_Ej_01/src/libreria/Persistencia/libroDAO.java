package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Hector Cicutti
 */
public class libroDAO extends DAO<Libro> {

    private static Libro book = null;
    private static List<Libro> books = null;

    public void registrarLibro(Libro libro) throws Exception {
        super.grabar(libro);
    }

    public void eliminarLibro(Integer id) throws Exception {
        book = new Libro();
        book = buscarPorID(id);
        super.eliminar(book);
    }

    public void modificarLibro(Integer id) {
        book = new Libro();
        book = buscarPorID(id);
        super.modificar(book);
    }

    public Libro buscarPorID(Integer Id) {
        conectar();
        book = em.find(Libro.class, Id);
        desconectar();
        return book;
    }

    public List<Libro> listarLibros() {
        try {
            conectar();
            books = new ArrayList();
            books = em.createQuery("SELECT a FROM Libros a").getResultList();
            desconectar();
            return books;
        } catch (Exception e) {
            desconectar();
            throw e;
        }
    }
}
