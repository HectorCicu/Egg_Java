
package Estancias;

import Estancias.services.CasasService;
import Estancias.services.FamiliasService;

/**
 *
 * @author Hector Cicutti
 */
public class AlqEstancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      try {
          CasasService cs  = new CasasService ();
          FamiliasService fs = new FamiliasService();
      
      cs.casasPorPais();
          System.out.println("");
          cs.casasLimpias();
          fs.FamiliaHijos();
      }catch (Exception e) {
          e.printStackTrace();
          System.out.println("e -  " + e.getMessage());
      }
    }

}
