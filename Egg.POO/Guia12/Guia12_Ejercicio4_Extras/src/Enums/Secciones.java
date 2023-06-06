/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author HectorCicutti
 */
public enum Secciones {
    Biblioteca("Biblioteca", 1),
    Secretaría_académica("Secretaría académica", 2),
    Servicio_de_atención_al_estudiante("Servicio de atención al estudiante", 3),
    Administración_y_finanzas("Administración y finanzas", 4),
    Recursos_humanos("Recursos humanos", 5),
    Departamento_de_informática("Departamento de informática", 6),
    Laboratorios_de_investigación("Laboratorios de investigación", 7),
    Mantenimiento_y_limpieza("Mantenimiento y limpieza", 8),
    Departamento_de_compras("Departamento de compras", 9),
    Archivo_y_documentación("Archivo y documentación", 10),
    Servicio_de_seguridad("Servicio de seguridad", 11),
    Departamento_de_deportes("Departamento de deportes", 12),
    Oficina_de_relaciones_internacionales("Oficina de relaciones internacionales", 13),
    Unidad_de_prácticas_preprofesionales("Unidad de prácticas pre-profesionales", 14),
    Servicio_de_salud_estudiantil("Servicio de salud estudiantil", 15),
    Departamento_de_eventos_y_protocolo("Departamento de eventos y protocolo", 16),
    Servicio_de_transporte("Servicio de transporte", 17),
    Departamento_de_comunicación_y_prensa("Departamento de comunicación y prensa", 18),
    Oficina_de_alumni_y_desarrollo("Oficina de alumni y desarrollo", 19),
    Unidad_de_proyectos_especiales("Unidad de proyectos especiales", 20);

private String seccion;
    private int clave;

    private Secciones() {
    }

    private Secciones(String seccion, int clave) {
        this.seccion = seccion;
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

}
