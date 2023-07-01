package Estancias.persistencia;

import Estancias.entidades.Familias;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class FamiliasDAO extends DAO {

    private static Familias fami = new Familias();

    /**
     *
     * @return Familia Collection
     * @throws Exception
     */
    public Collection<Familias> consultaFamiliasCon3Hijos() throws Exception {

        try {
            String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";
            Collection family = new ArrayList<>();
            consultaDB(sql);

            while (resultado.next()) {
                fami = new Familias();

                fami.setIdFamilia(resultado.getInt(1));
                fami.setNombreFamilia(resultado.getString(2));
                fami.setEdadMinima(resultado.getInt(3));
                fami.setEdadMaxima(resultado.getInt(4));
                fami.setNumHijos(resultado.getInt(5));
                fami.setEmail(resultado.getString(6));
                fami.setIdCasaFamilia(resultado.getInt(7));

                family.add(fami);
            }

            desconectarDB();
            return family;
        } catch (Exception e) {
            desconectarDB();
            e.printStackTrace();
            throw new Exception("Error en DAO Familias");
        }
    }

}
