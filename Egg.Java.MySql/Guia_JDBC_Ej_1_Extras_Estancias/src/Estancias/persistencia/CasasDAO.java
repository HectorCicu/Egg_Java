package Estancias.persistencia;

import Estancias.entidades.Casas;
import Estancias.entidades.CasasComentarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class CasasDAO extends DAO {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Casas ca = null;
    private static CasasComentarios cc = null;
    private static String sql;
    private static HashMap<String, Integer> casasPais = null;

    public Collection<Casas> consultarCasas(Date fdesde, Date fhasta, String country, Integer dias) throws SQLException, Exception {

        try {

            java.sql.Date fechaDMySQL = new java.sql.Date(fdesde.getTime());
            java.sql.Date fechaHMySQL = new java.sql.Date(fhasta.getTime());

            /*genero un script para tratar de abarcar la mayor cantidad posible de opciones. Si la consulta no tiene país, el valor es '', si no se necesita
            la cantidad de días = 0*/
            sql = "SELECT * FROM casas WHERE fecha_desde >= '" + fechaDMySQL + "' AND fecha_hasta <= '"
                    + fechaHMySQL + "' and pais like '%" + country + "%' AND  " + dias + " <= (tiempo_maximo -  tiempo_minimo) ";

            Collection houses = new ArrayList<>();

            consultaDB(sql);

            while (resultado.next()) {
                ca = new Casas();
                ca.setIdCasa(resultado.getInt(1));
                ca.setCalle(resultado.getString(2));
                ca.setNumero(resultado.getInt(3));
                ca.setCodPostal(resultado.getString(4));
                ca.setCiudad(resultado.getString(5));
                ca.setPais(resultado.getString(6));
                ca.setFechaDesde(resultado.getDate(7));
                ca.setFechaHasta(resultado.getDate(8));
                ca.setTiempoMinimo(resultado.getInt(9));
                ca.setTiempoMaximo(resultado.getInt(10));
                ca.setPrecioHabitacion(resultado.getDouble(11));
                ca.setTipoVivienda(resultado.getString(12));

                houses.add(ca);
            }
            desconectarDB();
            return houses;

        } catch (Exception e) {
            desconectarDB();
            throw new Exception("Error en DAO casas   - " + e.getMessage());
        }

    }

    public void ajustarPrecioCasas(int porcentaje) throws Exception {
        try {
            sql = "UPDATE casas SET precio = precio * " + (1 + (porcentaje / 100));
            abmDB(sql);
            desconectarDB();
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }
//Obtener el número de casas que existen para cada uno de los países diferentes.

    /**
     *
     * @return @throws java.lang.Exception
     */
    public HashMap<String, Integer> casasPorPais() throws Exception {
        try {
            sql = "SELECT pais, count(1) FROM casas GROUP BY pais";
            consultaDB(sql);
            casasPais = new HashMap();
            while (resultado.next()) {
                casasPais.put(resultado.getString(1), resultado.getInt(2));
            }
            desconectarDB();

            return casasPais;

        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    // Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
    //que están ‘limpias’.
    public Collection<CasasComentarios> consutarLimpias() throws SQLException, Exception {
        try {
            sql = "SELECT c.id_casa, c.calle, c.numero, c.codigo_postal, c.ciudad, c.pais, o.comentario FROM  "
                    + "casas AS c  INNER JOIN  comentarios AS o ON c.id_casa = o.id_casa "
                    + "WHERE   o.comentario LIKE '%limpi%'  AND c.tipo_vivienda = 'casa'";
            Collection houses = new ArrayList<>();

            consultaDB(sql);

            while (resultado.next()) {
                cc = new CasasComentarios();
                cc.setIdCasa(resultado.getInt(1));
                cc.setCalle(resultado.getString(2));
                cc.setNumero(resultado.getInt(3));
                cc.setCodPostal(resultado.getString(4));
                cc.setCiudad(resultado.getString(5));
                cc.setPais(resultado.getString(6));
                cc.setComentario(resultado.getString(7));

                houses.add(cc);
            }
            desconectarDB();
            return houses;

        } catch (Exception e) {
            throw e;
        }
    }
}
