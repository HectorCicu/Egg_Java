package CursoMain;

import CursoServicio.CursoServicio;
import Entidades.Curso;

/**
 *
 * @author Hector Cicutti
 */
public class CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso cu = new Curso();
        cs.crearCurso(cu);
        cs.cargarAlumnos(cu);
        cs.muestraClase(cu);
    }
    
}
