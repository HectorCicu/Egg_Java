package libreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;
import libreria.Persistencia.EditorialDAO;
import libreria.entidades.Editorial;

/**
 *
 * @author Hector Cicutti
 */
public class EditorialServicio {

    private static EditorialDAO ed = new EditorialDAO();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Editorial editorial = null;
    private List<Editorial> editoriales = null;
    private static String nombre;
    private static boolean salir = false;
    public static Integer id;

    public void altaEditorial() throws Exception {
        do {
            salir = false;
            try {
                System.out.print("Ingrese nombre Editorial: ");
                nombre = read.next();
                editoriales = new ArrayList();
                editoriales = ed.listaEditorialesPorNombre(nombre);
                if (editoriales.isEmpty()) {
                    editorial = new Editorial(nombre);
                    ed.guardarEditorial(editorial);
                    System.out.println("Se dio de alta la editorial");
                } else {
                    System.out.println("Hay Editoriales con nombres similares");
                    for (Editorial editor : editoriales) {
                        System.out.println("ID: " + editor.getId() + " --- Nombre: " + editor.getNombre());
                    }
                    System.out.print("Quiere darlo de alta igual? (S/N)");
                    char sn = read.next().toUpperCase().charAt(0);
                    if (sn == 'S') {
                        editorial = new Editorial(nombre);
                        ed.guardarEditorial(editorial);
                        System.out.println("Se dio de alta sl Editorial");
                    }
                }
            } catch (Exception e) {
                throw e;
            }
            System.out.print("Desea salir del programa? (S/N)  ");
            char bye = read.next().toUpperCase().charAt(0);
            if (bye != 'S' && bye != 'N') {
                JOptionPane.showMessageDialog(null, "Error  - Debe seleccionar S o N");
            } else {
                if (bye == 'S') {
                    salir = true;
                }
            }
        } while (!salir);
    }

    public void buscarPorNombre() {
        System.out.println("BUSCAR EDITORIAL POR NOMBRE");
        try {

            System.out.print("Ingrese nombre (puede ser parcial)  ");
            nombre = read.next();
            editoriales = new ArrayList();
            editoriales = ed.listaEditorialesPorNombre(nombre);
            if (editoriales.isEmpty()) {
                System.out.println("No existe ninguna Editorial con nombres similares ");
            } else {
                System.out.println("EDITORIALES ENCONTRADAS");
                for (Editorial edito : editoriales) {
                    System.out.println("ID: " + edito.getId() + " --- Nombre: " + edito.getNombre());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }
     public void eliminaEditorial() throws Exception {

        System.out.println("Eliminar EDITORIAL");
        try {

            System.out.print("Ingrese ID: ");
            id = read.nextInt();
            editorial = new Editorial();
            editorial = ed.buscarEditorial(id);
            if (Objects.equals(editorial.getId(), id)) {
                ed.eliminarEditorial(editorial);
                System.out.println("Se eliminó la Editorial: " + editorial.getNombre());

            } else {
                System.out.println("El Id de la editorial no existe ");
            }

        } catch (Exception e) {
            throw e;
        }
        System.out.println("\nPulse una tecla para salir");
        var a = read.next();
    }

    public void listarEditoriales() {
        editoriales = new ArrayList();
        editoriales = ed.listarEditorialDAO();
        System.out.println("***   LISTADO EDITORIALES ****");
        System.out.println("--------------------------------------------");
        System.out.println("ID           Nombre");
        for (Editorial editoriale : editoriales) {
            System.out.printf("| %-4s |  %-60s  |\n", editoriale.getId(), editoriale.getNombre());
        }

    }

    public void modificarEditoriales() throws Exception {

        System.out.println("MODIFICAR EDITORIAL");
        try {

            System.out.print("Ingrese ID:  ");
            id = read.nextInt();
            editorial = new Editorial();
            editorial = ed.buscarEditorial(id);
            if (Objects.equals(editorial.getId(), id)) {
                System.out.println("Editorial..........................: " + editorial.getNombre());
                System.out.print("Ingrese Nuevo Nombre..: ");
                nombre = read.next();
                editorial.setNombre(nombre);

                ed.modificarEditorial(id);
                System.out.println("Editorial  " + editorial.getId() + "  -  " + editorial.getNombre() + "  modificada.");

            } else {
                System.out.println("El Id de la Editorial no existe ");
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void cargaEditorialMasiva() throws Exception {
        ed.guardarEditorial(new Editorial("Penguin Books"));
        ed.guardarEditorial(new Editorial("J. B. Lippincott & Co."));
        ed.guardarEditorial(new Editorial("Charles Scribner's Sons"));
        ed.guardarEditorial(new Editorial("Secker and Warburg"));
        ed.guardarEditorial(new Editorial("Little"));
        ed.guardarEditorial(new Editorial("Faber and Faber"));
        ed.guardarEditorial(new Editorial("Chatto & Windus"));
        ed.guardarEditorial(new Editorial("George Allen & Unwin"));
        ed.guardarEditorial(new Editorial("Delacorte Press"));
        ed.guardarEditorial(new Editorial("Simon & Schuster"));
        ed.guardarEditorial(new Editorial("Editorial Sudamericana"));
        ed.guardarEditorial(new Editorial("Ward"));
        ed.guardarEditorial(new Editorial("The New American Library"));
        ed.guardarEditorial(new Editorial("Pan Books"));
        ed.guardarEditorial(new Editorial("Doubleday"));
        ed.guardarEditorial(new Editorial("Viking Press"));
        ed.guardarEditorial(new Editorial("Norstedts förlag"));
        ed.guardarEditorial(new Editorial("Scholastic Press"));
        ed.guardarEditorial(new Editorial("Amy Einhorn Books"));
        ed.guardarEditorial(new Editorial("Alfred A. Knopf"));
        ed.guardarEditorial(new Editorial("Knopf Canada"));
        ed.guardarEditorial(new Editorial("Riverhead Books"));
        ed.guardarEditorial(new Editorial("HarperCollins"));
        ed.guardarEditorial(new Editorial("Crown Publishing Group"));
        ed.guardarEditorial(new Editorial("Harcourt Brace Jovanovich"));
        ed.guardarEditorial(new Editorial("G. P. Putnam's Sons"));
        ed.guardarEditorial(new Editorial("Thomas Cautley Newby"));
        ed.guardarEditorial(new Editorial("Thomas Egerton"));
        ed.guardarEditorial(new Editorial("Smith"));
        ed.guardarEditorial(new Editorial("John Murray"));
        ed.guardarEditorial(new Editorial("Chapman & Hall"));
        ed.guardarEditorial(new Editorial("Richard Bentley"));
        ed.guardarEditorial(new Editorial("Bradbury and Evans"));
        ed.guardarEditorial(new Editorial("Roberts Brothers"));
        ed.guardarEditorial(new Editorial("Macmillan Publishers"));
        ed.guardarEditorial(new Editorial("Charles L. Webster and Company"));
        ed.guardarEditorial(new Editorial("The Viking Press"));
        ed.guardarEditorial(new Editorial("Covici Friede"));
        ed.guardarEditorial(new Editorial("Scribner"));
        ed.guardarEditorial(new Editorial("Heinemann"));
        ed.guardarEditorial(new Editorial("Ticknor"));
        ed.guardarEditorial(new Editorial("Harper & Brothers"));
        ed.guardarEditorial(new Editorial("Archibald Constable and Company"));
        ed.guardarEditorial(new Editorial("Lackington & Jones"));
        ed.guardarEditorial(new Editorial("Longmans"));
        ed.guardarEditorial(new Editorial("Blackwood's Magazine"));
        ed.guardarEditorial(new Editorial("Penguin Classics"));
        ed.guardarEditorial(new Editorial("William Caxton"));
        ed.guardarEditorial(new Editorial("Francisco de Robles"));
        ed.guardarEditorial(new Editorial("Folio Society"));
        ed.guardarEditorial(new Editorial("A. Lacroix"));
        ed.guardarEditorial(new Editorial("Baudry's European Library"));
        ed.guardarEditorial(new Editorial("Michel Lévy Frères"));
        ed.guardarEditorial(new Editorial("The Russian Messenger"));
        ed.guardarEditorial(new Editorial("Novy Mir"));
        ed.guardarEditorial(new Editorial("Olympia Press"));
    }

}
