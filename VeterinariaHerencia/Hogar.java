/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veterinariaherencia;

/**
 *
 * @author meschoyez
 */
public class Hogar {
    private final Material material;
    private boolean ocupado;
    private String dueno;
    private final Tamano tamano;
    private final String color;
    private String origen;    

    public Hogar (Material material, Tamano tamano,
                  String color, boolean ocupado,
                   String dueno) {
        this.dueno = dueno;
        this.material = material;
        this.ocupado = ocupado;
        this.tamano = tamano;
        this.color = color;
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

    @Override
    public String toString () {
        String inicio = "Material: " + material + " - Tamaño: "
                + tamano + " - Color: " + color;
        String fin;
        if (ocupado) {
            fin = " - " + dueno + " está dentro";
        }
        else {
            fin = " - Está vacía";
        }
        return inicio + fin;
    }



}
