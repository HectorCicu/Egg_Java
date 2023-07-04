package libreria.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hector Cicutti
 */
public abstract class DAO<T> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Guia16_JPA_Ej_01PU");
    protected EntityManager em = EMF.createEntityManager();

    //oonectamos previamente verificando conexión
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
        }
    }
    
    protected void eliminar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            System.out.println("ERROR! " + e.getMessage());
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
        }
    }
} 
