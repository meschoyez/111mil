/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author meschoyez
 */
public class EjemploFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JugarConFechas f = new JugarConFechas();
        f.MostrarFechas();
        f.CrearFecha(16, 5, 2018);
        f.MostrarFechas();
        f.CrearFecha(14, 3, 2018, 17, 30);
        f.MostrarFechas();
        f.IncrementarFecha(15);
        f.MostrarFechas();
        f.IncrementarFecha(45);
        f.MostrarFechas();
        f.IncrementarFecha(3600);
        f.MostrarFechas();
        f.DateACalendar();
        f.MostrarFechas();
    }
    
}
