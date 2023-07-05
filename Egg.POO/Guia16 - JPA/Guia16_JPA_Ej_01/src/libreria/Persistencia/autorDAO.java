package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Hector Cicutti
 */
public class AutorDAO extends DAO<Autor> {

    private static Autor autor = null;
    private static List<Autor> autores = null;

    public void registrarAutor(Autor autor) throws Exception {
        super.grabar(autor);
    }

    public void eliminarAutor(Integer id) throws Exception {

        autor = new Autor();
        autor = buscarAutorPorId(id);
        super.eliminar(autor);

    }
     public void modificarAutor(Integer id) throws Exception {

        autor = new Autor();
        autor = buscarAutorPorId(id);
        super.modificar(autor);

    }

    public Autor buscarAutorPorId(Integer Id) {
        try {
            autor = new Autor();
            super.conectar();
            autor = em.find(Autor.class, Id);
            super.desconectar();

        } catch (Exception e) {

            if (em.isOpen()) {
               super.desconectar();
            }
            throw e;
        }
        return autor;
    }
    
    public List<Autor> buscarAutorPorNombre(String nombre) {
        try {
            autores = new ArrayList();
            super.conectar();
            autores = em.createQuery("autor.buscarPorNombre").setParameter("name", nombre).getResultList();
            super.desconectar();

        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return autores;
    }

    public List<Autor> listarAutores() {
        try {
            super.conectar();
            autores = new ArrayList();
            autores = em.createQuery("autor.buscarTodos").getResultList();
        super.desconectar();
        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return autores;
    }
}
