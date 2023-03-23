package Egg.Guia5.Java_Arreglos;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
 *
 * @author hhc
 */
public class Ejercicio_04_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prom = 0;
        Scanner read = new Scanner(System.in);
        double[] promedios = new double[10];
        for (int i = 0; i < promedios.length; ++i) {
            System.out.println("\nALUMNO NRO: " + (i + 1));

            prom = calculaPromedio();
            llenarPromedio(promedios, i, prom);
        }
        System.out.println("\nLa cantidad de alumnos aprobados es: " + aprueban(promedios, 1));  // 1 = contar los que aprueban, 0 = contar los que no aprueban
        System.out.println("\nLa cantidad de alumnos no aprobados es: " + aprueban(promedios, 0));  // 1 = contar los que aprueban, 0 = contar los que no aprueban
        System.out.println("");

    }

    public static double calculaPromedio() {
        Scanner read = new Scanner(System.in);
        double pr = 0, nota ;
        do {
            System.out.print("Ingrese nota primer trabajo práctico evaluativo:  ");
            nota = read.nextDouble();
            pr += nota * 0.10;
        } while (nota < 0 || nota > 10);
        nota = 0;
        do {
            System.out.print("Ingrese nota segundo trabajo práctico evaluativo:  ");
            nota = read.nextDouble();
            pr += nota * 0.15;
        } while (nota < 0 || nota > 10);
        nota = 0;
        do {
            System.out.print("Ingrese nota primer trabajo integrador:  ");
            nota = read.nextDouble();
            pr += nota * 0.25;
        } while (nota < 0 || nota > 10);
        nota = 0;
        do {
            System.out.print("Ingrese nota segundo trabajo integrador:  ");
            nota = read.nextDouble();
            pr += nota * 0.50;
        } while (nota < 0 || nota > 10);

        return pr;
    }

    public static void llenarPromedio(double[] alumn, int i, double prome) {
        alumn[i] = prome;
    }

    public static int aprueban(double[] alum, int apr) {
        int n = 0;
        for (int i = 0; i < alum.length; ++i) {
            if ((apr == 1) && (alum[i] >= 7)) {
                ++n;
            } else if (apr == 0 && alum[i] < 7) {
                ++n;
            }
        }
        return n;
    }

}
