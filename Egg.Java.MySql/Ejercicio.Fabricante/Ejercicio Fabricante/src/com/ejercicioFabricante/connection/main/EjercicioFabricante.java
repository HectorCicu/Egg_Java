
package com.ejercicioFabricante.connection.main;

import com.ejercicioFabricante.connection.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Hector Cicutti
 */
public class EjercicioFabricante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      
Conexion cn =  new Conexion();
cn.miConexion();
    }

}
