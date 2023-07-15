

package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author Hector Cicutti
 */
public class PrestamoDAO extends DAO<Prestamo> {
    
    public void guardarPrestamo(Prestamo objeto) throws Exception{
        try{
            super.grabar(objeto);
        }catch (Exception e) {
            throw e;
        }
    }
 public void actualizarPrestamo(Prestamo objeto) throws Exception{
        try{
            super.modificar(objeto);
        }catch (Exception e) {
            throw e;
        }
    }
public List<Prestamo> buscarPorCliente(Long dni){
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
}
