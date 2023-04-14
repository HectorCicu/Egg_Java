
package CadenaMain;

import CadenaServicios.CadenaServicios;
import Entidades.Cadena;

/**
 *
 * @author hhc
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        CadenaServicios cs = new CadenaServicios();
        
        Cadena cad = new Cadena("Roberto pidio una variable booleana");
        
        cs.mostrarVocales(cad);
        System.out.println("");
        cs.invertirFrase(cad);
        System.out.println("");
        cs.vecesRepetido(cad);
        System.out.println("");
        cs.compararlongitud(cad);
        System.out.println("");
        cs.unirFrases(cad);
        System.out.println("");
        cs.reemplazar(cad);
        System.out.println("");
        cs.contiene(cad);
        System.out.println("");
        System.out.println("Muchas gracias, vuelvas prontos ");
                

    }

}
