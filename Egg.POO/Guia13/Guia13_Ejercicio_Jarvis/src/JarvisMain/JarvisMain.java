package JarvisMain;

import Services.Operaciones;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class JarvisMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        try {
            Operaciones.operaciones();
        } catch (NumberFormatException | InputMismatchException nfe) {
            JOptionPane.showMessageDialog(null, "Está tratando de ingrear un caracter no válido");
            //System.out.println("Está tratando de ingrear un caracter no válido");
            //   read.next();

        } finally {
            System.out.println("Bye - Bye");
        }
    }
}