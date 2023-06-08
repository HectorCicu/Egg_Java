
package Ejercicio_02;

/**
 *
 * @author Hector Cicutti
 */
public class Guia13_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      Array array = new Array();
      
      try{ 
      array.leoArray();
      }catch (Exception e) {
          System.out.println("prueba getMesagge " + e.getMessage());

      }
    
    
    try{
        array.leoArray2();
        
    }catch (ArrayIndexOutOfBoundsException aioobe) {
        System.out.println("pero que errorrrr    --" + aioobe.getMessage());
    }
    
    }

}
