
package DNI;

import Entidades.Nif;
import Servicios.NifServicios;

/**
 *
 * @author hhc
 */
public class DniMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        NifServicios nf = new NifServicios();
        
        Nif n = new Nif();
        
        nf.cargarDni(n);
        nf.obtenerNif(n);
        System.out.println(n.toString());

    }

}
