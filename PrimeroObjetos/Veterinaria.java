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
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loro miLoro;
        miLoro = new Loro("barranquero", "verde");
        System.out.println(miLoro);
        
        Perro miPerro;
        miPerro = new Perro("terrbald", "marron", "Toby");
        Perro otroPerro;
        otroPerro = new Perro("cordubensis", "negro");
        
        Gato unGato;
        unGato = new Gato("peludo", "gris");
        
        miPerro.Ladrar();
        System.out.println(miPerro.getRaza());
        System.out.println(miPerro.getColor());

        unGato.Ronrronear();
        System.out.println(unGato.getRaza());
        System.out.println(unGato.getColor());

        otroPerro.Ladrar();
        System.out.println(otroPerro.getRaza());
        System.out.println(otroPerro.getColor());
    
        Cucha miCucha;
        miCucha = new Cucha();
        
        System.out.println(miCucha);
        System.out.println("Mi perro se llama " + 
                miPerro.getNombre() +
                " y tiene una cucha de " +
                miCucha.getMaterial());
    }
    
}
