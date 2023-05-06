package ProductoServices;

import java.util.HashMap;
import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class Servicios {
    public static Random rand = new Random();

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public static HashMap<String, Double> producto = new HashMap<>();

    public static void menuPrincipal() {
        int opcion, pelis;
        boolean continua = true;
        do {
            System.out.print("""
                         \nMENU PRINCIPAL
                         --------------
                         1) Cargar Productos
                         2) Listar Productos
                         3) Actualizar Precio
                         4) Borrar Producto
                         5) Carga productos masivos
                         6) Salir
                         Opcion: """);
            do {
                opcion = read.nextInt();
            } while (opcion < 1 || opcion > 6);

            switch (opcion) {
                case 1 -> {
                    cargaProductos();
                }
                case 2 -> {
                    listaProductos();
                }
                case 3 -> {
                    cambiaPrecio();
                }
                case 4 -> {
                    eliminaProducto();
                }
                case 5 -> {
                    System.out.print("Cantidad de productos: ");
                    cargaMasivaProductos(read.nextInt());
                }
                case 6 -> {

                    continua = false;
                }
            }
        } while (continua);
    }

    public static void cargaProductos() {

        char opcion;
        boolean continua = false;
        String produc;
        Double precio;
        System.out.println("\nCARGA DE PRODUCTOS");
        do {
            System.out.print("Producto: ");
            produc = read.next();
            System.out.print("Precio $: ");
            precio = read.nextDouble();

            producto.put(produc, precio);
            System.out.print("\n Continua? (S/N)> ");
            opcion = read.next().charAt(0);

            if (Character.toUpperCase(opcion) == 'N') {
                continua = true;
            }
        } while (!continua);

    }

    public static void listaProductos() {
        System.out.println("\nLISTA DE PRODUCTOS");
        for (String prod : producto.keySet()) {
            Double precio = producto.get(prod);
            System.out.println( prod + " - Precio $ " + precio);

        }
    }

    public static void cambiaPrecio() {
        String produc;
        System.out.print("Producto a modificar precio: ");
        produc = read.next();
        if (producto.containsKey(produc)) {
            System.out.print("Ingrese el nuevo importe");
            producto.put(produc, read.nextDouble());
        } else {
            System.out.print("No existe ese producto - Pulse ENTER para continuar");
            read.next();
        }
    }

    public static void eliminaProducto() {
        String produc;
        System.out.print("Producto a eliminar: ");
        produc = read.next();
        if (producto.containsKey(produc)) {

            producto.remove(produc);
            System.out.println("Producto elimnado - Pulse ENTER para continuar");
            read.next();
        } else {
            System.out.println("No existe ese producto - Pulse ENTER para continuar");
            read.next();
        }
    }
    public static void cargaMasivaProductos(int cant){
        for(int i = 0; i < cant ; ++i) {
            producto.put("Producto"+ rand.nextInt(1000, 9999), rand.nextDouble(100.25,4555.23));
        }
        
    }
}

/*
for(Map.Entry<String, Double> entry: productos.entrySet() ){
            System.out.println(entry);
            System.out.println("Solo key: "+ entry.getKey());
            System.out.println("->Solo valor: "+ entry.getValue() );
        }*/