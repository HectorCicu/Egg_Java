package libreria;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;

/**
 *
 * @author Hector Cicutti
 */
public class Libreria {

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
        int opc;
        boolean salir = false;
        char sn;

        do {
            salir = false;

            System.out.println("""
                              \n------------LIBRERIA---------- 
                           
                           MENU DE OPCIONES
                           ---------------------------
                           
                           [ 1] - Alta Editorial
                           [ 2] - Baja Editorial
                           [ 3] - Modifica Editorial
                           [ 4] - Lista Editoriales
                           [ 5] - Alta Autor
                           [ 6] - Baja Autor
                           [ 7] - Modifica Autor
                           [ 8] - Lista Autores
                           [ 9] - Alta Libro
                           [10] - Baja Libro
                           [11] - Modifica Libro
                           [12] - Lista Libros
                           [13] - Busca Autor por Nombre
                           [14] - Buca Libro por ISBN
                           [15] - Busca libros por Autor
                           [16] - Busca Libros por Editorial
                           [17] - Salir""");
            try {
                System.out.print("Opcion-> ");
                opc = read.nextInt();

                switch (opc) {
                    case 1:
                        es.altaEditorial();
                        break;
                    case 2:
                        System.out.println("opción en construcción");
                        break;
                    case 3:
                        es.modificarEditoriales();
                        break;
                    case 4:
                        es.listarEditoriales();
                        break;
                    case 5:
                        as.altaManual();
                        break;
                    case 6:
                        as.eliminaAutor();
                        break;
                    case 7:
                        as.modificarAutor();
                        break;
                    case 8:
                        as.ListarAutores();
                        break;
                    case 9:
                        ls.altaLibro();
                        break;
                    case 10:
                        ls.eliminarLibro();
                        break;
                    case 11:
                        ls.modificarLibros();
                        break;
                    case 12:
                        ls.listarLibros();
                        break;
                    case 13:
                        as.buscarPorNombre();
                        break;
                    case 14:
                        ls.bucaLibroPorISBN();
                        break;
                    case 15:
                        ls.buscarLibroxAutor();
                        break;
                    case 16:
                        ls.buscarLibroxEditorial();
                        break;
                    case 17:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción Incorrecta! ");
                        break;
                }

            } catch (InputMismatchException ime) {
                JOptionPane.showMessageDialog(null, "Error - Debe ingresar un Número Entero válido" + ime.getMessage() + "\n" + ime.fillInStackTrace());

                read.next();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error - dato ingresado no válido " + e.getMessage() + "\n" + e.fillInStackTrace());
                //System.out.println("Dato no Válido " + e.getMessage());
                read.next();
            }

        } while (!salir);

    }
}
