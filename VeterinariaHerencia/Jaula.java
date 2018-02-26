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
public class Jaula extends Hogar {
    private boolean incluyeAccesorios;
    
    public Jaula () {
        super(Material.METAL, Tamano.MEDIANO,
                "blanco", false, null);
        incluyeAccesorios = false;
    }
    
    public Jaula (Material material, Tamano tamano,
                  String color, boolean ocupado,
                   String dueno, boolean accesorios) {
        super(material, tamano, color, ocupado, dueno);
        incluyeAccesorios = accesorios;
    }

    /**
     * @return the incluyeAccesorios
     */
    public boolean isIncluyeAccesorios() {
        return incluyeAccesorios;
    }

    /**
     * @param incluyeAccesorios the incluyeAccesorios to set
     */
    public void setIncluyeAccesorios(boolean incluyeAccesorios) {
        this.incluyeAccesorios = incluyeAccesorios;
    }

}
