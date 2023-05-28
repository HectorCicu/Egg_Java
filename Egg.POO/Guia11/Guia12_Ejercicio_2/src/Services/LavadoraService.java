

package Services;

import Entities.Colores;
import Entities.ConsumoEnergetico;
import Entities.Electrodomestico;

/**
 *
 * @author Hector Cicutti
 */
public class LavadoraService extends Electrodomestico {

    public LavadoraService(Double precio, Colores color, ConsumoEnergetico consumo, Double peso) {
        super(precio, color, consumo, peso);
    }
    
    public void crearLavadora(){
        
    }

}
