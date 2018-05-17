/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author meschoyez
 */
public class JugarConFechas {
    Date unaFecha, otraFecha;
    GregorianCalendar fechaGreg;

    /**
     * Constructor for objects of class JugarConFechas
     */
    public JugarConFechas()
    {
    }

    void CrearFecha (int dia, int mes, int anio) {
        fechaGreg = new GregorianCalendar(anio, mes, dia);
        otraFecha = fechaGreg.getTime();
    }
    
    void CrearFecha (int dia, int mes, int anio, int hora, int minuto) {
        fechaGreg = new GregorianCalendar(anio, mes, dia, hora, minuto);
        unaFecha = fechaGreg.getTime();
    }
    
    void IncrementarFecha (int minutos) {
        fechaGreg.add(Calendar.MINUTE, minutos);
        unaFecha = fechaGreg.getTime();
    }
 
    void DateACalendar () {
        fechaGreg.setTime(otraFecha);
    }
    
    void MostrarFechas () {
        System.out.println("unaFecha (Date) -> " + unaFecha);
        System.out.println("fechaGreg -> " + fechaGreg);
        System.out.println("");
    }
    
}
