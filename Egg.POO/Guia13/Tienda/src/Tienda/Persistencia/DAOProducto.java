package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class DAOProducto extends DAO {

    //private static ArrayList<Producto> produc = null;
    private static Producto pd = null;

    public void altaProducto(Producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("El producto está vacío!");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio ,codigo_fabricante) VALUES "
                    + "(  " + p.getCodigoProducto() + " , ' " + p.getNombreProducto() + " ' , " + p.getPrecioProducto() + " , " + p.getCodigoFabricante() + " )";
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void bajaProducto(Producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("El producto está vacío!");
            }
            String sql = "DELETE FROM producto WHERE codigo  =  " + p.getCodigoProducto();
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificaProducto(Producto p) throws Exception {

        try {
            if (p == null) {
                throw new Exception("El producto está vacío!");
            }
            String sql = "UPDATE producto set codigo  = " + p.getCodigoProducto() + ", nombre = ' "
                    + p.getNombreProducto() + "' , precio = " + p.getPrecioProducto() + " ,codigo_fabricante = " + p.getCodigoFabricante()
                    + " WHERE codigo = " + p.getCodigoProducto();
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductoNombre() throws Exception {
        String sql = "Select * FROM producto";
        Collection<Producto> produc = new ArrayList();
        Producto pd = null;
        try {
            consultaDB(sql);
//            ResultSetMetaData rsmd = (ResultSetMetaData) resultado.getMetaData();
//            int columnCount = rsmd.getColumnCount();
//            for (int i = 1; i <= columnCount; i++) {
//                String name = rsmd.getColumnName(i);
//                String type = rsmd.getColumnTypeName(i);
//                int size = rsmd.getColumnDisplaySize(i);
//                System.out.println("Columna " + i + ": " + name + " (" + type + "), tamaño: " + size);
//            }
            while (resultado.next()) {
                pd = new Producto();

                //System.out.println(resultado.toString());
                pd.setCodigoProducto(resultado.getInt(1));
                pd.setNombreProducto(resultado.getString(2));
                pd.setPrecioProducto(resultado.getDouble(3));
                pd.setCodigoFabricante(resultado.getInt(4));

                produc.add(pd);
            }

            desconectarDB();
            return produc;
        } catch (Exception e) {
            desconectarDB();
            e.printStackTrace();
            // System.out.println("catch de daoProducto listarpornombre " + e.getMessage());
            throw new Exception("Catch de dao producto listarpornombre");
        }
    }

    public Producto buscarProductoPorCodigo(int cod) throws Exception {
        String sql = "Select * FROM producto WHERE codigo = " + cod;
        Collection<Producto> produc = new ArrayList();
        Producto pd = null;
        try {
            consultaDB(sql);
            while (resultado.next()) {
                pd = new Producto(resultado.getInt(1), resultado.getString(2),
                        resultado.getDouble(3), resultado.getInt(4));
            }

            desconectarDB();
            return pd;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> listarProductoporPrecio() throws Exception {
        String sql = "Select * FROM producto WHERE precio BETWEEN 120 and 202";
        Collection<Producto> produc = new ArrayList();
        Producto pd = null;

        try {
            consultaDB(sql);
            while (resultado.next()) {
                produc.add(new Producto(resultado.getInt(1), resultado.getString(2),
                        resultado.getDouble(3), resultado.getInt(4)));
            }

            desconectarDB();
            return produc;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> listarProductoporPortatil() throws Exception {
        String sql = "Select * FROM producto WHERE nombre LIKE '%portátil%' ";
        Collection<Producto> produc = new ArrayList();
        Producto pd = null;
        try {
            consultaDB(sql);
            while (resultado.next()) {
                produc.add(new Producto(resultado.getInt(1), resultado.getString(2),
                        resultado.getDouble(3), resultado.getInt(4)));
            }
            desconectarDB();
            return produc;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public Collection<Producto> listarProductoMasBarato() throws Exception {
        String sql = "Select * FROM producto ORDER BY precio ASC LIMIT 1";
        Collection<Producto> produc = new ArrayList();
        Producto pd = null;
        try {
            consultaDB(sql);
            while (resultado.next()) {
                produc.add(new Producto(resultado.getInt(1), resultado.getString(2),
                        resultado.getDouble(3), resultado.getInt(4)));
            }

            desconectarDB();
            return produc;
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

}
