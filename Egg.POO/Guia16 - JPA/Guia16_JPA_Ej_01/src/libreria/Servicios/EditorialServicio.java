package libreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    public void altaEditorial() throws Exception {
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
    }

    public void cargaEditorialMasiva() throws Exception {
        ed.guardarEditorial(new Editorial("Penguin Random House"));
        ed.guardarEditorial(new Editorial("HarperCollins"));
        ed.guardarEditorial(new Editorial("Hachette Livre"));
        ed.guardarEditorial(new Editorial("Simon & Schuster"));
        ed.guardarEditorial(new Editorial("Macmillan Publishers"));
        ed.guardarEditorial(new Editorial("Scholastic Corporation"));
        ed.guardarEditorial(new Editorial("Wiley"));
        ed.guardarEditorial(new Editorial("Bloomsbury Publishing"));
        ed.guardarEditorial(new Editorial("Oxford University Press"));
        ed.guardarEditorial(new Editorial("Cambridge University Press"));
        ed.guardarEditorial(new Editorial("Elsevier"));
        ed.guardarEditorial(new Editorial("Pearson Education"));
        ed.guardarEditorial(new Editorial("John Wiley & Sons"));
        ed.guardarEditorial(new Editorial("Springer Nature"));
        ed.guardarEditorial(new Editorial("Cengage Learning"));
        ed.guardarEditorial(new Editorial("Palgrave Macmillan"));
        ed.guardarEditorial(new Editorial("Penguin Group"));
        ed.guardarEditorial(new Editorial("Routledge"));
        ed.guardarEditorial(new Editorial("Taylor & Francis"));
        ed.guardarEditorial(new Editorial("University of Chicago Press"));
    }

}
