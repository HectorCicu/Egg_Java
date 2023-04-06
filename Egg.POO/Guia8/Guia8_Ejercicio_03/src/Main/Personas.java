package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author hhc
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        boolean[] edades = new boolean[4];
        int[] imcs = new int[4];

        Persona p1 = new Persona();
        ps.crearPersona(p1);

        imcs[0] = ps.calcularIMC(p1);
        edades[0] = ps.mayorEdad(p1);

        Persona p2 = new Persona();
        ps.crearPersona(p2);
        imcs[1] = ps.calcularIMC(p2);
        edades[1] = ps.mayorEdad(p2);

        Persona p3 = new Persona();
        ps.crearPersona(p3);
        imcs[2] = ps.calcularIMC(p3);
        edades[2] = ps.mayorEdad(p3);

        Persona p4 = new Persona();
        ps.crearPersona(p4);
        imcs[3] = ps.calcularIMC(p4);
        edades[3] = ps.mayorEdad(p4);
        int imcbajo = 0, imcnormal = 0, imcalto = 0, mayorEdad = 0;

        for (int i = 0; i < imcs.length; ++i) {
            switch (imcs[i]) {
                case -1:
                    ++imcbajo;
                    break;
                case 0:
                    ++imcnormal;
                    break;
                case 1:
                    ++imcalto;
                    break;
            }
            if (edades[i] ){
                ++mayorEdad;
            }
                       
        }
        System.out.println("el porcentaje de personas con  IMC bajo es " + (double) (imcbajo * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas con  IMC medio es " + (double) (imcnormal * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas con  IMC alto es " + (double) (imcalto * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas mayores de edad es " + (double) (mayorEdad * 100 / edades.length) + "%");
        System.out.println("el porcentaje de personas menores de edad es " + (double) (1-(mayorEdad * 100 / edades.length)) + "%");
    }
    

}
