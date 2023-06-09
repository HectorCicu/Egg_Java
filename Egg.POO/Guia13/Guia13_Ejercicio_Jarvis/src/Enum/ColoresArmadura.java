package Enum;

import java.util.Objects;

/**
 *
 * @author Temporal
 */
public enum ColoresArmadura {
    BLANCO(1),
    NEGRO(2),
    ROJO(3),
    AZUL(4),
    GRIS(5),
    VERDE(6),
    AMARILLO(7),
    MARRON(8),
    CELESTE(9),
    PLATEADO(10),
    DORADO(11);

    private Integer color;

    ColoresArmadura(Integer color) {
        this.color = color;
    }

    public Integer getColor() {
        return color;
    }

    public static ColoresArmadura obtenerColor(Integer c) {
        for (ColoresArmadura cc : ColoresArmadura.values()) {
            if (Objects.equals(cc.getColor(), c)) {
                return cc;
            }
        }
        return null;
    }
}
