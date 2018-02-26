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
public class Animal {
    // Caracteristicas
    private final String raza;
    private int edad = -1;
    private final String color;
    private String nombre;    

    // Comportamientos
    public Animal (String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
    
    public Animal (String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.nombre = "Sin Nombre";
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

    @Override
    public String toString () {
        return "Raza: " + raza + " - Color: " + color
                + " - Nombre: " + nombre + " - Edad: " + edad;       
    }

}
