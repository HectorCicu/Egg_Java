
package PersonaMain;

import Entidades.Persona;
import Servicios.PersonaServices;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServices ps = new PersonaServices();
        
        Persona per = new Persona();
        
        per = ps.crearPersona();
        
        System.out.print("Ingrese edad a comparar: ");
        int edadCompara = read.nextInt();
        if (ps.menorQue(per, edadCompara)) {
            System.out.println("\nLa persona es menor que la edad de referencia");
            
        }else {
            System.out.println("\nLa persona es MAYOR que la edad de referencia");
        }
        System.out.println("");
        System.out.println("MOSTRAR PERSONA");
        System.out.println("---------------");
        ps.mostrarPersona(per);

    }

}
