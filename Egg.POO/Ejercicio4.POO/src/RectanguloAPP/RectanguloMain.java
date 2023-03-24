package RectanguloAPP;

import Entidad.Rectangulo;

/**
 *
 * @author hhc
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.cargaDatos();
        System.out.println("\nEl área del Rectángulo es " + r1.area() + " cm2");
        System.out.println("\nEl perímetro del Rectángulo es " + r1.perimetro() + " cm \n");
        r1.dibuja();
    }

}
