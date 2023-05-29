

package Services;

import Entities.Animal;


/**
 *
 * @author Hector Cicutti
 */
public class CaballoService extends Animal {
    public CaballoService(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
 @Override
    public void alimentarse() {
            System.out.printf("Mi nombre es %s, soy un CABALLO raza %s y tengo %S años. Estoy comiendo %s",getNombre(), getRaza(), getEdad(), getAlimento());
    }
}
