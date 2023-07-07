package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author Hector Cicutti
 * @param <T> clase general, para poder enviar cualquiera
 */
public abstract class DAO<T> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Guia16_JPA_Ej_01PU");
    protected EntityManager em = EMF.createEntityManager();

    //conectamos previamente verificando conexión
    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    // hacemos la desonexión
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void grabar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
            em.getTransaction().rollback();
            desconectar();
        }
    }

    protected void eliminar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();

            objeto = em.merge(objeto); // Obtener una instancia administrada

            em.remove(objeto);

            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
            em.getTransaction().rollback();
            desconectar();
        }
    }

    protected void modificar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
            em.getTransaction().rollback();
            desconectar();
        }
    }

    public List<T> listar(String objeto) {
        try {
            List<T> resultados = new ArrayList();
            String query = "Select e from " + objeto + " e";
            conectar();
            resultados = em.createQuery(query).getResultList();
            desconectar();
            return (List<T>) resultados;
        } catch (Exception e) {
            throw e;

        }
    }
}
