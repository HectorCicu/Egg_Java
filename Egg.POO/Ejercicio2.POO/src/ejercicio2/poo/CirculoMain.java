package ejercicio2.poo;

import ejercicio2.poo.Circulo.Circulo;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos: a)
 * Método constructor que inicialice el radio pasado como parámetro. b) Métodos
 * get y set para el atributo radio de la clase Circunferencia. c) Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. d) Método area(): para calcular el área de la circunferencia (Area=〖
 * π*radio〗^2). e) Método perimetro(): para calcular el perímetro
 * (Perimetro=2*π*radio). 2
 *
 * @author hhc
 */
public class CirculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.crearCirculo();

        Circulo c2 = new Circulo(2.55);

        Circulo c3 = new Circulo(333);

        Circulo c4 = new Circulo();
        c4.crearCirculo();

        Circulo c5 = new Circulo(77);

        System.out.println("\nEl área del C1 es. " + c1.areaCirculo(c1.getRadio()));
        System.out.println("\nEl perímetro del C1 es. " + c1.perimCirculo(c1.getRadio()));
        System.out.println("\nEl área del C2 es. " + c2.areaCirculo(c2.getRadio()));
        System.out.println("\nEl perímetro del C2 es. " + c2.perimCirculo(c2.getRadio()));
        System.out.println("\nEl área del C3 es. " + c3.areaCirculo(c3.getRadio()));
        System.out.println("\nEl perímetro del C3 es. " + c3.perimCirculo(c3.getRadio()));
        System.out.println("\nEl área del C4 es. " + c4.areaCirculo(c4.getRadio()));
        System.out.println("\nEl perímetro del C4 es. " + c4.perimCirculo(c4.getRadio()));
        System.out.println("\nEl área del C5 es. " + c5.areaCirculo(c5.getRadio()));
        System.out.println("\nEl perímetro del C5 es. " + c5.perimCirculo(c5.getRadio()));

    }

}
