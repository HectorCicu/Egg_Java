
package conexionbd;

import java.sql.SQLException;

/**
 *
 * @author Hector Cicutti
 */
public class ConexionBD {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
    try{  
Conexion cn = new Conexion();
cn.miConexion();
    } catch (Exception e) {
        System.out.println("kilombete!! " + e.toString());
    }
    }

}
