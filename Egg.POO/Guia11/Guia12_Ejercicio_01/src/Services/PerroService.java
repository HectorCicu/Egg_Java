

package Services;

import Entities.Animal;


/**
 *
 * @author Hector Cicutti
 */
public class PerroService extends Animal {
    public PerroService(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
 @Override
    public void alimentarse() {
            System.out.printf("Mi nombre es %s, soy un PERRO raza %s y tengo %S años. Estoy comiendo %s",getNombre(), getRaza(), getEdad(), getAlimento());
    }
}
