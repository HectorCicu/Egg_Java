package libreria.Persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidades.Cliente;

/**
 *
 * @author Hector Cicutti
 */
public class ClienteDAO extends DAO<Cliente> {

    private static List<Cliente> clientes = null;
    private static Cliente cliente = null;

    public void guardarCliente(Cliente cli) throws Exception {
        try {
            super.grabar(cli);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCliente(Cliente cli) throws Exception {
        try {
            super.modificar(cli);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarCliente(Cliente cli) throws Exception {
        try {
            super.eliminar(cli);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Cliente> listarClientes() {
        try {
            super.conectar();
            clientes = new ArrayList();
            clientes = em.createNamedQuery("cliente.listar").getResultList();
            super.desconectar();
        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return clientes;
    }

    public Cliente buscarClientePorDocumento(Long documento) {
        try {
            cliente = new Cliente();
            super.conectar();
            cliente = (Cliente) em.createNamedQuery("cliente.buscarPorDoc").setParameter("docCliente", documento).getSingleResult();
            super.desconectar();

        } catch (NoResultException nre) {
            cliente = null;
            super.desconectar();

        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return cliente;
    }

    public Cliente buscarClientePorDNI(Long Id) {
        try {
            cliente = new Cliente();
            super.conectar();
            cliente = em.find(Cliente.class, Id);
            super.desconectar();

        } catch (Exception e) {

            if (em.isOpen()) {
                super.desconectar();
            }
            throw e;
        }
        return cliente;
    }
}
