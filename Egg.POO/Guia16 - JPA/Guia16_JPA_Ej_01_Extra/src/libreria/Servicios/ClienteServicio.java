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

            System.out.print("Ingrese Documento...: ");
            documento = read.nextLong();
            System.out.print("Ingrese nombre.........: ");
            nombre = read.next();
            System.out.print("Ingrese apellido.........: ");
            apellido = read.next();
            System.out.print("Ingrese Teléfono........: ");
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
                    System.out.println("\nSe dio de alta el Cliente");

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

    public void crearClientes() throws Exception {
        cd.guardarCliente(new Cliente(12345678L, "Juan", "Pérez", "123-456-7890"));
        cd.guardarCliente(new Cliente(23456789L, "María", "García", "234-567-8901"));
        cd.guardarCliente(new Cliente(34567890L, "Pedro", "González", "345-678-9012"));
        cd.guardarCliente(new Cliente(45678901L, "Laura", "Rodríguez", "456-789-0123"));
        cd.guardarCliente(new Cliente(56789012L, "Carlos", "Martínez", "567-890-1234"));
        cd.guardarCliente(new Cliente(67890123L, "Ana", "López", "678-901-2345"));
        cd.guardarCliente(new Cliente(78901234L, "Jorge", "Sánchez", "789-012-3456"));
        cd.guardarCliente(new Cliente(89012345L, "Patricia", "Fernández", "890-123-4567"));
        cd.guardarCliente(new Cliente(90123456L, "Luis", "Gómez", "901-234-5678"));
        cd.guardarCliente(new Cliente(01234567L, "Marta", "Díaz", "012-345-6789"));
        cd.guardarCliente(new Cliente(12345789L, "Fernando", "Ruiz", "123-457-8901"));
        cd.guardarCliente(new Cliente(23456890L, "Lucía", "Sosa", "234-568-9012"));
        cd.guardarCliente(new Cliente(34567901L, "Mario", "Castro", "345-679-0123"));
        cd.guardarCliente(new Cliente(45679012L, "Silvia", "Luna", "456-790-1234"));
        cd.guardarCliente(new Cliente(56790123L, "Diego", "Ortega", "567-901-2345"));
        cd.guardarCliente(new Cliente(67891234L, "Carmen", "Núñez", "678-912-3456"));
        cd.guardarCliente(new Cliente(78902345L, "Pablo", "Giménez", "789-023-4567"));
        cd.guardarCliente(new Cliente(89013456L, "Sofía", "Vega", "890-134-5678"));
        cd.guardarCliente(new Cliente(90124567L, "Ricardo", "Hernández", "901-245-6789"));
        cd.guardarCliente(new Cliente(1235678L, "Marcela", "Flores", "012-356-7890"));
        cd.guardarCliente(new Cliente(12346789L, "Gabriel", "Chávez", "123-467-8901"));
        cd.guardarCliente(new Cliente(23457890L, "Valeria", "Navarro", "234-578-9012"));
        cd.guardarCliente(new Cliente(34568901L, "Renato", "Lorenzo", "345-689-0123"));
        cd.guardarCliente(new Cliente(45679023L, "Carla", "Santos", "456-790-1234"));
        cd.guardarCliente(new Cliente(56790134L, "Federico", "Molina", "567-901-2345"));
        cd.guardarCliente(new Cliente(67891245L, "Diana", "Ramos", "678-912-3456"));
        cd.guardarCliente(new Cliente(78902356L, "Gonzalo", "Soria", "789-023-4567"));
        cd.guardarCliente(new Cliente(89013467L, "Camila", "Bustos", "890-134-5678"));
        cd.guardarCliente(new Cliente(90124578L, "Esteban", "Pérez", "901-245-6789"));
        cd.guardarCliente(new Cliente(41235689L, "Lucas", "Gallo", "012-356-7890"));
    }
}
