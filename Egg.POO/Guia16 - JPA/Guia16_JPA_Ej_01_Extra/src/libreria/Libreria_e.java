package libreria;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;
import libreria.entidades.MenuLibreria;

/**
 *
 * @author Hector Cicutti
 */
public class Libreria_e {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        AutorServicio as = new AutorServicio();
        as.cargarMasivoAutor();
        EditorialServicio es = new EditorialServicio();
        es.cargaEditorialMasiva();
        LibroServicio ls = new LibroServicio();
        ls.altaLibrosMasivos();
        MenuLibreria ml = new MenuLibreria();
        ml.menuPrincipal();

        
    }
}
