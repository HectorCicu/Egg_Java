package Services;

import Entities.EmpleadosFacultad;
import Entities.Estudiante;
import Entities.PersonalDeServicio;
import Entities.Profesor;
import Enums.Apellidos;
import Enums.Catedras;
import Enums.EstadosCivil;
import Enums.Materias;
import Enums.Nombres;
import Enums.Secciones;
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
        for (int i = 0; i < cant; i++) {
        ArrayList<String> curso = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                curso.add(Materias.obtenerMaterias(rand.nextInt(1, 41)));
            }
            est.add(new Estudiante(curso, rand.nextInt(42000000, 44000000), Nombres.obtenerNombre(rand.nextInt(1, 61)), Apellidos.obtenerApellido(rand.nextInt(1, 61)), EstadosCivil.obtenerEstadoCivil(rand.nextInt(1, 4))));
        }
        return est;
    }

    public static  ArrayList<EmpleadosFacultad> crearEmpleado(int cant) {
        ArrayList<EmpleadosFacultad> emp = new ArrayList<>();

        for (int i = 0; i < cant; i++) {
            emp.add(new EmpleadosFacultad(rand.nextInt(1990, 2023), rand.nextInt(1, 33), rand.nextInt(39000000, 42000000), Nombres.obtenerNombre(rand.nextInt(1, 61)), Apellidos.obtenerApellido(rand.nextInt(1, 61)), EstadosCivil.obtenerEstadoCivil(rand.nextInt(1, 5))));
        }
        return emp;
    }

    public static  ArrayList<Profesor> crearProfesor(int cant) {
        ArrayList<Profesor> profe = new ArrayList<>();

        for (int i = 0; i < cant; i++) {
            profe.add(new Profesor(Catedras.obtenerCatedras(rand.nextInt(1, 21)), rand.nextInt(17000000, 24000000), Nombres.obtenerNombre(rand.nextInt(1, 61)), Apellidos.obtenerApellido(rand.nextInt(1, 61)), EstadosCivil.obtenerEstadoCivil(rand.nextInt(1, 5))));
        }
        return profe;
    }

    public static ArrayList<PersonalDeServicio> crearPersonalDeServicio(int cant) {
        ArrayList<PersonalDeServicio> perserv = new ArrayList<>();

        for (int i = 0; i < cant; i++) {
            perserv.add(new PersonalDeServicio(Secciones.obtenerSecciones(rand.nextInt(1, 21)), rand.nextInt(17000000, 24000000), Nombres.obtenerNombre(rand.nextInt(1, 61)), Apellidos.obtenerApellido(rand.nextInt(1, 61)), EstadosCivil.obtenerEstadoCivil(rand.nextInt(1, 5))));
        }
        return perserv;
    }

    
}
