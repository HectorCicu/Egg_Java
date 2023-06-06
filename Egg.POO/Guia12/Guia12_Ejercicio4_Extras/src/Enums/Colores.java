package Enums;

import java.util.Objects;

/**
 *
 * @author Temporal
 */
public enum Colores {
    BLANCO(1),
    NEGRO(2),
    ROJO(3),
    AZUL(4),
    GRIS(5);

    private Integer color;

    Colores(Integer color) {
        this.color = color;
    }

    public Integer getColor() {
        return color;
    }

    public static Colores obtenerColor(Integer c) {
        for (Colores cc : Colores.values()) {
            if (Objects.equals(cc.getColor(), c)) {
                return cc;
            }
        }
        return null;
    }
}
