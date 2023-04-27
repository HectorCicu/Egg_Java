
package Guia10_Ejercicio01;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hector Cicutti
 */
public class pruebaArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<String> raza = new ArrayList<>();
        raza.add("B1");
        raza.add("B5");
        raza.add("B3");
        raza.add("B6");
        raza.add("B8");
        raza.add("B9");
        raza.add("B4");

        Collections.sort(raza);
        
        System.out.println(raza);
    }

}
