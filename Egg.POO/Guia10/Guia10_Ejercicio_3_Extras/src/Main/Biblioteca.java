
package Main;

import Libro.Libro;
import Servicios.BiblioServices;
import java.util.HashSet;

/**
 *
 * @author Hector Cicutti
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BiblioServices bs  = new BiblioServices();
      HashSet<Libro> biblio = new HashSet();
      bs.menu(biblio);
      

    }

}
