package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import libreria.Servicios.AutorServicio;
import libreria.entidades.Libro;

/**
 *
 * @author Hector Cicutti
 */
public class LibroDAO extends DAO<Libro> {

    private static Libro book = null;
    private static List<Libro> books = null;
    private static AutorServicio as = new AutorServicio();

    public void registrarLibro(Libro libro) throws Exception {
        super.grabar(libro);
    }

    public void eliminarLibro(Long id) throws Exception {
        book = new Libro();
        book = buscarLibroPorID(id);
        super.eliminar(book);
    }

    public void modificarLibro(Long isbn, Libro lib) {
//        book = new Libro();
//        book = buscarLibroPorID(isbn);
//        book = lib;  
        super.modificar(lib);
    }

    public Libro buscarLibroPorID(Long Id) {
        super.conectar();
        book = super.em.find(Libro.class, Id);
        super.desconectar();
        return book;
    }

    public List<Libro> listarLibros() {
        try {
            super.conectar();
            books = new ArrayList();
            books = em.createNamedQuery("libro.buscarTodos").getResultList();
            super.desconectar();
            return books;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public Libro buscarLibroPorISBN(Long isbn) {
        try {
            super.conectar();
            book = new Libro();
            book = (Libro) em.createNamedQuery("libro.buscarPorISBN").setParameter("isbn", isbn).getSingleResult();
            super.desconectar();

        } catch (NoResultException nre) {
            book = null;
            super.desconectar();
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
        return book;
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        try {
            super.conectar();
            books = new ArrayList();
            books = em.createNamedQuery("libro.buscarPorTitulo")
                    .setParameter("titulo", "%" + titulo + "%").getResultList();
            super.desconectar();
            return books;
        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorAutor(String nombreAutor) {
        try {
            books = new ArrayList();
            super.conectar();

//            books= em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre", Libro.class) 
//                    .setParameter("nombre", "%"+ nombreAutor + "%").getResultList();
            books = em.createQuery("SELECT l FROM Libro l JOIN l.autor b WHERE b.nombre LIKE :nombre", Libro.class)
                    .setParameter("nombre", "%" + nombreAutor + "%").getResultList();
            super.desconectar();
            return books;

        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> buscarLibroPorEditorial(String nombreEditorial) {
        try {
            super.conectar();
            books = new ArrayList();

            books = em.createQuery("SELECT l FROM Libro l  WHERE l.editorial.nombre LIKE :nombre", Libro.class)
                    .setParameter("nombre", "%" + nombreEditorial + "%").getResultList();
            super.desconectar();
            return books;

        } catch (Exception e) {
            super.desconectar();
            throw e;
        }
    }

    public List<Libro> listarLibroDAO() {
        return super.listar("Libro");

    }
}
