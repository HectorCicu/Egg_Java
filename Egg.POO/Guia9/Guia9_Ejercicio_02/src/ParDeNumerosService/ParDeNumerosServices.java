

package ParDeNumerosService;

import ParDeNumeros.ParDeNumeros;

/**
 *
 * @author Temporal
 */
public class ParDeNumerosServices {

    public static void mostrarNumeros(double a, double b){
        
        System.out.println("El primer número es "  + a);
        System.out.println("El segundo número es " + b);
        
    }
    
//    Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    
    public static double devolverMayor(double a, double b) {
        return Math.max(a,b);
        
    }
//    
//    Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores. 

    public double calcularPotencia(ParDeNumeros p) {
        
        return Math.pow((int)devolverMayor(p.getNum1(), p.getNum2()),Math.min(p.getNum1(), p.getNum2()));
    }
}
