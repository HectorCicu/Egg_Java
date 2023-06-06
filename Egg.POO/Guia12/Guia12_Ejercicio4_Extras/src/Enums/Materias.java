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
public enum Materias {
Algebra("Álgebra",1),
Analisis_Matematico("Análisis Matemático",2),
Calculo("Cálculo",3),
Fisica("Física",4),
Quimica("Química",5),
Biologia("Biología",6),
Informatica("Informática",7),
Programacion("Programación",8),
Sistemas_Operativos("Sistemas Operativos",9),
Bases_de_Datos("Bases de Datos",10),
Redes_de_Computadoras("Redes de Computadoras",11),
Ingenieria_de_Software("Ingeniería de Software",12),
Inteligencia_Artificial("Inteligencia Artificial",13),
Robotica("Robótica",14),
Economia("Economía",15),
Contabilidad("Contabilidad",16),
Administracion_de_Empresas("Administración de Empresas",17),
Marketing("Marketing",18),
Recursos_Humanos("Recursos Humanos",19),
Finanzas("Finanzas",20),
Derecho("Derecho",21),
Ciencias_Politicas("Ciencias Políticas",22),
Sociologia("Sociología",23),
Antropologia("Antropología",24),
Psicologia("Psicología",25),
Pedagogia("Pedagogía",26),
Filosofia("Filosofía",27),
Historia("Historia",28),
Geografia("Geografía",29),
Literatura("Literatura",30),
Artes_Plasticas("Artes Plásticas",31),
Diseño_Grafico("Diseño Gráfico",32),
Arquitectura("Arquitectura",33),
Ingenieria_Civil("Ingeniería Civil",34),
Ingenieria_Mecanica("Ingeniería Mecánica",35),
Ingenieria_Electrica("Ingeniería Eléctrica",36),
Ingenieria_Electronica("Ingeniería Electrónica",37),
Ingenieria_Industrial("Ingeniería Industrial",38),
Medicina("Medicina",39),
Odontologia("Odontología",40);

private String materia;
private int clave;

    private Materias(String materia,int clave ) {
        this.clave = clave;
        this.materia = materia;
    }

    private Materias(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public static String obtenerMaterias(int c) {
        for (Materias m : Materias.values()) {
            if (Objects.equals(m.getClave(), c)) {
             return m.getMateria();   
            }
        }
        return null;
    }

}
