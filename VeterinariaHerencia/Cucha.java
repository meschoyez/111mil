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
public class Cucha extends Hogar {
    
    public Cucha () {
        super(Material.MADERA, Tamano.MEDIANO,
                "madera", false, null);
    }
    
    public Cucha (Material material, Tamano tamano,
                  String color, boolean ocupado,
                   String dueno) {
        super(material, tamano, color, ocupado, dueno);
    }

    @Override
    public String toString () {
        return "-CUCHA- " + super.toString();
    }
    
}
