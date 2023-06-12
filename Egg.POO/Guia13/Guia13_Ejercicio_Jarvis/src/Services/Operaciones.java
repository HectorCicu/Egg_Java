package Services;

import Entities.Armadura;
import Enums.ColoresArmadura;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Cicutti
 */
public class Operaciones {

    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static final DecimalFormat df = new DecimalFormat("###,###,###,###,###,###.00");
    public static final Float simple = 1F;
    public static final Float doble = 2f * simple;
    public static final Float triple = 3f * simple;
    public static final Float consumoBota = 100000000000000000000000000000000F;
    public static final Float consumoGuante = 1.2F * consumoBota;
    public static final Float consumoSintetizador = 0.6F * consumoBota;
    public static final Float consumoConsola = 0.5F * consumoBota;
    private static Armadura jarv;
    public static Random rand = new Random();

    //private static Armadura jarvis = new Armadura();
    /**
     * uso de las botas, según la operación que realice, será el factor que se
     * le pase
     *
     * @param jarv
     * @param minutos
     * @param factor
     * @throws Exception
     */
    public static void usarBotas(Armadura jarv, Float minutos, Float factor) throws Exception {

        Float bd = energiaBotaDerecha(jarv, consumoBota, minutos, factor);
        Float bi = energiaBotaIzquierda(jarv, consumoBota, minutos, factor);

        consumoBateria(jarv, (bd + bi));
        System.out.println("Se ha consumido " + df.format(bd + bi) + " de Energía de las botas");
    }

    public static void usarGuantes(Armadura jarv, Float minutos, Float factor) throws Exception {

        Float bd = energiaGuanteDerecho(jarv, consumoGuante, minutos, factor);
        Float bi = energiaGuanteIzquierdo(jarv, consumoGuante, minutos, factor);

        consumoBateria(jarv, (bd + bi));
        System.out.println("Se ha consumido " + df.format(bd + bi) + " de Energía de los guantes");
    }

    /**
     *
     * @throws java.lang.Exception
     */
    public static void operaciones() throws Exception {
        boolean salir = false;
        int opc = 0;
        Float minutos = 0F;
        do {
            System.out.println("""
                           OPERACIONES
                           --------------------
                           1) -  Crear Jarvis
                           2) -  Correr
                           3) -  Caminar
                           4) -  Propulsarse
                           5) -  Volar
                           6)-  Ver estado Batería
                            
                           Opcion: .""");
            try {
                opc = read.nextInt();
            } catch (NumberFormatException | InputMismatchException nfe) {
                JOptionPane.showMessageDialog(null, "Está tratando de ingresar un caracter no válido");
                System.out.println("Está tratando de ingresar un caracter no válido");
                read.next();
            }
            switch (opc) {
                case 1 -> {
                    crearJarvis();
                }
                case 2 -> {
                    System.out.print("Ingrese minutos de actividad: ");
                    try {
                        minutos = read.nextFloat();
                        usarBotas(jarv, minutos, simple);
                        
                    } catch (NumberFormatException | InputMismatchException nfe) {
                        JOptionPane.showMessageDialog(null, "Está tratando de ingresar un caracter no válido");
                        //System.out.println("Está tratando de ingrear un caracter no válido");
                        //   read.next();
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese minutos de actividad: ");
                    try {
                        minutos = read.nextFloat();
                        usarBotas(jarv, minutos, doble);
                    } catch (NumberFormatException | InputMismatchException nfe) {
                        JOptionPane.showMessageDialog(null, "Está tratando de ingresar un caracter no válido");
                        //System.out.println("Está tratando de ingrear un caracter no válido");
                        //      read.next();
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese minutos de actividad: ");
                    try {
                        minutos = read.nextFloat();
                        usarBotas(jarv, minutos, triple);
                    } catch (NumberFormatException | InputMismatchException nfe) {
                        JOptionPane.showMessageDialog(null, "Está tratando de ingresar un caracter no válido");
                        //System.out.println("Está tratando de ingrear un caracter no válido");
                        //      read.next();
                    }
                }
                case 5 -> {
                    System.out.print("Ingrese minutos de actividad: ");
                    try {
                        minutos = read.nextFloat();
                        usarBotas(jarv, minutos, triple);
                        usarGuantes(jarv, minutos, doble);
                    } catch (NumberFormatException | InputMismatchException nfe) {
                        JOptionPane.showMessageDialog(null, "Está tratando de ingresar un caracter no válido");
                        //System.out.println("Está tratando de ingrear un caracter no válido");
                        //  read.next();
                    }
                }
                case 6 -> {
                    estadoBateria(jarv);
                }
                case 7 -> {
                    salir = true;
                }
                default -> {
                    System.out.println("Selección incorrecta - intente nuevamente");
                }

            }

        } while (!salir);
    }

    public static void crearJarvis() {

        jarv = new Armadura(ColoresArmadura.obtenerColor(rand.nextInt(1, 12)), ColoresArmadura.obtenerColor(rand.nextInt(1, 12)), 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F);
    }

    public static void consumoBateria(Armadura jarv, Float cons) {
        jarv.setBateria(jarv.getBateria() - cons);
    }

    public static Float energiaGuanteDerecho(Armadura jarv, Float consumo, Float minutos, Float factor) {
        jarv.setRepulsorGuanteDerecho(jarv.getRepulsorGuanteDerecho() - (consumo * factor * minutos));
        return (consumo * factor * minutos);
    }

    public static Float energiaGuanteIzquierdo(Armadura jarv, Float consumo, Float minutos, Float factor) {
        jarv.setRepulsorGuanteDerecho(jarv.getRepulsorGuanteIzquierdo() - (consumo * factor * minutos));
        return (consumo * factor * minutos);
    }

    public static Float energiaBotaIzquierda(Armadura jarv, Float consumo, Float minutos, Float factor) {
        jarv.setPulsoredBotaIzquierda(jarv.getPulsoredBotaIzquierda() - (consumo * factor * minutos));
        return (consumo * factor * minutos);
    }

    public static Float energiaBotaDerecha(Armadura jarv, Float consumo, Float minutos, Float factor) {
        jarv.setPulsoredBotaDerecha(jarv.getPulsoredBotaDerecha() - (consumo * factor * minutos));
        return (consumo * factor * minutos);
    }

    public static void estadoBateria(Armadura jarv) {
        Float estadobat = jarv.getBateria() / jarv.getReactor() * 100;
        System.out.println("Bateria " + jarv.getBateria());
        System.out.println("Reactor " + jarv.getReactor());
        System.out.println("El estado de la batería es " + estadobat + "%");

    }
}
