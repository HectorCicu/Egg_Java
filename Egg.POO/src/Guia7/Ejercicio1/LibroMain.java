package Guia7.Ejercicio1;

/**
 *
 * @author hhc
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.altaLibro();

        Libro l2 = new Libro(8778, "El arte de hacer panqueques con Dulce de Leche", "Sancor y La Serenísima", 466);

        Libro l3 = new Libro();
        l3.altaLibro();
        
        Libro l4 = new Libro(166, "El mundo Submarino", "Jacques Cousteau", 566);
        
        l1.imprime();
        l2.imprime();
        l3.imprime();
        l4.imprime();
        System.out.println("");
    }

}
