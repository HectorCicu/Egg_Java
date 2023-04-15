
package ParDeNumerosMain;

import ParDeNumeros.ParDeNumeros;
import ParDeNumerosService.ParDeNumerosServices;

/**
 *
 * @author hhc
 */
public class ParDeNumerosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ParDeNumerosServices pn = new ParDeNumerosServices();
        
        ParDeNumeros par = new ParDeNumeros();
        pn.mostrarNumeros(par.getNum1(),par.getNum2());
        System.out.println("La potencia entre el mayor elevado al menor es: "+ pn.calcularPotencia(par));
        System.out.println("El número mayor es: " + pn.devolverMayor(par.getNum1(),par.getNum2()));
        System.out.println("La raíz cuadrada del menor número es: " + pn.calcularRaiz(par));
      
        

    }

}
