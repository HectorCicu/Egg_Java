package Estancias.services;

import Estancias.entidades.Casas;
import Estancias.entidades.CasasComentarios;
import Estancias.persistencia.CasasDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hector Cicutti
 */
public class CasasService {

    private static CasasDAO cd = new CasasDAO();
    private static final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private static Date fdesde;
    private static Date fhasta;
    private static Integer dias;
    private static String pais;
    private static Collection<Casas> casa1 = null;
    private static Collection<CasasComentarios> casasCom = null;
    private static Casas casa = new Casas();
    private static CasasComentarios casaCom = new CasasComentarios();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void casasDisponiblesFechas() throws Exception {
        /* b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.*/

        try {

            System.out.println("CONSULTA  CASAS DISPONIBLES POR FECHA");
            System.out.print("Ingrese fecha desde (formato yyyy-mm-dd): ");
            String fechad = read.next();
            fdesde = sdf.parse(fechad);
            System.out.print("Ingrese fecha hasta (formato yyyy-mm-dd): ");
            String fechah = read.next();
            fhasta = sdf.parse(fechah);

            System.out.print("Ingrese País: ");
            pais = read.next();
            dias = 0;
            casa1 = new ArrayList();
            casa1.addAll(cd.consultarCasas(fdesde, fhasta, pais, dias));
            System.out.println("\n ID          -  Calle -   Nro  -  Cod.Postal - Ciudad  -  Pais  -  FechaDesde  -  FechaHasta -  Precio   - Tipo    -  T.min  -  T.max");
            for (Casas c : casa1) {
//                System.out.println(c.getIdCasa() + "  -  " + c.getCalle() + "  -  " + c.getNumero() + "  -  " + c.getCodPostal() + "  -  " + c.getCiudad() + "  -  "
//                        + c.getPais() + "  -  " + c.getFechaDesde() + "  -  " + c.getFechaHasta() + "  -  " + c.getPrecioHabitacion() + "  -  " + c.getTipoVivienda()
//                        + "  -  " + c.getTiempoMinimo() + "  -  " + c.getTiempoMaximo());
                System.out.println(String.format("%9s%20s%10s%10s%25s%25s%15s%12s%7.2f%15s%4s%4s",
                        c.getIdCasa(), c.getCalle(), c.getNumero(), c.getCodPostal(), c.getCiudad(),
                        c.getPais(), c.getFechaDesde(), c.getFechaHasta(), c.getPrecioHabitacion(),
                        c.getTipoVivienda(), c.getTiempoMinimo(), c.getTiempoMaximo()));
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void casasDisponiblesDias() throws Exception {
        /* d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.*/

        try {

            System.out.println("\nCONSULTA  CASAS DISPONIBLES POR DIAS");
            System.out.print("Ingrese fecha desde (formato yyyy-mm-dd): ");
            String fechad = read.next();
            fdesde = sdf.parse(fechad);
            fhasta = sdf.parse("2200-01-01");

            System.out.print("Ingrese Cantidad de Días disponibles: ");
            dias = read.nextInt();
            pais = "";
            casa1 = new ArrayList();
            casa1.addAll(cd.consultarCasas(fdesde, fhasta, pais, dias));
            System.out.println("\n ID          -  Calle -   Nro  -  Cod.Postal - Ciudad  -  Pais  -  FechaDesde  -  FechaHasta -  Precio   - Tipo    -  T.min  -  T.max");
            for (Casas c : casa1) {
//                System.out.println(c.getIdCasa() + "  -  " + c.getCalle() + "  -  " + c.getNumero() + "  -  " + c.getCodPostal() + "  -  " + c.getCiudad() + "  -  "
//                        + c.getPais() + "  -  " + c.getFechaDesde() + "  -  " + c.getFechaHasta() + "  -  " + c.getPrecioHabitacion() + "  -  " + c.getTipoVivienda()
//                        + "  -  " + c.getTiempoMinimo() + "  -  " + c.getTiempoMaximo());
                System.out.println(String.format("%9s%20s%10s%10s%25s%25s%15s%12s%7.2f%15s%4s%4s",
                        c.getIdCasa(), c.getCalle(), c.getNumero(), c.getCodPostal(), c.getCiudad(),
                        c.getPais(), c.getFechaDesde(), c.getFechaHasta(), c.getPrecioHabitacion(),
                        c.getTipoVivienda(), c.getTiempoMinimo(), c.getTiempoMaximo()));
            }

        } catch (Exception e) {
            throw e;
        }
    }

    /*h) Obtener el número de casas que existen para cada uno de los países diferentes.*/
    public void casasPorPais() throws Exception {
        try {

            System.out.println("\nCASAS POR PAIS");
            for (HashMap.Entry<String, Integer> entrada : cd.casasPorPais().entrySet()) {

                System.out.println("Pais: " + entrada.getKey() + "  -  Cant. Casas: " + entrada.getValue());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’. */
    public void casasLimpias() throws Exception {
        try {

            System.out.println("\nCASAS CON COMENTARIOS 'LIMPIA'");
            casasCom = new ArrayList();
            casasCom.addAll(cd.consutarLimpias());
            for (CasasComentarios casasc : casasCom) {
                //System.out.println(String.format("%8s%25s%8s%10s%20s%20s%90s",casasc.getIdCasa(),casasc.getCalle()), casasc.getNumero(),  casasc.getCodPostal(),casasc.getCiudad(),casasc.getPais(), casasc.getComentario()));
                System.out.println(String.format("%8s%25s%8s%10s%20s%20s%90s", casasc.getIdCasa(), casasc.getCalle(), casasc.getNumero(),
                        casasc.getCodPostal(), casasc.getCiudad(), casasc.getPais(), casasc.getComentario()));
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
