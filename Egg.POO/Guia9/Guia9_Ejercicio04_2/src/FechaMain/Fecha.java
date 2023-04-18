
package FechaMain;

import FechaServicio.FechaServicio;

import java.util.Date;

/**
 *
 * @author Hector Cicutti
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        FechaServicio fs = new FechaServicio();
        
        Date fechaActual = fs.fechaActual();
        
        Date fechaNacimiento = fs.fechaNacimiento();
        
        System.out.println("\nLa edad es: "+ fs.diferencia(fechaActual, fechaNacimiento));
        
        System.out.println("\n" + fechaNacimiento.toString());
        System.out.println("\n" + fechaActual.toString());
 
    }

}
