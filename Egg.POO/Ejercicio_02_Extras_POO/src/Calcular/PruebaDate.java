
package Calcular;

import java.util.Date;

/**
 *
 * @author hhc
 */
public class PruebaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Date d1 = new Date();
        Date d2 = new Date(123,3,13);
        
        System.out.println("d1:     "+ d1 );
        System.out.println("d2:     "+ d2 );
        System.out.println("diferencia:  " + d2.compareTo(d1));
        System.out.println("After    " + d1.after(d2));
        System.out.println("Before   " + d1.before(d2));
        System.out.println("Equals   " + d1.equals(d2));
        System.out.println("ToString   " +  d2.toString());
        System.out.println("GetTime   " + d1.getTime());
        System.out.println(d1.getDay());

    }

}
