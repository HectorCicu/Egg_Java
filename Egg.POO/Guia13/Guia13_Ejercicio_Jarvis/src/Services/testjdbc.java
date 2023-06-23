package Services;
import java.sql.*;
/**
 *
 * @author Hector Cicutti
 */
public class testjdbc {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
                Connection conn = null;

        try {
            // Paso 1: Cargar el controlador JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Paso 2: Establecer la conexión
            String url = "jdbc:mysql://localhost:3306/jardineria";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);

            // Paso 3: Mostrar un mensaje de éxito
            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException ex) {
            // Manejar las excepciones
            ex.printStackTrace();
        } finally {
            // Cerrar la conexión
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
