

package libreria.Persistencia;

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

}
