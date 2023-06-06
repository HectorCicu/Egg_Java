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
public enum Nombres {
Sofía(1),
Daniel(2),
Valentina(3),
Alejandro(4),
Isabella(5),
Diego(6),
Camila(7),
Juan(8),
Ana(9),
Carlos(10),
Natalia(11),
David(12),
Lucía(13),
Andrés(14),
Martina(15),
Luis(16),
Gabriela(17),
Javier(18),
Mariana(19),
Franco(20),
Andrea(21),
José(22),
Paula(23),
Francisco(24),
Victoria(25),
Miguel(26),
Elena(27),
Pablo(28),
Claudia(29),
Antonio(30),
Laura(31),
Ignacio(32),
Jimena(33),
Emilio(34),
Lorena(35),
Samuel(36),
Carla(37),
Raúl(38),
Daniela(39),
Sergio(40),
Fernanda(41),
Alfonso(42),
Rosa(43),
Aurelio(44),
Marta(45),
Marco(46),
Isadora(47),
Fernando(48),
Anaís(49),
Ángel(50),
Belén(51),
Rafael(52),
Valeria(53),
Guillermo(54),
Carmen(55),
Mario(56),
Loreto(57),
Joaquín(58),
Javiera(59),
Nicolás(60);
private int clave;

    private Nombres() {
    }

    private Nombres(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

public static String obtenerNombre(int c) {
    for (Nombres n : Nombres.values()) {
        if (Objects.equals(n.getClave(),c))
            return String.valueOf(n);
    }
    return null;
}

}
