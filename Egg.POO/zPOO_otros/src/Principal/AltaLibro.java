
package Principal;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class AltaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro1 = new Libro(); //instanciar Objeto
        System.out.print("ingrese ISBN: ");
        int codigoLibro = read.nextInt();
        libro1.setIsbn(codigoLibro);
        System.out.print("ingrese titulo: ");
        libro1.setTitulo(read.next());
        System.out.print("autor: ");
        libro1.setAutor(read.next());
        System.out.print("nro paginas ");
        libro1.setNroPag(read.nextInt());
        
        
        Libro libro2 = new Libro(2433, "El juego del miedo", "Jorge Perez",1233);
        Libro libro3 = new Libro(182433, "El Golpe", "Javier Far",933);
        Libro libro4 = new Libro(433, "El Cisne Negro", "C3PO",233);
        Libro libro5 = new Libro(123, "Solos en la madrugada", "Ernesto Gomez",988);
        
        System.out.println("\nLibro 4 ISBN: "+ libro4.getIsbn() + " - Título: " + 
                libro4.getTitulo() + " - Autor: " + libro4.getAutor() + " Nro Páginas: " + libro4.getNroPag() );
        System.out.println("\nLibro 1 ISBN: "+ libro1.getIsbn() + " - Título: " + 
                libro1.getTitulo() + " - Autor: " + libro1.getAutor() + " Nro Páginas: " + libro1.getNroPag() );
        System.out.println("\nLibro 3 ISBN: "+ libro3.getIsbn() + " - Título: " + 
                libro3.getTitulo() + " - Autor: " + libro3.getAutor() + " Nro Páginas: " + libro3.getNroPag() );
        System.out.println("\nLibro 5 ISBN: "+ libro5.getIsbn() + " - Título: " + 
                libro5.getTitulo() + " - Autor: " + libro5.getAutor() + " Nro Páginas: " + libro5.getNroPag() );
        System.out.println("\nLibro 2 ISBN: "+ libro2.getIsbn() + " - Título: " + 
                libro2.getTitulo() + " - Autor: " + libro2.getAutor() + " Nro Páginas: " + libro2.getNroPag() );
        
libro4.setIsbn(1456);
System.out.println("\nLibro 4 modif ISBN: "+ libro4.getIsbn() + " - Título: " + 
                libro4.getTitulo() + " - Autor: " + libro4.getAutor() + " Nro Páginas: " + libro4.getNroPag() ); 
libro1.cargaLibros();
libro2.cargaLibros();
libro3.cargaLibros();
libro4.cargaLibros();
libro5.cargaLibros();

        System.out.println("LIBRO4" + libro4.toString());

    }

}
