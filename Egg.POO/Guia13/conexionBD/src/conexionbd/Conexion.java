package conexionbd;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Hector Cicutti
 */
public class Conexion {

    Connection conn = null;
    String bd = "jardineria";
    String user = "root";
    String pass = "root";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection miConexion() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //  String url= "jdbc:mysql://localhost:3306/jardineria";
            conn = DriverManager.getConnection(cadena, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa!");
            Statement stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("select nombre_cliente, nombre_contacto, apellido_contacto from cliente");
            while (r.next()) {
                String i = r.getString("nombre_cliente");
                String s = r.getString("nombre_contacto");
                String d = r.getString("apellido_contacto");
// imprimimos los valores de la fila actual
                System.out.println("Fila = " + i + " " + s + " " + d);
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error de conexión " + e.toString());
        }catch (RuntimeException e) {
         JOptionPane.showMessageDialog(null, "Ocurrió un error no especificado " + e.toString());
    }
        return conn;
    }
}
