package Estancias.services;

import Estancias.entidades.Clientes;
import Estancias.entidades.ClientesEstancias;
import Estancias.persistencia.ClientesDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class ClientesService {

    private static ClientesDAO cd = new ClientesDAO();
    private static Clientes cli = null;
    private Collection<Clientes> customer = null;
    private static Collection<ClientesEstancias> cliEstancias = null;
    private static ClientesEstancias cliEst = null;
    private static boolean salir;
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    /*
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.*/
//    public void AltaCliente(Clientes c) {
//        try {
//            salir = false;
//
//        } catch (Exception e) {
//            throw e;
//        }
//
//    }

    public void ClientesEstancias() {
        try {
            cliEstancias = new ArrayList();
            cliEstancias.addAll(cd.clienteEstancia(1,0));
            System.out.println("\nCLIENTES QUE ALQUILARON ESTANCIAS ");
            System.out.println("  Id      Nombre             Calle              Nro                CodPostal                             Ciudad                     Pais                             Email                                                  TipoVivienda");
            for (ClientesEstancias c :cliEstancias) {
                System.out.println(String.format("%10s%30s%25s%10s%10s%25s%30s%30s%30s", 
                        c.getId_cliente(), c.getNombre(), c.getCalle(), c.getNumero(),
                c.getCodigo_postal(),c.getCiudad(),c.getPais(), c.getEmail(), c.getTipoVivienda()));
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void ClientesReservas() {
        try {
            cliEstancias = new ArrayList();
            cliEstancias.addAll(cd.clienteEstancia(2,0));
            System.out.println("\nDetalle de Alquiler ");
            System.out.println("  Id      Nombre             CalleCasa              NroCasa               CodPostal                             Ciudad                     Pais                                                       TipoVivienda");
            for (ClientesEstancias c :cliEstancias) {
                System.out.println(String.format("%10s%30s%25s%10s%10s%25s%30s%30s", 
                        c.getId_cliente(), c.getNombre(), c.getCasaCalle(), c.getCasaNumero(),
                c.getCasaCodPos(),c.getCasaCiudad(),c.getCasaPais(), c.getTipoVivienda()));
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
