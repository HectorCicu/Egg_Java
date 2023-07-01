

package Estancias.services;

import Estancias.entidades.Clientes;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class ClientesService {
 private static Clientes cli = null;
    private Collection<Clientes> customer = null;
    private String sql;
    private static boolean salir;    
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public void AltaCliente(Clientes c) {
        try{
        salir = false;
        
        }catch(Exception e) {
            throw e;
        }
        
    }
}
