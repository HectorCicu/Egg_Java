package Tienda.Servicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class TiendaServices {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static final ProductoServices ps = new ProductoServices();
    private static final FabricanteServices fs = new FabricanteServices();

    public static void menu() {
        boolean salir;
        int opc = 0;
        do {
            salir = false;
            System.out.print("""
                           \nMENU
                           -------
                           1- Listar nombre de todos los productos
                           2- Listar nombres y precios de productos
                           3- Listar productos entre $ 120 y $ 202
                           4- Listar productos de tipo portátiles
                           5- Listar el producto más barato
                           6- Ingresar producto
                           7- Ingresar fabricante
                           8- Modificación de producto
                           9 - Salir
                               opcion ->.  """);
            try {
                opc = read.nextInt();
                switch (opc) {
                    case 1 ->
                        ps.listaProductos();
                    case 2 ->
                        ps.listaNombrePrecioProducto();
                    case 3 ->
                        ps.listaProductosSelectos();
                    case 4 ->
                        ps.listaPortatiles();
                    case 5 ->
                        ps.listaMasBarato();
                    case 6 ->
                        ps.altaProducto();
                    case 7 ->
                        fs.altaFabricante();
                    case 8 ->
                        ps.modificarProducto();
                    case 9 ->
                        salir = true;
                    default ->
                        JOptionPane.showMessageDialog(null, "Opción no válida!");

                }
            } catch (Exception e) {
                System.out.println("Ingresó un caracter no válido - Intente nuevamente " + e.getMessage());
                read.next();
                menu();
            }

        } while (!salir);

        System.out.println("\n¡MUCHAS GRACIAS, VUELVAS PRONTOS!\n");
    }
}
