package Estancias.persistencia;

import Estancias.entidades.Clientes;
import Estancias.entidades.ClientesEstancias;
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
    private static ClientesEstancias cliEst = null;
    private static Collection<ClientesEstancias> clientes = null;

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

    public Collection<ClientesEstancias> clienteEstancia(int opc, Integer codcli) throws Exception {
        try {
           if(opc == 1) {
            sql = "select  c.id_cliente, c.nombre, c.calle, c.numero, c.codigo_postal,c.ciudad, c.pais, c.email, h.tipo_vivienda, h.calle, h.numero,"
                    + " h.codigo_postal, h.ciudad, h.pais  from clientes as c "
                    + "INNER JOIN estancias as e on c.id_cliente = e.id_cliente "
                    + "INNER JOIN casas as h on e.id_casa = h.id_casa";
           }else {
               sql = "select  c.id_cliente, c.nombre, c.calle, c.numero, c.codigo_postal,c.ciudad, c.pais, c.email, h.tipo_vivienda, h.calle, h.numero,"
                    + " h.codigo_postal, h.ciudad, h.pais  from clientes as c "
                    + "INNER JOIN estancias as e on c.id_cliente = e.id_cliente "
                    + "INNER JOIN casas as h on e.id_casa = h.id_casa"
                       + "WHERE c.id_cliente = " +  codcli;
           
           }
            consultaDB(sql);
            clientes = new ArrayList();
            while (resultado.next()) {
                cliEst = new ClientesEstancias();

                cliEst.setId_cliente(resultado.getInt(1));
                cliEst.setNombre(resultado.getString(2));
                cliEst.setCalle(resultado.getString(3));
                cliEst.setNumero(resultado.getInt(4));
                cliEst.setCodigo_postal(resultado.getString(5));
                cliEst.setCiudad(resultado.getString(6));
                cliEst.setPais(resultado.getString(7));
                cliEst.setEmail(resultado.getString(8));
                cliEst.setCasaCalle(resultado.getString(9));
                cliEst.setCasaNumero(resultado.getInt(10));
                cliEst.setCasaCodPos(resultado.getString(11));
                cliEst.setCasaCiudad(resultado.getString(12));
                cliEst.setCasaPais(resultado.getString(13));

                clientes.add(cliEst);
            }
        return clientes;

        } catch (Exception e) {
            throw e;
        }
    }
    
}
