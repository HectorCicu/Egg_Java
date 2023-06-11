package Entities;

import Enums.ColoresArmadura;

/**
 * Las armaduras de Stark se encuentran definidas por un color primario y un
 * color secundario. Se encuentran compuestas de dos propulsored, uno en cada
 * bota; y dos repulsores, uno en cada guante (los repulsores se utilizan
 * también como armas). Tony los utiliza en su conjunto para volar. La armadura
 * tiene un nivel de resistencia, que depende del material con el que está
 * fabricada, y se mide con un número entero cuya unidad de medida de dureza es
 * Rockwell (https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras
 * poseen un nivel de salud el cual se mide de 0 a 100. Además, Tony tiene un
 * generador, el cual le sirve para salvarle la vida en cada instante de tiempo
 * alejando las metrallas de metal de su corazón y también para alimentar de
 * energía a la armadura. La batería a pesar de estar en el pecho de Tony, es
 * considerada como parte de la armadura. La armadura también posee una consola
 * en el casco, a través de la cual JARVIS le escribe información a Iron Man. En
 * el casco también se encuentra un sintetizador por donde JARVIS susurra cosas
 * al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
 * consola y sintetizador) tienen un consumo de energía asociado. En esta
 * primera etapa con una armadura podremos: caminar, correr, propulsar
 *
 * @author Hector Cicutti
 */
public class Armadura {

    private ColoresArmadura colorPrimario;
    private ColoresArmadura colorSecundario;
    private Float repulsorGuanteDerecho;
    private Float repulsorGuanteIzquierdo;
    private Float pulsoredBotaDerecha;
    private Float pulsoredBotaIzquierda;
    private Float resistenciaArmadura;
    private Float saludArmadura;
    private Float consolaArmadura;
    private Float sintetizadorArmadura;
    private final Float reactor = Float.MAX_VALUE;
    private Float bateria;

    public Armadura() {
        }

    public Armadura(ColoresArmadura colorPrimario, ColoresArmadura colorSecundario, Float repulsorGuanteDerecho, Float repulsorGuanteIzquierdo, Float pulsoredBotaDerecha, Float pulsoredBotaIzquierda, Float resistenciaArmadura, Float saludArmadura, Float consolaArmadura, Float sintetizadorArmadura, Float bateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.repulsorGuanteDerecho = repulsorGuanteDerecho;
        this.repulsorGuanteIzquierdo = repulsorGuanteIzquierdo;
        this.pulsoredBotaDerecha = pulsoredBotaDerecha;
        this.pulsoredBotaIzquierda = pulsoredBotaIzquierda;
        this.resistenciaArmadura = resistenciaArmadura;
        this.saludArmadura = saludArmadura;
        this.consolaArmadura = consolaArmadura;
        this.sintetizadorArmadura = sintetizadorArmadura;
        this.bateria = bateria;
    }

    public ColoresArmadura getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(ColoresArmadura colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public ColoresArmadura getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(ColoresArmadura colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Float getRepulsorGuanteDerecho() {
        return repulsorGuanteDerecho;
    }

    public void setRepulsorGuanteDerecho(Float repulsorGuanteDerecho) {
        this.repulsorGuanteDerecho = repulsorGuanteDerecho;
    }

    public Float getRepulsorGuanteIzquierdo() {
        return repulsorGuanteIzquierdo;
    }

    public void setRepulsorGuanteIzquierdo(Float repulsorGuanteIzquierdo) {
        this.repulsorGuanteIzquierdo = repulsorGuanteIzquierdo;
    }

    public Float getPulsoredBotaDerecha() {
        return pulsoredBotaDerecha;
    }

    public void setPulsoredBotaDerecha(Float pulsoredBotaDerecha) {
        this.pulsoredBotaDerecha = pulsoredBotaDerecha;
    }

    public Float getPulsoredBotaIzquierda() {
        return pulsoredBotaIzquierda;
    }

    public void setPulsoredBotaIzquierda(Float pulsoredBotaIzquierda) {
        this.pulsoredBotaIzquierda = pulsoredBotaIzquierda;
    }

    public Float getResistenciaArmadura() {
        return resistenciaArmadura;
    }

    public void setResistenciaArmadura(Float resistenciaArmadura) {
        this.resistenciaArmadura = resistenciaArmadura;
    }

    public Float getSaludArmadura() {
        return saludArmadura;
    }

    public void setSaludArmadura(Float saludArmadura) {
        this.saludArmadura = saludArmadura;
    }

    public Float getConsolaArmadura() {
        return consolaArmadura;
    }

    public void setConsolaArmadura(Float consolaArmadura) {
        this.consolaArmadura = consolaArmadura;
    }

    public Float getSintetizadorArmadura() {
        return sintetizadorArmadura;
    }

    public void setSintetizadorArmadura(Float sintetizadorArmadura) {
        this.sintetizadorArmadura = sintetizadorArmadura;
    }

    public Float getBateria() {
        return bateria;
    }

    public void setBateria(Float bateria) {
        this.bateria = bateria;
    }

    /**
     *
     * @return valor máximo del reactor (Float)
     */
    public Float getReactor() {
        return reactor;
    }
    

}