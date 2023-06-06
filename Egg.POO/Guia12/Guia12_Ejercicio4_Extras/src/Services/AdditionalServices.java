package Services;

import Entities.Estudiante;
import Enums.Apellidos;
import Enums.EstadosCivil;
import Enums.Materias;
import Enums.Nombres;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Hector Cicutti
 */
public class AdditionalServices {

    private static Random rand = new Random();

    public static ArrayList<Estudiante> crearEstudiante(int cant) {
        ArrayList<Estudiante> est = new ArrayList<>();
        ArrayList<String> curso = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < 5; j++) {
                curso.add(Materias.obtenerMaterias(rand.nextInt(1, 41)));
            }

            est.add(new Estudiante(curso, rand.nextInt(42000000, 44000000), Nombres.obtenerNombre(rand.nextInt(1, 61)), Apellidos.obtenerApellido(rand.nextInt(1, 61)), EstadosCivil.obtenerEstadoCivil(rand.nextInt(1, 4))));
        }

        return est;
    }
}
