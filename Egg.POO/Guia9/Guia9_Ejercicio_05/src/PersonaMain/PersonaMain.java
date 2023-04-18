
package PersonaMain;

import Entidades.Persona;
import PersonaService.PersonaService;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class PersonaMain {
   public static Scanner read = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PersonaService ps = new PersonaService();
      
      Persona p = ps.crearPersona();
      ps.mostrarPersona(p);
      
        System.out.print("Ingrese la edad a comparar: ");
        int anios = read.nextInt();
        
        if (ps.esMenor(p, anios)) {
            System.out.println("\nLa persona es menor que la edad ingresada ");
            
        }else {
            System.out.println("\nLa persona es mayor que la edad ingresada");
        }
        
    }

}
