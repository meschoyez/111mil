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
public class Canario {
    // Caracteristicas
    final static int PATAS = 2;
    final static int ALAS = 2;
    private String raza;
    private int edad;
    private String color;
    private String nombre;
    private boolean habla;

    // Comportamientos
    public Canario (String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
    
    public Canario (String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.nombre = "Sin Nombre";
    }

    public void Trina (String frase) {
        System.out.println("Prriiii!!!");
    }
    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the habla
     */
    public boolean isHabla() {
        return habla;
    }

    /**
     * @param habla the habla to set
     */
    public void setHabla(boolean habla) {
        this.habla = habla;
    }
    
    
}
