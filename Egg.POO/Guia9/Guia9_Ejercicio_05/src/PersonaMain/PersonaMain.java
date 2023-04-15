
package PersonaMain;

import Entidades.Persona;
import PersonaService.PersonaService;

/**
 *
 * @author hhc
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PersonaService ps = new PersonaService();
      
      Persona p = ps.crearPersona();
      ps.mostrarPersona(p);

    }

}
