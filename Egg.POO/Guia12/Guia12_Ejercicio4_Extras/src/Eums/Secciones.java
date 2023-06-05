/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package Eums;

/**
 *
 * @author HectorCicutti
 */
public enum Secciones {
    BIBLIOTECA("Biblioteca"),
    DECANATO("Decanato"),
    SECRETARIA("secretaria"),;
    

    private String seccion;

    private Secciones() {
    }

    private Secciones(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
    
}
