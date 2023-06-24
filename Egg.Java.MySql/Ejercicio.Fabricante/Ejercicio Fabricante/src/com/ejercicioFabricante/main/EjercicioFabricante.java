
package com.ejercicioFabricante.main;

import com.ejercicioFabricante.connection.Conexion;
import com.ejercicioFabricante.services.InsertarRegistros;
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
      
//Conexion cn =  new Conexion();
//cn.miConexion();
InsertarRegistros ir = new InsertarRegistros();
ir.cargarProductos();
    }

}
