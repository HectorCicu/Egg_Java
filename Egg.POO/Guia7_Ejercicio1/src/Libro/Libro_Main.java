
package Libro;

/**
 *
 * @author hhc
 */
public class Libro_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Libro_Clase l1 = new Libro_Clase();
        l1.cargarDatos();
        Libro_Clase l2 = new Libro_Clase();
        l2.cargarDatos();
        Libro_Clase l3 = new Libro_Clase(1407, "El año que vivimos en peligro", "Mark Winston", 1234);
       
        Libro_Clase l4 = new Libro_Clase();
        l4.cargarDatos();
        Libro_Clase l5 = new Libro_Clase();
        l5.cargarDatos();
        Libro_Clase l6 = new Libro_Clase();
        l6.cargarDatos();
        Libro_Clase l7 = new Libro_Clase(233, "Martín Fierro", "Ricardo Güraldes", 675);
        
        
        l1.mostrarDatos();
        l2.mostrarDatos();
        l3.mostrarDatos();
        l4.mostrarDatos();
        l5.mostrarDatos();
        l6.mostrarDatos();
        l7.mostrarDatos();

    }

}
