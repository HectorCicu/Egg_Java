package Main;

import Entities.Circulo;
import Entities.Rectangulo;

/**
 *
 * @author Hector Cicutti
 */
public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.34);
        Rectangulo r1 = new Rectangulo(12, 45);
        c1.calcularArea();
        c1.calcularPerimetro();
        r1.calcularArea();
        r1.calcularPerimetro();
    }

}
