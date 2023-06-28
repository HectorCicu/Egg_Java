

package Estancias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public abstract class DAO {
protected Connection conexion = null;
    protected Statement sentencia = null;
    protected ResultSet resultado = null;

    private final String USER = "root";
    private final String PASS = "root";
    private final String DATABASE = "estancias";
    private final String IP = "localhost";
    private final String PUERTO = "3306";
    private final String CADENA = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + DATABASE+ "?useSSL=false";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarDB() throws Exception {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(CADENA, USER, PASS);
                   } catch (ClassNotFoundException | SQLException e) {
            throw e;

        }
    }

    protected void desconectarDB() throws SQLException {
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (resultado != null) {
                resultado.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    protected void abmDB(String sql) throws Exception {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            //desconectarDB();
        }
    }

    protected void consultaDB(String sql) throws Exception {
        try {
            conectarDB();                                                                         //consultar la base de datos, los resultados
            sentencia = conexion.createStatement();                               //de la consulta se guardan en la variable
            resultado = sentencia.executeQuery(sql);                    //resultado.
        } catch (Exception e) {
            throw e;
        } finally {
            //desconectarDB();
        }

    }
}
