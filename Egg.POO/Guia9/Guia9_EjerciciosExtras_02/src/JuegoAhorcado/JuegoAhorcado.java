
package JuegoAhorcado;

import Ahorcado.Ahorcado;
import Metodos.AhorcadoServicios;

/**
 *
 * @author Hector Cicutti
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       AhorcadoServicios as = new AhorcadoServicios();
       
       Ahorcado ah = new Ahorcado();
       
       as.crearJuego(ah);
       
        System.out.println(ah.toString());

    }

}
