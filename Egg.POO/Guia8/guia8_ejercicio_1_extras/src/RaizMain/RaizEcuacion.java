
package RaizMain;

import Entidades.Raices;
import Metodos.RaicesMetodos;

/**
 *
 * @author hhc
 */
public class RaizEcuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      RaicesMetodos rm = new RaicesMetodos();
      
      Raices rr = new Raices(3,5,1);
      
     rm.discriminante(rr);
        System.out.println("Discriminante =  " + rr.getDiscriminante());
     rm.calcular(rr);
    }

}
