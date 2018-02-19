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
public class Gato {
    // Caracteristicas
    final static int PATAS = 4;
    private String raza;
    private String color;
    private String nombre;
    
    // Comportamientos
    public Gato (String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
    
    public Gato (String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.nombre = "Sin Nombre";
    }

    public void Ronrronear () {
        System.out.println("Miiaauu!!!");
    }
    
    public String getRaza () {
        return raza;
    }
    
    public void setRaza (String raza) {
        this.raza = raza;
    }
    
    public String getColor () {
        return color;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
}
