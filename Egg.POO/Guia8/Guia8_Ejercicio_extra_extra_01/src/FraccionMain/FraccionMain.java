package FraccionMain;

import Fraccion.Fraccion;
import FraccionServicios.FraccionServicios;

/**
 *
 * @author hhc
 */
public class FraccionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FraccionServicios fs = new FraccionServicios();
        //Fraccion f1;
        //Fraccion f2;
        // Fraccion fsuma;
        Fraccion f1 = fs.cargaFraccion();
        System.out.println(f1.toString());
        Fraccion f2 = fs.cargaFraccion();
        System.out.println(f2.toString());
        Fraccion fsuma = fs.sumarFraccion(f1, f2);
        fs.muestraFraccion(fsuma, "Suma");
        Fraccion fresta = fs.restarFraccion(f1, f2);
        fs.muestraFraccion(fresta, "Resta");
        Fraccion fmulti = fs.multiplicarFraccion(f1, f2);
        fs.muestraFraccion(fmulti, "Multiplicación");
        Fraccion fdivi = fs.dividirFraccion(f1, f2);
        fs.muestraFraccion(fdivi, "División");

    }
}
