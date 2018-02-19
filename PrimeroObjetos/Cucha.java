/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Veterinaria;

/**
 *
 * @author meschoyez
 */
public class Cucha {
    private final Material material;
    private boolean ocupado;
    private String dueno;
    private final Tamano tamano;
    private String color;
    private String origen;
    
    public Cucha () {
        dueno = null;
        material = Material.MADERA;
        ocupado = false;
        tamano = Tamano.MEDIANO;
    }
    
    public Cucha (Material material, boolean ocupado,
                   String dueno, Tamano tamano) {
        this.dueno = dueno;
        this.material = material;
        this.ocupado = ocupado;
        this.tamano = tamano;
    }

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * @return the dueno
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * @return the tamano
     */
    public Tamano getTamano() {
        return tamano;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
