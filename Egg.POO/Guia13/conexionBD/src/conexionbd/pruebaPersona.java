package conexionbd;

/**
 *
 * @author Hector Cicutti
 */
public class pruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        persona p1 = new persona();
        String nombre = null;
        try {
            if (!nombre.equals(null)) {
                p1.setNombre(nombre);
            }
        } catch (Exception e) {
            System.out.println("eL VALOR NO PUDE SE NULO");
        }
    }

}
