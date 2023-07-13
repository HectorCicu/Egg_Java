package libreria.entidades;

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
public class MenuLibreria {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    LibroServicio ls = new LibroServicio();

    private static int opc;
    private static boolean salir = false;
    private static char sn;

    public void menuPrincipal() throws Exception {
        do {
            salir = false;

            System.out.println("""
                              \n   ----------------------------------
                               -------       LIBRERIA      ----- 
                               ----------------------------------
                               
                           MENU PRINCIPAL
                           -----------------------
                           [ 1] - Editoriales
                           [ 2] - Autores
                           [ 3] - Libros
                           [ 4] - Clientes
                           [ 5] - Operaciones
                           [ 0] - Salir""");
            try {
                System.out.print("Opcion-> ");
                opc = read.nextInt();

                switch (opc) {
                    case 1:
                        menuEditorial();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:
                        menuLibro();
                        break;
                    case 4:
                        System.out.println("En construcción");;
                        break;
                    case 5:
                        as.altaManual();
                        break;
                    case 0:
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
    
    public void menuEditorial() throws Exception{
        boolean salir1;
        do {
            salir1 = false;

            System.out.println("""
                              \nMENU EDITORIALES
                           -----------------------
                           
                           [ 1] - Alta Editoriales
                           [ 2] - Baja
                           [ 3] - Modificación
                           [ 4] - Listado
                           [ 0]  - Salir""");
            try {
                System.out.print("Opcion-> ");
               int opc2 = read.nextInt();

                switch (opc2) {
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
                    case 0:
                        salir1= true;
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

        } while (!salir1);
   
    }
    public void menuAutor() throws Exception{
        boolean salir2;
        do {
            salir2 = false;

            System.out.println("""
                              \nMENU AUTORES
                           -----------------------
                           
                           [ 1] - Alta Autores
                           [ 2] - Baja
                           [ 3] - Modificación
                           [ 4] - Listado
                           [ 0]  - Salir""");
            try {
                System.out.print("Opcion-> ");
                int opc1 = read.nextInt();

                switch (opc1) {
                      case 1:
                        as.altaManual();
                        break;
                    case 2:
                        as.eliminaAutor();
                        break;
                    case 3:
                        as.modificarAutor();
                        break;
                    case 4:
                        as.ListarAutores();
                        break;
                   case 0:
                        salir2 = true;
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

        } while (!salir2);
   
    }
public void menuLibro() throws Exception {
    do {
            salir = false;

            System.out.println("""
                              \n------------LIBRERIA---------- 
                           
                           MENU DE OPCIONES
                           ---------------------------
 
                           [ 1] - Alta Libro
                           [ 2] - Baja Libro
                           [ 3] - Modifica Libro
                           [ 4] - Lista Libros
                           [ 5] - Busca Autor por Nombre
                           [ 6] - Buca Libro por ISBN
                           [ 7] - Busca libros por Autor
                           [ 8] - Busca Libros por Editorial
                           [ 0] - Salir""");
            try {
                System.out.print("Opcion-> ");
                opc = read.nextInt();

                switch (opc) {
                    case 1:
                        ls.altaLibro();
                        break;
                    case 2:
                        ls.eliminarLibro();
                        break;
                    case 3:
                        ls.modificarLibros();
                        break;
                    case 4:
                        ls.listarLibros();
                        break;
                    case 5:
                        as.buscarPorNombre();
                        break;
                    case 6:
                        ls.bucaLibroPorISBN();
                        break;
                    case 7:
                        ls.buscarLibroxAutor();
                        break;
                    case 8:
                        ls.buscarLibroxEditorial();
                        break;
                    case 0:
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
