package libreria.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import libreria.Persistencia.ClienteDAO;
import libreria.entidades.Cliente;

/**
 *
 * @author Hector Cicutti
 */
public class ClienteServicio {

    private static ClienteDAO cd = new ClienteDAO();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Cliente cliente = null;
    private static List<Cliente> clientes = null;
    private static Integer id;
    private static Long documento;
    private static String nombre;
    private static String apellido;
    private static String telefono;

    public void altaCliente() throws Exception {

        System.out.println("ALTA CLIENTE");
        try {

            System.out.print("Ingrese Documento: ");
            documento = read.nextLong();
            System.out.print("Ingrese nombre: ");
            nombre = read.next();
            System.out.print("Ingrese apellido: ");
            apellido = read.next();
            System.out.print("Ingrese Teléfono: ");
            telefono = read.next();

            cliente = new Cliente();
            cliente = cd.buscarClientePorDocumento(documento);
            if (cliente == null) {
                cliente = new Cliente(documento, nombre, apellido, telefono);
                cd.guardarCliente(cliente);
                System.out.println("Se dio de alta el Cliente");
            } else {
                System.out.println("Ya existe el cliente con ese documento ");
                for (Cliente cli : clientes) {
                    System.out.println("ID: " + cli.getId() + " --- Nombre: " + cli.getNombre() + " -  Apellido " + cli.getApellido());
                }
                System.out.print("Quiere darlo de alta igual? (S/N)");
                char sn = read.next().toUpperCase().charAt(0);
                if (sn == 'S') {
                    cliente = new Cliente(documento, nombre, apellido, telefono);
                    cd.guardarCliente(cliente);
                    System.out.println("Se dio de alta el Cliente");

                }
            }

        } catch (Exception e) {
            throw e;
        }
        System.out.println("Pulse ENTER para continuar");
        var a = read.next();
    }

    public void listaClientes() {
        clientes = new ArrayList();
        clientes = cd.listarClientes();
        System.out.println("\n  Id       Documento                      Nombre                                   Apellido                                  Teléfono");
        for (Cliente cliente1 : clientes) {
            System.out.printf("%6s %-15s %-30s %-30s %-20s\n", cliente1.getId(), cliente1.getDocumento(),
                    cliente1.getNombre(), cliente1.getApellido(), cliente1.getTelefono());

        }
        System.out.println("\nPulse ENTER para continuar");
        var a = read.next();
    }

    public void bajaCliente() throws Exception {

        System.out.println("ELIMINA CLIENTE");
        try {
            System.out.print("Ingrese Documento: ");
            documento = read.nextLong();

            cliente = new Cliente();
            cliente = cd.buscarClientePorDNI(documento);
            if (Objects.equals(cliente.getDocumento(), documento)) {
                System.out.println("ID: " + cliente.getId() + "  - Doc.: " + cliente.getDocumento() + " --- Nombre: " + cliente.getNombre() + " -  Apellido " + cliente.getApellido());
                System.out.print("Confirma la baja? (S/N)");
                char sn = read.next().toUpperCase().charAt(0);
                if (sn == 'S') {
                    cliente = new Cliente(documento, nombre, apellido, telefono);
                    cd.eliminarCliente(cliente);
                    System.out.println("Se dio de baja el Cliente");
                } else {
                    System.out.println("Se canceló la baja del cliente");
                }
            } else {
                System.out.println("No existe cliennte con ese documento en la base de datos");
            }

        } catch (Exception e) {
            throw e;
        }
        System.out.println("Pulse ENTER para continuar");
        var a = read.next();
    }
}
