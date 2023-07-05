package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Hector Cicutti
 */
public class EditorialDAO extends DAO<Editorial> {
    
    private static Editorial editorial = null;
    private static List<Editorial> editoriales = null;
    
    public void guardarEditorial(Editorial e) throws Exception {
        super.grabar(e);
    }
    
    public void modificarEditorial(Integer id) {
         try {
            editorial = new Editorial();
            editorial = buscarEditorial(id);
            super.modificar(editorial);
        } catch (Exception e) {
            if (em.isOpen()) {
                em.close();
                throw e;
            }
        }
    }
    
    public void eliminarEditorial(Integer id) throws Exception {
        try {
            editorial = new Editorial();
            editorial = buscarEditorial(id);
            super.eliminar(editorial);
        } catch (Exception e) {
            if (em.isOpen()) {
                em.close();
                throw e;
            }
        }
    }
    
    public Editorial buscarEditorial(Integer id) {
        try {
            editorial = new Editorial();
            super.conectar();
            editorial = em.find(Editorial.class, id);
            super.desconectar();
        } catch (Exception e) {
            
            if (em.isOpen()) {
                em.close();
                throw e;
            }
            super.desconectar();
        }
        return editorial;
    }
    public List<Editorial> listaEditoriales() {
        try {
            editoriales = new ArrayList();
           super.conectar();
            editoriales = em.createQuery("editorial.buscarTodos").getResultList();
            super.desconectar();
        } catch (Exception e) {
            
            if (em.isOpen()) {
                em.close();
                throw e;
            }
            super.desconectar();
        }
        return editoriales;
    }
    
    public List<Editorial> listaEditorialesPorNombre(String nombre) {
        try {
            editoriales = new ArrayList();
           super.conectar();
            editoriales = em.createQuery("editorial.buscarPorNombre").setParameter("nombre", nombre).getResultList();
            super.desconectar();
        } catch (Exception e) {
            
            if (em.isOpen()) {
                em.close();
                throw e;
            }
            super.desconectar();
        }
        return editoriales;
    }
    
}
