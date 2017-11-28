/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mapassimples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author meschoyez
 */
public class MapasSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<String, Integer> arbol;
        HashMap<String, Integer> mapa;
        
        arbol = new TreeMap<>();
        mapa = new HashMap<>();
        
        
        arbol.put("Primero", 1);
        arbol.put("Segundo", 2);
        arbol.put("Tercero", 3);
        arbol.put("Cuarto", 4);
        
        mapa.put("Primero", 1);
        mapa.put("Segundo", 2);
        mapa.put("Tercero", 3);
        mapa.put("Cuarto", 4);
        
        boolean respuesta;
        respuesta = arbol.containsValue(6);
            
        respuesta = arbol.containsValue(2);
            
        respuesta = mapa.containsValue(2);
        
        ArrayList<String> claves;
        claves = new ArrayList<>(arbol.keySet());
        for (String k : claves) {
            System.out.println(k);
            System.out.println(arbol.get(k));
        }
    }
}

