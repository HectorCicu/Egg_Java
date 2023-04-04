package Nespresso;

import Cafetera.Cafetera;
import CafeteraService.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author hhc
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicios cs1 = new CafeteraServicios();
        Cafetera caf = new Cafetera();
        boolean salir = false;
        do {

            System.out.print("""
                              \nOPCIONES
                              --------
                              1- Llenar Cafetera
                              2- Servir Café
                              3- Vaciar cafetera
                              4- Cargar Cafetera
                              5- Salir
                              
                              Opción ->  """);
            int opc = read.nextInt();

            switch (opc) {
                case 1:
                    cs1.llenarCafetera(caf);
                    break;
                case 2:
                    cs1.servirTaza(caf);
                    break;
                case 3:
                    cs1.vaciarCafetera(caf);
                    break;
                case 4:
                    cs1.cargarCafetera(caf);
                    break;
                case 5:
                    salir = true;

            }
            

        } while (!salir);
        System.out.println("\nMuchas Gracias! Vuelvas Prontos!\n");
    }

}
