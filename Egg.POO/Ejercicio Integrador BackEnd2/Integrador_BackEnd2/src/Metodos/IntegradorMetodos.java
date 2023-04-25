package Metodos;

/**
 *
 * @author Hector Cicutti
 */
import Entidades.Estudiante;
import Entidades.Promedio;
import java.util.Arrays;
import java.util.Scanner;

/**
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
 * 8 estudiantes con sus respectivas notas. Una vez creado los estudiantes
 * deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
 * usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la
 * escuela. 1. Calcular y mostrar el promedio de notas de todo el curso 2.
 * Retornar otro arreglo con los nombre de los alumnos que recibieron una nota
 * mayor al promedio del curso 3. Por último, deberemos mostrar todos los
 * estudiantes con una nota mayor al promedio. Nota: para crear un vector de
 * objetos la definición es la siguiente: Objeto nombreVector[] = new Objeto[];
 *
 * @author Hector Cicutti
 */
public class IntegradorMetodos {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    Promedio prom = new Promedio();
    Estudiante[] est = new Estudiante[8];
    
public void cargaEstudiantes() {

        for (int i = 0; i < est.length; i++) {
            double nota = 0;
            System.out.print("Ingrese el nombre del estudiante  " + (i + 1) + ": ");
            est[i] = new Estudiante();
            est[i].setNombre(read.next());
            do {
                System.out.print("Ingrese nota final: ");
                nota = read.nextDouble();
            } while (nota < 0 && nota > 10);

            est[i].setNota(nota);

        }

    }

    public void promedio(Estudiante[] est) {
        double suma = 0;
        for (int i = 0; i < est.length; i++) {
            suma += est[i].getNota();

        }
        prom.setProm(suma / est.length);
    }

    public void superaron(Estudiante[] est) {
        int supero = 0, supero2 = 0;
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota() > prom.getProm()) {
                supero++;

            }
        }
        String[] nombres = new String[supero];
        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota() > prom.getProm()) {
                nombres[supero2] = est[i].getNombre();
                supero2++;
            }
        }
        System.out.println("El promedio general es de: " + prom.getProm());
        System.out.println("\nLa cantidad de alumnos que superó el promedio es: " + supero);
        System.out.println("Alumnos que superaron el promedio" + Arrays.toString(nombres));
    }

    public void mostrarSuperoPromedio(Estudiante[] est) {

        for (int i = 0; i < est.length; i++) {
            if (est[i].getNota() > prom.getProm()) {
                System.out.println(est[i].toString());

            }
        }
    }

    public void comienzo() {
        cargaEstudiantes();
        promedio(est);
        superaron(est);
        mostrarSuperoPromedio(est);

    }

}
