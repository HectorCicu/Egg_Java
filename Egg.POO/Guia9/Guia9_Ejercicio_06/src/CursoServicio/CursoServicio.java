package CursoServicio;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 private String nombre;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
 */
public class CursoServicio {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearCurso(Curso cu) {
        int horasDia, diasSem;
        String tur;
        System.out.println("DATOS DEL CURSO");
        System.out.println("---------------");
        System.out.print("Nombre del Curso:  ");
        cu.setNombre(read.next());

        // controlo que no sean más de 12 horas por día    
        do {
            System.out.print("Cantidad de horas por día (hasta 12): ");
            horasDia = read.nextInt();
        } while (horasDia > 12);
        cu.setCantidadHorasPorDia(horasDia);

        // controlo que no sean más de 5 días por semana    
        do {
            System.out.print("Cantidad de días por Semana (hasta 5): ");
            diasSem = read.nextInt();
        } while (diasSem > 5);
        cu.setCantidadDiasPorSemana(diasSem);

        // controlo para que solo coloque t o m 
        do {
            System.out.print("Ingrese turno (m = mañana /  t = tarde): ");
            tur = read.next();

        } while (tur.equalsIgnoreCase("m") && tur.equalsIgnoreCase("t"));
        if ("m".equals(tur)) {
            cu.setTurno("MAÑANA");
        } else {
            cu.setTurno("TARDE");
        }
        System.out.print("Valor por hora $ ");
        cu.setPrecioPorHora(read.nextDouble());
        cargarAlumnos(cu);
    }

    public void cargarAlumnos(Curso c) {
        System.out.println("");
        String[] alum = new String[5];

        for (int i = 0; i < 5; i++) {
            alum[i] = "";
            do {
                System.out.print("Ingrese el nombre del alumno " + (i+1) + ":  ");
                alum[i] = read.next();
            } while ("".equals(alum[i]));
        }
        c.setAlumnos(alum);
    }

    public double calculaGananciaSemanal(Curso c) {
        return c.getPrecioPorHora()* c.getCantidadHorasPorDia()
                * c.getCantidadDiasPorSemana() * 5;
    }

    public void muestraClase(Curso c) {
        System.out.println("\nCURSO");
        System.out.println("-----");
        System.out.println("Nombre del curso: " + c.getNombre());
        System.out.println("Horas por día: " + c.getCantidadHorasPorDia());
        System.out.println("Días por semana: " + c.getCantidadDiasPorSemana());
        System.out.println("Turno: " + c.getTurno());
        System.out.println("Valor por hora $" + c.getPrecioPorHora());
        System.out.println("Ganancia Semanal $" + calculaGananciaSemanal(c));
        System.out.println("Alumnos: " + Arrays.toString(c.getAlumnos()));

    }
}
