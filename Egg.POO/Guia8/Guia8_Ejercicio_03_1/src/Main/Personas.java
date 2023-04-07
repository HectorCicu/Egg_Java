package Main;

import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *  Versión con creación de arrays de objetos
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

        Persona[] p1 = new Persona[4];
        
        for (int i = 0 ; i < p1.length; i++ ) {
        p1[i] = new Persona();
        
        ps.crearPersona(p1[i]);

        imcs[i] = ps.calcularIMC(p1[i]);
        edades[i] = ps.mayorEdad(p1[i]);
        }
        double imcbajo = 0, imcnormal = 0, imcalto = 0, mayorEdad = 0;

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
        System.out.println("el porcentaje de personas menores de edad es " + (double) (100-(mayorEdad * 100 / edades.length)) + "%");
    }
    

}
