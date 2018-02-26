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
public class Caballo extends Animal {
    final static int PATAS = 4;
    
    // Comportamientos
    public Caballo (String raza, String color, String nombre) {
        super(raza, color, nombre);
        
    }
    
    public Caballo (String raza, String color) {
        super(raza, color);
    }
    
    public void Relinchar () {
        System.out.println("Hiiiiihhhiiiiii!!!");
    }
    
}
