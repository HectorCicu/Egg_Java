package libreria;

import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;

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
        AutorServicio as = new AutorServicio();
        //as.cargarMasivoAutor();
        EditorialServicio es = new EditorialServicio();
        //es.cargaEditorialMasiva();
       //es.altaEditorial();
        as.ListarAutores();
        as.modificarAutor();
        es.buscarPorNombre();
        //as.ListaAutores();
    }

}
