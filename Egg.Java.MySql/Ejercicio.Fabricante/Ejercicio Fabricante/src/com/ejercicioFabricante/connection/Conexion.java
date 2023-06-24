package com.ejercicioFabricante.connection;

import com.ejercicioFabricante.services.InsertarRegistros;
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
    String bd = "fabrica";
    String user = "root";
    String pass = "123456";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    //  InsertarRegistros ir = new InsertarRegistros();

    public Connection miConexion() throws SQLException {
        String[] marca = electro();
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //  String url= "jdbc:mysql://localhost:3306/jardineria";
            conn = DriverManager.getConnection(cadena, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa!");
            //Statement stmt = conn.createStatement();
            for (int i = 0; i < 20; ++i) {
                String sql = "INSERT INTO fabricante (codigo, nombre) VALUES (? , ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, 1001 + i + 10);
                stmt.setString(2, marca[i]);
                int n = stmt.executeUpdate();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error de conexión " + e.toString());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error no especificado " + e.toString());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    

    return conn ;
}

public String[] electro() {
        String[] marcas = new String[20]; // Creamos un array de 20 posiciones

// Agregamos algunas marcas de electrodomésticos al array
        marcas[0] = "Samsung";
        marcas[1] = "LG";
        marcas[2] = "Whirlpool";
        marcas[3] = "Electrolux";
        marcas[4] = "Bosch";
        marcas[5] = "Mabe";
        marcas[6] = "General Electric";
        marcas[7] = "Maytag";
        marcas[8] = "Haier";
        marcas[9] = "Panasonic";
        marcas[10] = "Daewoo";
        marcas[11] = "Sharp";
        marcas[12] = "Frigidaire";
        marcas[13] = "Hisense";
        marcas[14] = "Amana";
        marcas[15] = "Toshiba";
        marcas[16] = "Siemens";
        marcas[17] = "Philips";
        marcas[18] = "Kenmore";
        marcas[19] = "Zanussi";
        return marcas;
    }
}
