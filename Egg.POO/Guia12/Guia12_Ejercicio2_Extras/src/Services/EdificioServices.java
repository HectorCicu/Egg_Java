

package Services;

import Entities.Edificio;


/**
 *
 * @author Hector Cicutti
 */
public class EdificioServices extends Edificio {

    public EdificioServices(int ancho, int alto, int largo) {
        super(ancho, alto, largo);
    }
    
   @Override
    public int calcularSuperficie() {
        return super.getAncho() * super.getLargo();
    }

    @Override
    public int calcularVolumen() {
        return super.getAlto() * super.getAncho() * super.getLargo();
    }
    
 
    }
    
