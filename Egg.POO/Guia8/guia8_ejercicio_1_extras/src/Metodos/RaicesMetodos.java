package Metodos;

import Entidades.Raices;

/**
 *
 * @author Temporal
 */
public class RaicesMetodos {
//Método getDiscriminante(): devuelve el valor del discriminante
//(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

    public void discriminante(Raices r) {
        double discri = Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
        r.setDiscriminante(discri);
    }
//    Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0

    public boolean tieneRaices(Raices r) {
        if (r.getDiscriminante() >= 0) {
            return true;
        } else {
            return false;
        }
    }
//    Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.

    public boolean tieneRaiz(Raices r) {
        if (r.getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }
//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
//imprime las 2 posibles soluciones.

    public void obtenerRaices(Raices r) {
        boolean tieneR = tieneRaices(r);
        if (tieneR) {
            double g = ((-r.getB()) + Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());
            System.out.println("(-b+√((b^2)-(4*a*c)))/(2*a) = " + g);
            double g1 = ((-r.getB()) - Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());
            System.out.println("(-b-√((b^2)-(4*a*c)))/(2*a) = " + g1);

        }
    }
//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.

    public void obtenerRaiz(Raices r) {
        boolean tieneR = tieneRaiz(r);
        if (tieneR) {
            double g = ((-r.getB()) + Math.sqrt(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()))) / (2 * r.getA());
            System.out.println("resultado 1 = " + g);

        }
    }

//
//     Método calcular()
//: esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
//Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
//el signo delante de -b
    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);

        } else {
            System.out.println("La ecuación no tiene solución");
        }

    }
}
