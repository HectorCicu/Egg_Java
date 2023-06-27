package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.DAOFabricante;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class FabricanteServices {

    private static Fabricante f2 = null;
    private static Fabricante fabri = null;
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    DAOFabricante df = new DAOFabricante();

    public void altaFabricante() throws Exception {

        boolean salir;
        char s;
        do {
            salir = false;
            try {
                int codfabri = 0;
                String nomfabri = "";

                fabri = new Fabricante();
                System.out.println("\nALTA FABRICANTE\n");
                System.out.print("Ingrese código de Fabricante: ");
                codfabri = read.nextInt();

                fabri = df.buscarFabricantePorCodigo(codfabri);
                if (fabri != null) {
                    JOptionPane.showMessageDialog(null, "YA EXISTE EL FABRICANTE  INGRESADO", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);

                    altaFabricante();
                } else {
                    f2 = new Fabricante();
                    // System.out.println("Product: " + produ.getNombreProducto());
                    System.out.print("Ingrese nombre: ");
                    nomfabri = read.next();

                    Fabricante f2 = new Fabricante(codfabri, nomfabri);
                    df.altaFabricante(f2);
                    do {
                        System.out.print("Desea ingresar otro Fabricante? (S/N): ");
                        s = read.next().toUpperCase().charAt(0);
                    } while (s != 'S' && s != 'N');
                    if (s == 'N') {
                        salir = true;
                    }
                }
            } catch (Exception e) {
                throw e;      //"Error en el ingreso de producto" + e.getMessage();
            }
        } while (!salir);
    }
}
