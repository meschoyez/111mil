/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistejemplo;

import java.util.ArrayList;

/**
 *
 * @author meschoyez
 */
public class ArrayListEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer>datos;
        datos = new ArrayList<>();
        
        System.out.println("Size = " + datos.size());
        for (int p = 10; p > 0; p--) {
            datos.add(p);
        }
        System.out.println("Size = " + datos.size());
        datos.add(5, 101);
        System.out.println("Size = " + datos.size());
        datos.set(5, -1);
        System.out.println("Size = " + datos.size());
        
        System.out.println("Pos 5 = " + datos.get(5));
        System.out.println("Pos 2 = " + datos.get(2));
        
        datos.remove(5);
        System.out.println("Size = " + datos.size());
        System.out.println("Pos 5 = " + datos.get(5));
        
        System.out.println("Datos de la Lista");
        for (int p = 0; p < datos.size(); p++) {
            System.out.println("Dato " + p + " = " + datos.get(p));
        }
        
        System.out.println("Datos sin posicion de la Lista");
        // for each -> para recorrer colecciones
        for (Integer p : datos) {
            System.out.println("Dato = " + p);
        }
        
    }
    
}
