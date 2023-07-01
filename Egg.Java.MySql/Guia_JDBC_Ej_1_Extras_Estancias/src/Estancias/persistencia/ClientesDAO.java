package Estancias.persistencia;

import Estancias.entidades.Clientes;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class ClientesDAO extends DAO {

    private static String sql;
    private static Collection<Clientes> cust = null;
    private static Clientes cli = null;

    public void altaCliente(Clientes c) throws Exception {
        try {
            if (c == null) {
                throw new Exception("El cliente está vacío!");
            }
            sql = "INSERT INTO clientes (id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES ("
                    + c.getIdCliente() + ",'" + c.getNombre() + "', '" + c.getCalle() + "', " + c.getNumero() + " , '" + c.getCodigoPostal() + "', '" + c.getCiudad() + "', '" + c.getPais() + "', '" + c.getEmail() + "')";

            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void bajaCliente(Clientes c) throws Exception {
        try {
            if (c == null) {
                throw new Exception("El cliente está vacío!");
            }
            sql = "DELETE FROM clientes WHERE id_cliente = " + c.getIdCliente();

            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Clientes> consultaClientes() throws Exception {
        try {
            sql = "SELECT * FROM clientes";
            consultaDB(sql);
            cust = new ArrayList();
            while (resultado.next()) {
                cli = new Clientes();

                cli.setIdCliente(resultado.getInt(1));
                cli.setNombre(resultado.getString(2));
                cli.setCalle(resultado.getString(3));
                cli.setNumero(resultado.getInt(4));
                cli.setCodigoPostal(resultado.getString(5));
                cli.setCiudad(resultado.getString(6));
                cli.setPais(resultado.getString(7));
                cli.setEmail(resultado.getString(8));

                cust.add(cli);
            }

        } catch (Exception e) {
            throw e;
        }
        return cust;
    }
}
