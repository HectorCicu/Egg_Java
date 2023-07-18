package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidades.Prestamo;

/**
 *
 * @author Hector Cicutti
 */
public class PrestamoDAO extends DAO<Prestamo> {

    public void guardarPrestamo(Prestamo objeto) throws Exception {
        try {
            super.grabar(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void actualizarPrestamo(Prestamo objeto) throws Exception {
        try {
            super.modificar(objeto);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Prestamo> buscarPorCliente(Long dni) {
        List<Prestamo> ps = new ArrayList();
        try {

            super.conectar();

            ps = em.createNamedQuery("prestamo.buscarPorCliente").setParameter("dniCli", dni).getResultList();
            super.desconectar();
        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return ps;
    }

    public Prestamo buscarPrestamoPorID(Integer id) {
        Prestamo prs = null;
        try {
            prs = new Prestamo();
            super.conectar();

            prs = (Prestamo) em.createNamedQuery("prestamo.buscarPorID").setParameter("idprest", id).getSingleResult();
            super.desconectar();
        } catch (NoResultException nre) {
            prs = null;
            super.desconectar();
        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return prs;
    }
}
