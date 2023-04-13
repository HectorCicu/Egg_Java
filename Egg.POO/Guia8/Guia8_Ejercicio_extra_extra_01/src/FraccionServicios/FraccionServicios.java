package FraccionServicios;

import Fraccion.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class FraccionServicios {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Fraccion cargaFraccion() {
        System.out.print("Ingrese numerador: ");
        int nume = Math.abs(read.nextInt());
        System.out.print("Ingrese denominador: ");
        int deno = Math.abs(read.nextInt());
        return new Fraccion(nume, deno);
    }

    public Fraccion sumarFraccion(Fraccion a, Fraccion b) {
        int n = a.getN1() * b.getD1() + b.getN1() * a.getD1();
        int d = a.getD1() * b.getD1();
        return new Fraccion(n, d);
    }
    
    public Fraccion restarFraccion(Fraccion a, Fraccion b) {
        int n = a.getN1() * b.getD1() - b.getN1() * a.getD1();
        int d = a.getD1() * b.getD1();
        return new Fraccion(n, d);
    }
    
    public Fraccion dividirFraccion(Fraccion a, Fraccion b) {
        int n = a.getN1() * b.getD1();
        int d = a.getD1() * b.getN1();
        return new Fraccion(n, d);
    }
    public Fraccion multiplicarFraccion(Fraccion a, Fraccion b) {
        int n = a.getN1() * b.getN1();
        int d = a.getD1() * b.getD1();
        return new Fraccion(n, d);
    }

    public void muestraFraccion(Fraccion f, String tipo) {
        System.out.println("La fraccion resultante de la " + tipo + " es");
        System.out.println(f.getN1());
        System.out.println("------");
        System.out.println(f.getD1());
    }
    
    

}
