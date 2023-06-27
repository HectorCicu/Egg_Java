package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.DAOProducto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class ProductoServices {

    DAOProducto dp = new DAOProducto();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static ArrayList<Producto> pdt = new ArrayList<>();
    private static Producto produ = null;
    private static Producto p2 = null;

    public void modificarProducto() {

        try {
            int codprod;
            int codfabri = 0;
            String nomprod = "";
            double precprod = 0;
            produ = new Producto();
            System.out.println("\nMODIFICACION DE PRODUCTO\n");
            System.out.print("Ingrese código de producto: ");
            codprod = read.nextInt();

            produ = dp.buscarProductoPorCodigo(codprod);

            if (produ.getNombreProducto() != null) {
                System.out.println("Product: " + produ.getNombreProducto());
                System.out.print("Ingrese nombre (Enter para no modificar): ");
                nomprod = read.next();
                System.out.print("Ingrese nuevo precio (Cero para no modificar): ");
                precprod = read.nextDouble();
                System.out.print("Ingrese nuevo fabricante (Cero para no modificar): ");
                codfabri = read.nextInt();

                if (nomprod.equals("")) {
                    nomprod = produ.getNombreProducto();
                }
                if (precprod == 0) {
                    precprod = produ.getPrecioProducto();
                }
                if (codfabri == 0) {
                    codfabri = produ.getCodigoFabricante();
                }
                Producto p2 = new Producto(codprod, nomprod, precprod, codfabri);
                dp.modificaProducto(p2);
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE PRODUCTO INGRESADO", "ATENCION!", codfabri);

                modificarProducto();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de producto" + e.getMessage());
        }
    }

    public void altaProducto() throws Exception {
        boolean salir;
        char s;
        do {
            salir = false;
            try {
                int codprod;
                int codfabri = 0;
                String nomprod = "";
                double precprod = 0;
                produ = new Producto();
                System.out.println("\nALTA DE PRODUCTO\n");
                System.out.print("Ingrese código de producto: ");
                codprod = read.nextInt();

                produ = dp.buscarProductoPorCodigo(codprod);
                if (produ != null) {
                    JOptionPane.showMessageDialog(null, "YA EXISTE EL PRODUCTO INGRESADO", "ATENCION!", JOptionPane.INFORMATION_MESSAGE);

                    altaProducto();
                } else {
                    p2 = new Producto();
                    // System.out.println("Product: " + produ.getNombreProducto());
                    System.out.print("Ingrese nombre: ");
                    nomprod = read.next();
                    System.out.print("Ingrese precio: ");
                    precprod = read.nextDouble();
                    System.out.print("Ingrese código fabricante: ");
                    codfabri = read.nextInt();

                    Producto p2 = new Producto(codprod, nomprod, precprod, codfabri);
                    dp.altaProducto(p2);
                    do {
                        System.out.print("Desea ingresar otro producto? (S/N): ");
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

    public void listaProductos() throws Exception {
        System.out.println("\nLISTA NOMBRE PRODUCTOS");
        pdt = new ArrayList<>();
        pdt.addAll(dp.listarProductoNombre());
        for (Producto producto : pdt) {
            System.out.println("Cód. Prod " + producto.getCodigoProducto() + " -  Nombre: " + producto.getNombreProducto());
        }
        System.out.println("\nPulse ENTER para continuar");
        read.next();
    }

    public void listaNombrePrecioProducto() throws Exception {
        System.out.println("\nLISTA PRODUCTOS");
        pdt = new ArrayList<>();
        pdt.addAll(dp.listarProductoNombre());
        for (Producto producto : pdt) {
            System.out.println("Cód. Prod " + producto.getCodigoProducto() + " -  Nombre: " + producto.getNombreProducto()
                    + "    - Precio $ " + producto.getPrecioProducto() + "  - Cód. Fabric. " + producto.getCodigoFabricante());
        }
        System.out.println("\nPulse ENTER para salir");
        read.next();
    }

    public void listaProductosSelectos() throws Exception {
        System.out.println("\nLISTA PRODUCTOS ENTRE $120 y $202");
        pdt = new ArrayList<>();
        pdt.addAll(dp.listarProductoporPrecio());
        for (Producto producto : pdt) {
            System.out.println("Cód. Prod " + producto.getCodigoProducto() + " -  Nombre: " + producto.getNombreProducto()
                    + "    - Precio $ " + producto.getPrecioProducto() + "  - Cód. Fabric. " + producto.getCodigoFabricante());
        }
        System.out.println("\nPulse ENTER para continuar");
        read.next();
    }

    public void listaPortatiles() throws Exception {
        System.out.println("\nLISTA PRODUCTOS TIPO PORTÁTIL");
        pdt = new ArrayList<>();
        pdt.addAll(dp.listarProductoporPortatil());
        for (Producto producto : pdt) {
            System.out.println("Cód. Prod " + producto.getCodigoProducto() + " -  Nombre: " + producto.getNombreProducto()
                    + "    - Precio $ " + producto.getPrecioProducto() + "  - Cód. Fabric. " + producto.getCodigoFabricante());
        }
        System.out.println("\nPulse ENTER para continuar");
        read.next();
    }

    public void listaMasBarato() throws Exception {
        System.out.println("\nLISTA PRODUCTO MÁS BARATO");
        pdt = new ArrayList<>();
        pdt.addAll(dp.listarProductoMasBarato());
        for (Producto producto : pdt) {
            System.out.println("Cód. Prod " + producto.getCodigoProducto() + " -  Nombre: " + producto.getNombreProducto()
                    + "    - Precio $ " + producto.getPrecioProducto() + "  - Cód. Fabric. " + producto.getCodigoFabricante());
        }
        System.out.println("\nPulse ENTER para continuar");
        read.next();
    }
}
