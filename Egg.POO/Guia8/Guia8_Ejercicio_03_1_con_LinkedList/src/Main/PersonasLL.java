package Main;

import Entidades.PersonaLL;
import Servicios.PersonaLLServicios;
import java.util.LinkedList;
import java.util.List;

/**
 * Versión con creación de arrays de objetos
 *
 * @author hhc
 */
public class PersonasLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<PersonaLL> pp = new LinkedList<PersonaLL>();
        PersonaLLServicios ps = new PersonaLLServicios();
        boolean[] edades = new boolean[4];
        int[] imcs = new int[4];

        //PersonaLL[] p1 = new PersonaLL[4];
        PersonaLL pers = new PersonaLL();
        for (int i = 0; i < 4; i++) {

            pp.add(ps.crearPersona(pers));
            //System.out.println(pp.toString());
            imcs[i] = ps.calcularIMC(pp, i);
            edades[i] = ps.mayorEdad(pp, i);
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
            if (edades[i]) {
                ++mayorEdad;
            }

        }

        System.out.println("el porcentaje de personas con  IMC bajo es " + (double) (imcbajo * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas con  IMC medio es " + (double) (imcnormal * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas con  IMC alto es " + (double) (imcalto * 100 / imcs.length) + "%");
        System.out.println("el porcentaje de personas mayores de edad es " + (double) (mayorEdad * 100 / edades.length) + "%");
        System.out.println("el porcentaje de personas menores de edad es " + (double) (100 - (mayorEdad * 100 / edades.length)) + "%");
    }

}
