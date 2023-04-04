
package Nespresso;

import Cafetera.Cafetera;
import CafeteraService.CafeteraServicios;

/**
 *
 * @author hhc
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       CafeteraServicios cs1 = new CafeteraServicios();
       Cafetera caf = new Cafetera();
       cs1.llenarCafetera(caf);
       cs1.servirTaza(caf);
       cs1.vaciarCafetera(caf);
       cs1.servirTaza(caf);
       cs1.cargarCafetera(caf);
       
       

    }

}
