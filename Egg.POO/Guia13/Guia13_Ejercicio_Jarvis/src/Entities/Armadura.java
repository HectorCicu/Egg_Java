package Entities;

import Enum.ColoresArmadura;

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
    private Integer pulsoredGuanteDerecho;
    private Integer pulsoredGuanteIzquierdo;
    private Integer pulsoredBotaDerecha;
    private Integer pulsoredBotaIzquierda;
    private Integer resistenciaArmadura;
    private Integer saludArmadura;
    private Integer consolaArmadura;
    private Integer sintetizadorArmadura;

    public Armadura() {
    }

    public Armadura(ColoresArmadura colorPrimario, ColoresArmadura colorSecundario, Integer pulsoredGuanteDerecho, Integer pulsoredGuanteIzquierdo, Integer pulsoredBotaDerecha, Integer pulsoredBotaIzquierda, Integer resistenciaArmadura, Integer saludArmadura, Integer consolaArmadura, Integer sintetizadorArmadura) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.pulsoredGuanteDerecho = pulsoredGuanteDerecho;
        this.pulsoredGuanteIzquierdo = pulsoredGuanteIzquierdo;
        this.pulsoredBotaDerecha = pulsoredBotaDerecha;
        this.pulsoredBotaIzquierda = pulsoredBotaIzquierda;
        this.resistenciaArmadura = resistenciaArmadura;
        this.saludArmadura = saludArmadura;
        this.consolaArmadura = consolaArmadura;
        this.sintetizadorArmadura = sintetizadorArmadura;
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

    public Integer getPulsoredGuanteDerecho() {
        return pulsoredGuanteDerecho;
    }

    public void setPulsoredGuanteDerecho(Integer pulsoredGuanteDerecho) {
        this.pulsoredGuanteDerecho = pulsoredGuanteDerecho;
    }

    public Integer getPulsoredGuanteIzquierdo() {
        return pulsoredGuanteIzquierdo;
    }

    public void setPulsoredGuanteIzquierdo(Integer pulsoredGuanteIzquierdo) {
        this.pulsoredGuanteIzquierdo = pulsoredGuanteIzquierdo;
    }

    public Integer getPulsoredBotaDerecha() {
        return pulsoredBotaDerecha;
    }

    public void setPulsoredBotaDerecha(Integer pulsoredBotaDerecha) {
        if (pulsoredBotaDerecha < 0) {
            throw new RuntimeException("No puede tener pulsored negativo: ");
        }
        this.pulsoredBotaDerecha = pulsoredBotaDerecha;
    }

    public Integer getPulsoredBotaIzquierda() {
        return pulsoredBotaIzquierda;
    }

    public void setPulsoredBotaIzquierda(Integer pulsoredBotaIzquierda) {
        if (pulsoredBotaIzquierda < 0) {
            throw new RuntimeException("No puede tener pulsored negativo: ");
        }
        this.pulsoredBotaIzquierda = pulsoredBotaIzquierda;
    }

    public Integer getResistenciaArmadura() {
        return resistenciaArmadura;
    }

    public void setResistenciaArmadura(Integer resistenciaArmadura) {
        this.resistenciaArmadura = resistenciaArmadura;
    }

    public Integer getSaludArmadura() {
        return saludArmadura;
    }

    public void setSaludArmadura(Integer saludArmadura) {
        this.saludArmadura = saludArmadura;
    }

    public Integer getConsolaArmadura() {
        return consolaArmadura;
    }

    public void setConsolaArmadura(Integer consolaArmadura) {
        this.consolaArmadura = consolaArmadura;
    }

    public Integer getSintetizadorArmadura() {
        return sintetizadorArmadura;
    }

    public void setSintetizadorArmadura(Integer sintetizadorArmadura) {
        this.sintetizadorArmadura = sintetizadorArmadura;
    }

}
