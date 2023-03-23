package Guia7.Ejercicio1;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
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
