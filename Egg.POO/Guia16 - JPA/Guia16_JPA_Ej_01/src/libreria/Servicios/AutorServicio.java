

package libreria.Servicios;

import java.util.Random;
import java.util.Scanner;
import libreria.Persistencia.AutorDAO;
import libreria.entidades.Autor;

/**
 *
 * @author Hector Cicutti
 */
public class AutorServicio {
private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
private static Random rand = new Random();
private static String nombre;
private static Autor autor = null;
private static Integer id = 0;
private static AutorDAO ad = new AutorDAO();

public void altaManual() throws Exception {
    
    try{
        
    System.out.println("ALTA AUTOR");
    System.out.print("Ingrese ID: ");
    id = read.nextInt();
    System.out.print("Ingrese nombre: ");
    nombre = read.next();
    autor = new Autor(id, nombre,true);
    ad.registrarAutor(autor);
    }catch(Exception e) {
        throw e;
    }
}
}
