package libreria.Persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Hector Cicutti
 */
public class autorDAO extends DAO<Autor> {

    private static Autor autor = null;
    private static List<Autor> autores = null;

    public void registrarAutor(Autor autor) throws Exception {
        super.grabar(autor);
    }

public void eliminarAutor( Integer id) throws Exception {
    
    autor = new Autor();
    autor  = buscarAutor(id);
    super.eliminar(autor);
    
}
    public Autor buscarAutor(Integer Id) {
        try {
            autor = new Autor();
            conectar();
            autor = em.find(Autor.class, Id);
            desconectar();

        } catch (Exception e) {

            if (em.isOpen()) {
                desconectar();
            }
        }
        return autor;
    }
}
