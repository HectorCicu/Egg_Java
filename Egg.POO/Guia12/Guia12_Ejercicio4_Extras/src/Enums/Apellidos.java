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
public enum Apellidos {
    García(1),
    González(2),
    Rodríguez(3),
    Fernández(4),
    López(5),
    Martínez(6),
    Sánchez(7),
    Pérez(8),
    Gómez(9),
    Flores(10),
    Jiménez(11),
    Ruiz(12),
    Romero(13),
    Hernández(14),
    Torres(15),
    Díaz(16),
    Álvarez(17),
    Moreno(18),
    Ortiz(19),
    Reyes(20),
    Medina(21),
    Vargas(22),
    Castro(23),
    Ramírez(24),
    Molina(25),
    Morales(26),
    Ramos(27),
    Navarro(28),
    Gutiérrez(29),
    Núñez(30),
    Cabral(31),
    Rossi(32),
    Ricci(33),
    Ferrari(34),
    Esposito(35),
    Bianchi(36),
    Romano(37),
    Lombardi(38),
    Moretti(39),
    Greco(40),
    Marino(41),
    Giordano(42),
    Rizzo(43),
    Conti(44),
    DeLuca(45),
    Russo(46),
    Santoro(47),
    Lombardo(48),
    Caruso(49),
    Vitale(50),
    Parisi(51),
    Fontana(52),
    Giuseppe(53),
    Amato(54),
    Ferrara(55),
    Bruno(56),
    Valentini(57),
    Martini(58),
    Monti(59),
    Palumbo(60),
    Silvestri(61);

    private int clave;

    private Apellidos(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public static String obtenerApellido(int c) {

        for (Apellidos ape : Apellidos.values()) {
            if (Objects.equals(ape.getClave(), c)) {
                return String.valueOf(ape);
            }
        }
        return null;

    }

}
