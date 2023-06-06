/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

import java.util.Objects;

/**
 *
 * @author HectorCicutti
 */
public enum EstadosCivil {
    CASADO("Casado/a", 1),
    SOLTERO("Soltero/a", 2),
    DIVORCIADO("Divorciado/a", 3),
    VIUDO("Viudo/a", 4);

    private String estadoCivil;
    private int clave;

    private EstadosCivil(String estadoCivil, int clave) {
        this.estadoCivil = estadoCivil;
        this.clave = clave;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public int getClave() {
        return clave;
    }

    public static String obtenerEstadoCivil(int c) {
        for (EstadosCivil e : EstadosCivil.values()) {
            if (Objects.equals(e.getClave(), c)) {
                return e.getEstadoCivil();
            }
        }
        return null;
    }
}
