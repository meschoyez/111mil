/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebapilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author meschoyez
 */
public class PruebaPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;

        Scanner teclado = new Scanner(System.in);

        Stack<String> miPila;
        miPila = new Stack<>();
        
        for (int n = 0; n < 5; n++) {
            System.out.print("Ingrese un nombre: ");
            nombre = teclado.nextLine();
            miPila.push(nombre);
        }
        while (!miPila.empty()) {
            String quitado;
            quitado = miPila.pop();
            System.out.println(quitado);
        }
    
    }
    
}
