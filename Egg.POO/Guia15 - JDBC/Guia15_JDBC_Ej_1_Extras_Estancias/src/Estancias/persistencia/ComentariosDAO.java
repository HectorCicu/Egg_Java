

package Estancias.persistencia;

import Estancias.entidades.Comentarios;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Hector Cicutti
 */
public class ComentariosDAO extends DAO {
private static String sql;
    private static Collection<Comentarios> comen = null;
    private static Comentarios com = null;

    public void altaCliente(Comentarios c) throws Exception {
        try {
            if (c == null) {
                throw new Exception("El comentario está vacío!");
            }
            sql = "INSERT INTO comentarios (id_comentario, id_casa, comentario) VALUES ("
                    + c.getIdComentario() + "," + c.getIdCasa() + ", '" + c.getComentario() + "')";

            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void bajaComentario(Comentarios c) throws Exception {
        try {
            if (c == null) {
                throw new Exception("El cometario está vacío!");
            }
            sql = "DELETE FROM clientes WHERE id_cliente = " + c.getIdComentario();

            abmDB(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Comentarios> consultaComentarios() throws Exception {
        try {
            sql = "SELECT * FROM comentarios";
            consultaDB(sql);
            comen = new ArrayList();
            while (resultado.next()) {
                com = new Comentarios();

                com.setIdComentario(resultado.getInt(1));
                com.setIdCasa(resultado.getInt(2));
                com.setComentario(resultado.getString(3));
              

                comen.add(com);
            }

        } catch (Exception e) {
            throw e;
        }
        return comen;
    }
}
