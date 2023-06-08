package Main;

import Entities.Persona;
import Services.PersonaServicios;

/**
 * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios,
 * a null y tratar de invocar el método esMayorDeEdad() a través de ese objeto.
 * Luego, englobe el código con una cláusula try-catch para probar la nueva
 * excepción que debe ser controlada
 *
 * @author Hector Cicutti
 */
public class Guia13_Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     PersonaServicios ps = new PersonaServicios();
     Persona per = null;
   try {
     if (per.isEsmayor()){
         System.out.println("okok es mayor");
     }else {
         System.out.println("oh no! es menor!");
     }
    }catch (NullPointerException npe) {
       System.out.println("La clase no tiene atributos con valores");
       System.out.println(npe.getMessage());
       System.out.println(npe.fillInStackTrace());
    
    }finally {
       System.out.println("\nDebe instanciar correctamente la clase");
   }
   
   try {
   if(ps.mayorEdad(per)) {
       System.out.println("Es mayor de edad");
   }else
           System.out.println("es menor de edad");
   }catch (Exception e) {

       System.out.println(e.getCause());  
       System.out.println(e.getMessage());
   }
    }

}
