package Metodos;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los
 * 8 estudiantes con sus respectivas notas. Una vez creado los estudiantes
 * deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
 * usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la
 * escuela. 
 * 1. Calcular y mostrar el promedio de notas de todo el curso 
 * 2.
 * Retornar otro arreglo con los nombre de los alumnos que recibieron una nota
 * mayor al promedio del curso 
 * 3. Por último, deberemos mostrar todos los
 * estudiantes con una nota mayor al promedio. Nota: para crear un vector de
 * objetos la definición es la siguiente: Objeto nombreVector[] = new Objeto[];
 *
 * @author Hector Cicutti
 */
public class IntegradorMetodos {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void cargaEstudiantes() {
        Estudiante[] est = new Estudiante[8];

        for (int i = 0; i <= est.length; i++) {
            double nota = 0;
            System.out.print("Ingrese el nombre del estudiante  " + (i + 1) + ": ");
            est[i].setNombre(read.next());
            do {
                System.out.print("Ingrese nota final: ");
                nota = read.nextDouble();
            } while (nota < 0 && nota > 10);

            est[i].setNota(nota);

        }

    }
    public void promedio(Estudiante[] est ) {
        double suma = 0;
        for (int i = 0 ; i <= est.length ; i++) {
         suma += est[i].getNota();  
            
        }
        
    }
public void Superaron(Estudiante est) {
    
}
}
