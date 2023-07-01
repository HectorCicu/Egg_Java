package Estancias.persistencia;

import Estancias.entidades.Estancias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class EstanciasDAO extends DAO {

    private static Collection<Estancias> estancia = null;
    private static Estancias est = null;
    private static String sql;

    public void altaEstancias(Estancias es) throws Exception {
        try {
            if (es == null) {
                throw new Exception("La estancia está vacía!");
            }
            sql = "INSERT INTO estancias (id_estancias, id_cliente, id_casa, nombre_huesped, fech_desde, fecha_hasta) VALUES "
                    + es.getIdEstancia() + " , " + es.getIdCliente() + " , " + es.getIdCasa() + ", '" + es.getNombreCliente() + "', '"
                    + es.getFechaDesde() + "', '" + es.getFechaHasta() + "')";

            abmDB(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void bajaEstancias(Estancias es) throws Exception {
        try {
            if (es == null) {
                throw new Exception("La estancia está vacía!");
            }
            sql = "DELETE FROM estancias WHERE id_estancias  = " + es.getIdEstancia();
            abmDB(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<Estancias> consultaEstancias() throws Exception {
        try {
            sql = "SELECT  * FROM estancias";
            consultaDB(sql);
            estancia = new ArrayList();
            while (resultado.next()) {
                est = new Estancias();

                est.setIdEstancia(resultado.getInt(1));
                est.setIdCliente(resultado.getInt(2));
                est.setIdCasa(resultado.getInt(3));
                est.setNombreCliente(resultado.getString(1));
                est.setFechaDesde(resultado.getDate(4));
                est.setFechaHasta(resultado.getDate(5));

                estancia.add(est);
            }
            return estancia;
        } catch (Exception e) {
            throw e;

        }

    }
}
