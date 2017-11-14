/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colasconlistas;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class ColasConListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;

        Scanner teclado = new Scanner(System.in);

        LinkedList<String> fila;
        fila = new LinkedList<>();
        
        for (int n = 0; n < 5; n++) {
            System.out.print("Ingrese un nombre: ");
            nombre = teclado.nextLine();
            fila.add(nombre);
        }
        while (fila.size() > 0) {
            String quitado;
            quitado = fila.remove();
            System.out.println(quitado);
        }
    
           
    }
    
}
