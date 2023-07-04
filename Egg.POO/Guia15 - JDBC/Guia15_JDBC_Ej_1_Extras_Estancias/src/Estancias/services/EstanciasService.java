

package Estancias.services;

import Estancias.entidades.Estancias;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class EstanciasService {
    
    private static Collection<Estancias> estancias = null;
    private static Estancias estancia = null;
    private static String sql;
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void cargaEstancias() {
        try{
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
