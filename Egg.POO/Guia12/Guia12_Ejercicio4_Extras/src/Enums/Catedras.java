

package Enums;

import java.util.Objects;

/**
 *
 * @author HectorCicutti
 */
public enum Catedras {
    
Análisis_Matemático("Análisis Matemático",1),
Historia_de_la_Filosofía("Historia de la Filosofía",2),
Derecho_Civil("Derecho Civil",3),
Física_Nuclear("Física Nuclear",4),
Microbiología("Microbiología",5),
Comunicación_Audiovisual("Comunicación Audiovisual",6),
Marketing_Estratégico("Marketing Estratégico",7),
Historia_del_Arte("Historia del Arte",8),
Bioquímica("Bioquímica",9),
Arquitectura_Sustentable("Arquitectura Sustentable",10),
Psicología_Social("Psicología Social",11),
Diseño_Gráfico_Digital("Diseño Gráfico Digital",12),
Teoría_de_la_Literatura("Teoría de la Literatura",13),
Comunicación_Política("Comunicación Política",14),
Ingeniería_de_Software("Ingeniería de Software",15),
Diseño_de_Interiores("Diseño de Interiores",16),
Economía_Internacional("Economía Internacional",17),
Política_Comparada("Política Comparada",18),
Gestión_de_Proyectos("Gestión de Proyectos",19),
Sociología_de_la_Educación("Sociología de la Educación",20),;


private int clave;
private String nombre;
    private Catedras() {
    }

    private Catedras( String nombre,int clave) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }


    
   public static Catedras obtenerCatedras(int c) {
        for (Catedras cc : Catedras.values()) {
            if (Objects.equals(cc.getClave(), c)) {
                return cc;
            }
        }
        return null;
    }
}
