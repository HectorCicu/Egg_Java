package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;

/**
 *
 * @author Hector Cicutti
 */
public final class DAOFabricante extends DAO {

    public void altaFabricante(Fabricante f) throws Exception {

        try {
            if (f == null) {
                throw new Exception("El fabricante está vacío!");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre) VALUES "
                    + "(  " + f.getCodigoFabricante() + " , ' " + f.getNombreFabricante() + " ' )";
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modficiarFabricante(Fabricante f) throws Exception {

        try {
            if (f == null) {
                throw new Exception("El fabricante está vacío!");
            }
            String sql = "UPDATE fabricante SET codigo =  "
                    + f.getCodigoFabricante() + " , nombre = ' " + f.getNombreFabricante() + " ' WHERE codigo = " + f.getCodigoFabricante() ;
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void bajaFabricante(Fabricante f) throws Exception {

        try {
            if (f == null) {
                throw new Exception("El fabricante está vacío!");
            }
            String sql = "UPDATE fabricante SET codigo =  "
                    + f.getCodigoFabricante() + " , nombre = ' " + f.getNombreFabricante() + " ' )";
            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
   
}
