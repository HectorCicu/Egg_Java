package com.ejercicioFabricante.services;

import java.awt.HeadlessException;
import java.sql.Connection;
import com.mysql.cj.xdevapi.Statement;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class InsertarRegistros {

    Connection conn = null;
    String bd = "fabrica";
    String user = "root";
    String pass = "123456";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    public Random rand = new Random();

    public void cargarProductos() throws SQLException {
        String[] producto = electrodomesticos();
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(cadena, user, pass);
            JOptionPane.showMessageDialog(null, "VAMOS MANAOS - CONEXIÓN CORRECTA!!");
            for (int i = 1; i < 1001; ++i) {
                String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES (? , ?, ?, ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, i * 2);
                stmt.setString(2, producto[rand.nextInt(0, 10)]);
                stmt.setDouble(3, rand.nextDouble(130000, 200000));
                stmt.setInt(4, rand.nextInt(1011, 1031));
                int n = stmt.executeUpdate();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
                JOptionPane.showMessageDialog(null, "YESSSSS!!!!!");
            } catch (SQLException ex) {
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error de conexión " + e.toString());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error no especificado " + e.toString());
        }

        //   return conn;  
    }

    public String[] electrodomesticos() {
        String[] tiposElectrodomesticos = {"Refrigerador", "Lavadora", "Secadora", "Estufa", "Horno de microondas", "Licuadora", "Batidora", "Aspiradora", "Horno eléctrico", "Cafetera"};
        return tiposElectrodomesticos;
    }
}
