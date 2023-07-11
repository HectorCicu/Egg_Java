package libreria.Servicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class InputServicio {

    public static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Integer inputInteger() {
        Integer input = 0;
        try {
            input = read.nextInt();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Está ingresando un dato no válido " + nfe.getMessage());
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(null, "Está pasando un argumento no válido  " + iae.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error - Excepción - " + e.getMessage());
        }
        return input;
    }

}
